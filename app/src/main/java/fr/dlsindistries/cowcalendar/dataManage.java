package fr.dlsindistries.cowcalendar;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class dataManage extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "Evenement.db";
    private static final int DATABASE_VERSION = 1;


    public static final String TABLE_NAME_V = "EvtV";
    public static final String TABLE_NAME_I = "EvtI";
    public static final String KEY = "idEvt";
    public static final String NOM_EVT = "nomEvt";
    public static final String DATE_DEBUT = "dateDebut";
    public static final String DATE_CHALEUR = "dateChaleur";
    public static final String DATE_GESTATION = "dateGestation";
    public static final String TAG = "DATABASE";



    public static final String CREATE_TABLE_V = "CREATE TABLE " + TABLE_NAME_V + " ("+ KEY + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " + NOM_EVT + " VARCHAR(43) NOT NULL, " + DATE_DEBUT + " DATE NOT NULL, " +
            DATE_CHALEUR + " DATE NOT NULL, " + DATE_GESTATION + " DATE DEFAULT NULL" + ");";

    public static final String CREATE_TABLE_I = "CREATE TABLE " + TABLE_NAME_I + " ("+ KEY + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " + NOM_EVT + " VARCHAR(43) NOT NULL, " + DATE_DEBUT + " DATE NOT NULL, " +
            DATE_CHALEUR + " DATE NOT NULL, " + DATE_GESTATION + " DATE DEFAULT NULL" +");";


    public dataManage(Context context ) {
        super( context, DATABASE_NAME, null, DATABASE_VERSION );
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_V);
        db.execSQL(CREATE_TABLE_I);
        Log.i( TAG, "onCreate invoked" );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.i( TAG, "onUpgrade invoked" );
    }


    public void insertEvt(String nomEvt, String dateD, String dateC) {
        String INSERT = "INSERT INTO " + TABLE_NAME_V +"("+ NOM_EVT + ", "+ DATE_DEBUT +", "+ DATE_CHALEUR+ ") VALUES ('" + nomEvt + "', '" + dateD + "', '" + dateC + "');";
        this.getWritableDatabase().execSQL(INSERT);

        Log.i( TAG, "insertEvt invoked" );
    }


    public void updateGestation(String nomEvt, String dateG){
        nomEvt = nomEvt.replace( "'", "''" );
        String UPDATE = "UPDATE " + TABLE_NAME_V + " SET " + DATE_GESTATION + "='" + dateG + "' WHERE " + NOM_EVT + "='" + nomEvt + "';";
        Log.i("DEBUG_", UPDATE);
        this.getWritableDatabase().execSQL(UPDATE);
        Log.i( TAG, "updateGestation invoked" );
    }


    public void updateChaleur(String nomEvt, String dateC){
        nomEvt = nomEvt.replace( "'", "''" );
        String UPDATE = "UPDATE " + TABLE_NAME_V + " SET " + DATE_CHALEUR + "='" + dateC + "' WHERE " + NOM_EVT + "='" + nomEvt + "';";
        Log.i("DEBUG_", UPDATE);
        this.getWritableDatabase().execSQL(UPDATE);
        Log.i( TAG, "updateChaleur invoked" );
    }


    public List<EvtV> readByNom(String nE) {
        List<EvtV> evts = new ArrayList<>();
        String WHERE_CLAUSE = NOM_EVT + " = ?";
        String [] WHERE_ARGS = {nE};

        Cursor cursor = this.getReadableDatabase().query( TABLE_NAME_V,
                new String[] { KEY, NOM_EVT, DATE_DEBUT, DATE_CHALEUR, DATE_GESTATION },
                WHERE_CLAUSE, WHERE_ARGS, null, null, null, null );

        cursor.moveToFirst();

        while( ! cursor.isAfterLast() ) {
            EvtV evt = new EvtV( cursor.getLong(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4));
            evts.add(evt);
            cursor.moveToNext();
        }
        cursor.close();
        Log.i( TAG, "readByNom invoked" );

        return evts;
    }


    public EvtV readByTheName(String nE) {
        List<EvtV> evts = new ArrayList<>();
        String WHERE_CLAUSE = NOM_EVT + " = ?";
        String [] WHERE_ARGS = {nE};

        Cursor cursor = this.getReadableDatabase().query( TABLE_NAME_V,
                new String[] { KEY, NOM_EVT, DATE_DEBUT, DATE_CHALEUR, DATE_GESTATION },
                WHERE_CLAUSE, WHERE_ARGS, null, null, null, null );

        cursor.moveToFirst();

        EvtV event = null;

        while( ! cursor.isAfterLast() ) {
            EvtV evt = new EvtV( cursor.getLong(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4));
            evts.add(evt);
            cursor.moveToNext();
            event = evt;
        }
        cursor.close();
        Log.i( TAG, "readByNom invoked" );

        return event;
    }


    public List<EvtV> readAll() {
        List<EvtV> evts = new ArrayList<>();
        String WHERE_CLAUSE = NOM_EVT + " = ?";
        String [] WHERE_ARGS = {};

        Cursor cursor = this.getReadableDatabase().query( TABLE_NAME_V,
                new String[] { KEY, NOM_EVT, DATE_DEBUT, DATE_CHALEUR, DATE_GESTATION },
                null, null, null, null, null, null );

        cursor.moveToFirst();

        while( ! cursor.isAfterLast() ) {
            EvtV evt = new EvtV( cursor.getLong(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4));
            evts.add(evt);
            cursor.moveToNext();
        }
        cursor.close();
        Log.i( TAG, "readAll invoked" );

        return evts;
    }


    public List<EvtV> selectEvtChaleurMois(String d){
        List<EvtV> evts = new ArrayList<>();
        Log.i("ClickChal1", "Création list");

        String SELECT = "SELECT * FROM " + TABLE_NAME_V + " WHERE " + DATE_CHALEUR + " LIKE '" + d + "-%' AND " + DATE_GESTATION + " IS NULL;";
        Log.i("ClickChal1", SELECT);

        Cursor cursor = this.getReadableDatabase().rawQuery( SELECT, null );
        Log.i("ClickChal1", "Lecture");

        cursor.moveToFirst();

        while( ! cursor.isAfterLast() ) {
            EvtV evt = new EvtV( cursor.getLong(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4));
            evts.add(evt);
            cursor.moveToNext();
        }
        cursor.close();
        Log.i("ClickChal1", "Préparation retour");

        Log.i( TAG, "selectEvtChaleurMois invoked" );

        return evts;
    }


    public List<EvtV> selectEvtChaleurJour(String d){
        List<EvtV> evts = new ArrayList<>();

        String SELECT = "SELECT * FROM " + TABLE_NAME_V + " WHERE " + DATE_CHALEUR + " LIKE '" + d + "' AND " + DATE_GESTATION + " IS NULL;";

        Cursor cursor = this.getReadableDatabase().rawQuery( SELECT, null );

        cursor.moveToFirst();

        while( ! cursor.isAfterLast() ) {
            EvtV evt = new EvtV( cursor.getLong(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4));
            evts.add(evt);
            cursor.moveToNext();
        }
        cursor.close();
        Log.i( TAG, "selectEvtChaleurMois invoked" );

        return evts;
    }


    public List<EvtV> selectEvtGestationMois(String d){
        List<EvtV> evts = new ArrayList<>();

        String SELECT = "SELECT * FROM " + TABLE_NAME_V + " WHERE " + DATE_GESTATION + " LIKE '" + d + "-%';";


        Cursor cursor = this.getReadableDatabase().rawQuery( SELECT, null );

        cursor.moveToFirst();

        while( ! cursor.isAfterLast() ) {
            EvtV evt = new EvtV( cursor.getLong(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4));
            evts.add(evt);
            cursor.moveToNext();
        }
        cursor.close();
        Log.i( TAG, "selectEvtGestationMois invoked" );

        return evts;
    }


    public List<EvtV> selectEvtGestationJour(String d){
        List<EvtV> evts = new ArrayList<>();

        String SELECT = "SELECT * FROM " + TABLE_NAME_V + " WHERE " + DATE_GESTATION + " LIKE '" + d + "';";


        Cursor cursor = this.getReadableDatabase().rawQuery( SELECT, null );

        cursor.moveToFirst();

        while( ! cursor.isAfterLast() ) {
            EvtV evt = new EvtV( cursor.getLong(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4));
            evts.add(evt);
            cursor.moveToNext();
        }
        cursor.close();
        Log.i( TAG, "selectEvtGestationMois invoked" );

        return evts;
    }


    public List<EvtV> chaleurPosterieur(String d) {
        List<EvtV> evts = new ArrayList<>();

        String SELECT = "SELECT * FROM EvtV WHERE dateChaleur < '" + d + "' AND dateGestation IS NULL;";


        Cursor cursor = this.getReadableDatabase().rawQuery( SELECT, null );

        cursor.moveToFirst();

        while( ! cursor.isAfterLast() ) {
            EvtV evt = new EvtV( cursor.getLong(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4));
            evts.add(evt);
            cursor.moveToNext();
        }
        cursor.close();
        Log.i( TAG, "selectEvtGestationMois invoked" );

        return evts;
    }


    public List<EvtV> gestationPosterieur(String d) {
        List<EvtV> evts = new ArrayList<>();

        String SELECT = "SELECT * FROM EvtV WHERE dateGestation < '" + d + "';";


        Cursor cursor = this.getReadableDatabase().rawQuery( SELECT, null );

        cursor.moveToFirst();

        while( ! cursor.isAfterLast() ) {
            EvtV evt = new EvtV( cursor.getLong(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4));
            evts.add(evt);
            cursor.moveToNext();
        }
        cursor.close();
        Log.i( TAG, "selectEvtGestationMois invoked" );

        return evts;
    }


    public void supprimerEvtV(String nE){
        List<EvtV> evts = readByNom(nE);

        EvtV evt = evts.get(0);
        Long idEvt = evt.getIdEvt();

        String INSERT = "INSERT INTO " + TABLE_NAME_I + "(" + NOM_EVT + ", " + DATE_DEBUT + ", " + DATE_CHALEUR + ", " + DATE_GESTATION +
                ") SELECT " + NOM_EVT + ", " + DATE_DEBUT + ", " + DATE_CHALEUR + ", " + DATE_GESTATION + " FROM " + TABLE_NAME_V + " WHERE " + KEY + "="+ idEvt + ";";

        String DELETE = "DELETE FROM " + TABLE_NAME_V +" WHERE "+ KEY + "="+ idEvt + ";";

        this.getWritableDatabase().execSQL(INSERT);
        this.getWritableDatabase().execSQL(DELETE);

        Log.i( TAG, "supprimerEvtV invoked" );
    }


    public void autoUpdateGestation(String nE) {
        EvtV evt = readByTheName(nE);

        String date = evt.getDateChaleur();
        Calendar leJour = Calendar.getInstance();


        Integer year = strToInt(String.valueOf(date.charAt(0)))*1000 + strToInt(String.valueOf(date.charAt(1)))*100 + strToInt(String.valueOf(date.charAt(2)))*10 + strToInt(String.valueOf(date.charAt(3)));
        Integer month = strToInt(String.valueOf(date.charAt(5)))*10 + strToInt(String.valueOf(date.charAt(6)));
        Integer day = strToInt(String.valueOf(date.charAt(8)))*10 + strToInt(String.valueOf(date.charAt(9)));

        leJour.set(year, month-1, day);
        leJour.add(Calendar.DATE, 259);

        SimpleDateFormat sqlDate = new SimpleDateFormat("yyyy-MM-dd");

        updateGestation(nE, sqlDate.format(leJour.getTime()));

        Log.i(TAG, "autoUpdateGestation invoked");
    }


    public void autoUpdateChaleur(String nE) {
        EvtV evt = readByTheName(nE);

        String date = evt.getDateChaleur();
        Calendar leJour = Calendar.getInstance();


        Integer year = strToInt(String.valueOf(date.charAt(0)))*1000 + strToInt(String.valueOf(date.charAt(1)))*100 + strToInt(String.valueOf(date.charAt(2)))*10 + strToInt(String.valueOf(date.charAt(3)));
        Integer month = strToInt(String.valueOf(date.charAt(5)))*10 + strToInt(String.valueOf(date.charAt(6)));
        Integer day = strToInt(String.valueOf(date.charAt(8)))*10 + strToInt(String.valueOf(date.charAt(9)));

        leJour.set(year, month-1, day);
        leJour.add(Calendar.DATE, 21);

        SimpleDateFormat sqlDate = new SimpleDateFormat("yyyy-MM-dd");

        updateChaleur(nE, sqlDate.format(leJour.getTime()));

        Log.i(TAG, "autoUpdateChaleur invoked");
    }


    public Integer strToInt(String s){
        Integer varR = null;

        if (s.equals("1")){
            varR = 1;
        }
        if (s.equals("2")){
            varR = 2;
        }

        if (s.equals("3")){
            varR = 3;
        }

        if (s.equals("4")){
            varR = 4;
        }

        if (s.equals("5")){
            varR = 5;
        }

        if (s.equals("6")){
            varR = 6;
        }

        if (s.equals("7")){
            varR = 7;
        }

        if (s.equals("8")){
            varR = 8;
        }

        if (s.equals("9")){
            varR = 9;
        }

        if (s.equals("0")){
            varR = 0;
        }


        return varR;
    }


    public void razBDD() {
        String DELETE = "DELETE FROM " + TABLE_NAME_V + ";";

        this.getWritableDatabase().execSQL(DELETE);

    }
}
