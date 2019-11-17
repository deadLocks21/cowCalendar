package fr.dlsindistries.cowcalendar;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
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


    public List<EvtV> readByDateChaleur(String d){
        List<EvtV> evts = new ArrayList<>();

        String SELECT = "SELECT * FROM " + TABLE_NAME_V + " WHERE " + DATE_CHALEUR + " LIKE '" + d + "-%' AND " + DATE_GESTATION + " IS NULL;";

        Cursor cursor = this.getReadableDatabase().rawQuery( SELECT, null );

        cursor.moveToFirst();

        while( ! cursor.isAfterLast() ) {
            EvtV evt = new EvtV( cursor.getLong(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4));
            evts.add(evt);
            cursor.moveToNext();
        }
        cursor.close();
        Log.i( TAG, "readByDateChaleur invoked" );

        return evts;
    }


    public List<EvtV> readByDateGestation(String d){
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
        Log.i( TAG, "readByDateGestation invoked" );

        return evts;
    }


    public void supprimerEvtV(String nE){
        List<EvtV> evts = readByNom(nE);

        EvtV evt = evts.get(0);
        Long idEvt = evt.getIdEvt();

        String INSERT = "INSERT INTO " + TABLE_NAME_I + "(" + NOM_EVT + ", " + DATE_DEBUT + ", " + DATE_CHALEUR + ", " + DATE_GESTATION +
                ") SELECT " + NOM_EVT + ", " + DATE_DEBUT + ", " + DATE_CHALEUR + ", " + DATE_GESTATION + " FROM " + TABLE_NAME_V + " WHERE " + KEY + "="+ idEvt + ");";

        String DELETE = "DELETE FROM " + TABLE_NAME_V +" WHERE "+ KEY + "="+ idEvt + ");";

        this.getWritableDatabase().execSQL(INSERT);
        this.getWritableDatabase().execSQL(DELETE);

        Log.i( TAG, "supprimerEvtV invoked" );
    }
}
