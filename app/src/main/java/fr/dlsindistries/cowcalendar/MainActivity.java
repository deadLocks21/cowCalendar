package fr.dlsindistries.cowcalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.os.Debug;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    // Variables des Layout de l'application
    private LinearLayout layoutMain = null;
    private LinearLayout layoutAjouter = null;
    private LinearLayout layoutCalendrier = null;
    private LinearLayout layoutConflit = null;
    private LinearLayout layoutMenu = null;

    private ImageView barreMainLayout = null;




    // Variables des boutons du menu
    private ImageView btAjouter = null;
    private ImageView btCalendrier = null;
    private ImageView btConflit = null;




    // Menu Calendrier
    private ImageView calendrierEnTete = null;
    private LinearLayout calendrier_fond = null;
    private LinearLayout calendrier_choixCG = null;
    private ImageView calendrier_bouton_chaleur = null;
    private ImageView calendrier_bouton_gestation = null;

    // En-tête
    private LinearLayout calendrier_enTete = null;
    private ImageView calendrier_moisL = null;
    private TextView calendrier_nomDuMois = null;
    private ImageView calendrier_moisR = null;

    // Lettres
    private LinearLayout calendrier_lettres = null;
    private ImageView calendrier_lundi = null;
    private ImageView calendrier_mardi = null;
    private ImageView calendrier_mercredi = null;
    private ImageView calendrier_jeudi = null;
    private ImageView calendrier_vendredi = null;
    private ImageView calendrier_samedi = null;
    private ImageView calendrier_dimanche = null;

    private LinearLayout calendrier_cases = null;

    // Lignes
    private LinearLayout calendrier_l1 = null;
    private LinearLayout calendrier_l2 = null;
    private LinearLayout calendrier_l3 = null;
    private LinearLayout calendrier_l4 = null;
    private LinearLayout calendrier_l5 = null;
    private LinearLayout calendrier_l6 = null;

    // Boules
    private TextView calendrier_c1 = null;
    private TextView calendrier_c2 = null;
    private TextView calendrier_c3 = null;
    private TextView calendrier_c4 = null;
    private TextView calendrier_c5 = null;
    private TextView calendrier_c6 = null;
    private TextView calendrier_c7 = null;
    private TextView calendrier_c8 = null;
    private TextView calendrier_c9 = null;
    private TextView calendrier_c10 = null;
    private TextView calendrier_c11 = null;
    private TextView calendrier_c12 = null;
    private TextView calendrier_c13 = null;
    private TextView calendrier_c14 = null;
    private TextView calendrier_c15 = null;
    private TextView calendrier_c16 = null;
    private TextView calendrier_c17 = null;
    private TextView calendrier_c18 = null;
    private TextView calendrier_c19 = null;
    private TextView calendrier_c20 = null;
    private TextView calendrier_c21 = null;
    private TextView calendrier_c22 = null;
    private TextView calendrier_c23 = null;
    private TextView calendrier_c24 = null;
    private TextView calendrier_c25 = null;
    private TextView calendrier_c26 = null;
    private TextView calendrier_c27 = null;
    private TextView calendrier_c28 = null;
    private TextView calendrier_c29 = null;
    private TextView calendrier_c30 = null;
    private TextView calendrier_c31 = null;
    private TextView calendrier_c32 = null;
    private TextView calendrier_c33 = null;
    private TextView calendrier_c34 = null;
    private TextView calendrier_c35 = null;
    private TextView calendrier_c36 = null;
    private TextView calendrier_c37 = null;
    private TextView calendrier_c38 = null;
    private TextView calendrier_c39 = null;
    private TextView calendrier_c40 = null;
    private TextView calendrier_c41 = null;
    private TextView calendrier_c42 = null;

    // Affichage des évènements
    private TextView calendrier_nomDeEvt = null;
    private LinearLayout calendrier_choixEvt = null;
    private ImageView calendrier_pageL = null;
    private TextView calendrier_affPage = null;
    private ImageView calendrier_pageR = null;




    // Layout Ajouter
    private ImageView ajouter_enTete = null;
    private EditText ajouter_champ = null;
    private TextView ajouter_date = null;
    private ImageView ajouter_bouton = null;
    private ImageView ajouter_notif_evt_vide = null;
    private ImageView ajouter_notif_car_inc = null;
    private TextView ajouter_notif_deja_existant = null;




    // Layout Conflit
    private ImageView conflit_enTete = null;

    private LinearLayout conflit_l1 = null;
    private TextView conflit_evt1 = null;
    private ImageView conflit_ok1 = null;
    private ImageView conflit_croix1 = null;
    private ImageView conflit_bin1 = null;
    private LinearLayout conflit_l2 = null;
    private TextView conflit_evt2 = null;
    private ImageView conflit_ok2 = null;
    private ImageView conflit_croix2 = null;
    private ImageView conflit_bin2 = null;
    private LinearLayout conflit_l3 = null;
    private TextView conflit_evt3 = null;
    private ImageView conflit_ok3 = null;
    private ImageView conflit_croix3 = null;
    private ImageView conflit_bin3 = null;
    private LinearLayout conflit_l4 = null;
    private TextView conflit_evt4 = null;
    private ImageView conflit_ok4 = null;
    private ImageView conflit_croix4 = null;
    private ImageView conflit_bin4 = null;
    private LinearLayout conflit_l5 = null;
    private TextView conflit_evt5 = null;
    private ImageView conflit_ok5 = null;
    private ImageView conflit_croix5 = null;
    private ImageView conflit_bin5 = null;
    private LinearLayout conflit_l6 = null;
    private TextView conflit_evt6 = null;
    private ImageView conflit_ok6 = null;
    private ImageView conflit_croix6 = null;
    private ImageView conflit_bin6 = null;
    private LinearLayout conflit_l7 = null;
    private TextView conflit_evt7 = null;
    private ImageView conflit_ok7 = null;
    private ImageView conflit_croix7 = null;
    private ImageView conflit_bin7 = null;
    private LinearLayout conflit_l8 = null;
    private TextView conflit_evt8 = null;
    private ImageView conflit_ok8 = null;
    private ImageView conflit_croix8 = null;
    private ImageView conflit_bin8 = null;
    private LinearLayout conflit_l9 = null;
    private TextView conflit_evt9 = null;
    private ImageView conflit_ok9 = null;
    private ImageView conflit_croix9 = null;
    private ImageView conflit_bin9 = null;
    private LinearLayout conflit_l10 = null;
    private TextView conflit_evt10 = null;
    private ImageView conflit_ok10 = null;
    private ImageView conflit_croix10 = null;
    private ImageView conflit_bin10 = null;

    private LinearLayout conflit_choixEvt = null;
    private ImageView conflit_pageL = null;
    private TextView conflit_affPage = null;
    private ImageView conflit_pageR = null;





    // Base de données
    private dataManage dataManager = new dataManage( this );

    // Variable de gestion du temps
    private Calendar dateCalendrier = Calendar.getInstance();  // Variable de type Calendar contenant la date du calendrier, initialisé à la date du jour.
    private SimpleDateFormat dateAffichage = new SimpleDateFormat("dd/MM/yyyy");
    private SimpleDateFormat dateSQL = new SimpleDateFormat("yyyy-MM-dd");
    private SimpleDateFormat sdfYear = new SimpleDateFormat("yyyy");
    private SimpleDateFormat sdfMonth = new SimpleDateFormat("MM");
    private SimpleDateFormat sdfDay = new SimpleDateFormat("MM");

    // Constantes
    private String TAG = "DEBUG_";
    private String NOM_MOIS_01 = "Janvier";
    private String NOM_MOIS_02 = "Février";
    private String NOM_MOIS_03 = "Mars";
    private String NOM_MOIS_04 = "Avril";
    private String NOM_MOIS_05 = "Mai";
    private String NOM_MOIS_06 = "Juin";
    private String NOM_MOIS_07 = "Juillet";
    private String NOM_MOIS_08 = "Août";
    private String NOM_MOIS_09 = "Septembre";
    private String NOM_MOIS_10 = "Octobre";
    private String NOM_MOIS_11 = "Novembre";
    private String NOM_MOIS_12 = "Décembre";



    // Variables
    private Integer width;
    private Integer height;
    private String nomEvt;
    private String numEvt;
    private String cOUg;
    private List<String> evtAjh;
    private List<List<String>> cases = new ArrayList<List<String>>();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trouverWH();


        initPage();
        miseEnPage();


        initListCases();

        List<EvtV> evts = dataManager.readAll();

        for ( EvtV evt : evts ) {
            Log.i(TAG, evt.info());
        }


        btAjouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickMenuAjouter();
            }
        });
        btCalendrier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickMenuCalendrier();
            }
        });
        btConflit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickMenuConflit();
            }
        });
        ajouter_bouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    OnClickAjouter();
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });
    }




    // Initialisation des graphismes
    void initPage() {
        // Initialisation Layout
        layoutMain = (LinearLayout)findViewById(R.id.layoutMain);
        layoutAjouter = (LinearLayout)findViewById(R.id.layoutAjouter);
        layoutCalendrier = (LinearLayout)findViewById(R.id.layoutCalendrier);
        layoutConflit = (LinearLayout)findViewById(R.id.layoutConflit);
        layoutMenu = (LinearLayout)findViewById(R.id.layoutMenu);

        barreMainLayout = (ImageView)findViewById(R.id.barreMainLayout);




        // Initialisation bouton du menu
        btAjouter = (ImageView)findViewById(R.id.btAjouter);
        btCalendrier = (ImageView)findViewById(R.id.btCalendrier);
        btConflit = (ImageView)findViewById(R.id.btConflit);




        // Menu Calendrier
        calendrierEnTete = (ImageView)findViewById(R.id.calendrierEnTete);
        calendrier_fond = (LinearLayout)findViewById(R.id.calendrier_fond);

        calendrier_choixCG = (LinearLayout)findViewById(R.id.calendrier_choixCG);
        calendrier_bouton_chaleur = (ImageView)findViewById(R.id.calendrier_chaleur);
        calendrier_bouton_gestation = (ImageView)findViewById(R.id.calendrier_gestation);

        // En-tête
        calendrier_enTete = (LinearLayout) findViewById(R.id.calendrier_enTete);
        calendrier_moisL = (ImageView)findViewById(R.id.calendrier_moisL);
        calendrier_nomDuMois = (TextView)findViewById(R.id.calendrier_nomDuMois);
        calendrier_moisR = (ImageView)findViewById(R.id.calendrier_moisR);

        // Lettres
        calendrier_lettres = (LinearLayout) findViewById(R.id.calendrier_lettres);
        calendrier_lundi = (ImageView) findViewById(R.id.calendrier_lundi);
        calendrier_mardi = (ImageView) findViewById(R.id.calendrier_mardi);
        calendrier_mercredi = (ImageView) findViewById(R.id.calendrier_mercredi);
        calendrier_jeudi = (ImageView) findViewById(R.id.calendrier_jeudi);
        calendrier_vendredi = (ImageView) findViewById(R.id.calendrier_vendredi);
        calendrier_samedi = (ImageView) findViewById(R.id.calendrier_samedi);
        calendrier_dimanche = (ImageView) findViewById(R.id.calendrier_dimanche);

        calendrier_cases = (LinearLayout)findViewById(R.id.calendrier_cases);

        //Lignes
        calendrier_l1 = (LinearLayout) findViewById(R.id.calendrier_l1);
        calendrier_l2 = (LinearLayout) findViewById(R.id.calendrier_l2);
        calendrier_l3 = (LinearLayout) findViewById(R.id.calendrier_l3);
        calendrier_l4 = (LinearLayout) findViewById(R.id.calendrier_l4);
        calendrier_l5 = (LinearLayout) findViewById(R.id.calendrier_l5);
        calendrier_l6 = (LinearLayout) findViewById(R.id.calendrier_l6);

        // Boules
        calendrier_c1 = (TextView) findViewById(R.id.calendrier_c1);
        calendrier_c2 = (TextView) findViewById(R.id.calendrier_c2);
        calendrier_c3 = (TextView) findViewById(R.id.calendrier_c3);
        calendrier_c4 = (TextView) findViewById(R.id.calendrier_c4);
        calendrier_c5 = (TextView) findViewById(R.id.calendrier_c5);
        calendrier_c6 = (TextView) findViewById(R.id.calendrier_c6);
        calendrier_c7 = (TextView) findViewById(R.id.calendrier_c7);
        calendrier_c8 = (TextView) findViewById(R.id.calendrier_c8);
        calendrier_c9 = (TextView) findViewById(R.id.calendrier_c9);
        calendrier_c10 = (TextView) findViewById(R.id.calendrier_c10);
        calendrier_c11 = (TextView) findViewById(R.id.calendrier_c11);
        calendrier_c12 = (TextView) findViewById(R.id.calendrier_c12);
        calendrier_c13 = (TextView) findViewById(R.id.calendrier_c13);
        calendrier_c14 = (TextView) findViewById(R.id.calendrier_c14);
        calendrier_c15 = (TextView) findViewById(R.id.calendrier_c15);
        calendrier_c16 = (TextView) findViewById(R.id.calendrier_c16);
        calendrier_c17 = (TextView) findViewById(R.id.calendrier_c17);
        calendrier_c18 = (TextView) findViewById(R.id.calendrier_c18);
        calendrier_c19 = (TextView) findViewById(R.id.calendrier_c19);
        calendrier_c20 = (TextView) findViewById(R.id.calendrier_c20);
        calendrier_c21 = (TextView) findViewById(R.id.calendrier_c21);
        calendrier_c22 = (TextView) findViewById(R.id.calendrier_c22);
        calendrier_c23 = (TextView) findViewById(R.id.calendrier_c23);
        calendrier_c24 = (TextView) findViewById(R.id.calendrier_c24);
        calendrier_c25 = (TextView) findViewById(R.id.calendrier_c25);
        calendrier_c26 = (TextView) findViewById(R.id.calendrier_c26);
        calendrier_c27 = (TextView) findViewById(R.id.calendrier_c27);
        calendrier_c28 = (TextView) findViewById(R.id.calendrier_c28);
        calendrier_c29 = (TextView) findViewById(R.id.calendrier_c29);
        calendrier_c30 = (TextView) findViewById(R.id.calendrier_c30);
        calendrier_c31 = (TextView) findViewById(R.id.calendrier_c31);
        calendrier_c32 = (TextView) findViewById(R.id.calendrier_c32);
        calendrier_c33 = (TextView) findViewById(R.id.calendrier_c33);
        calendrier_c34 = (TextView) findViewById(R.id.calendrier_c34);
        calendrier_c35 = (TextView) findViewById(R.id.calendrier_c35);
        calendrier_c36 = (TextView) findViewById(R.id.calendrier_c36);
        calendrier_c37 = (TextView) findViewById(R.id.calendrier_c37);
        calendrier_c38 = (TextView) findViewById(R.id.calendrier_c38);
        calendrier_c39 = (TextView) findViewById(R.id.calendrier_c39);
        calendrier_c40 = (TextView) findViewById(R.id.calendrier_c40);
        calendrier_c41 = (TextView) findViewById(R.id.calendrier_c41);
        calendrier_c42 = (TextView) findViewById(R.id.calendrier_c42);

        // Affichage des évènements
        calendrier_nomDeEvt = (TextView)findViewById(R.id.calendrier_nomDeEvt);
        calendrier_choixEvt = (LinearLayout)findViewById(R.id.calendrier_choixEvt);
        calendrier_pageL = (ImageView) findViewById(R.id.calendrier_pageL);
        calendrier_affPage = (TextView) findViewById(R.id.calendrier_affPage);
        calendrier_pageR = (ImageView) findViewById(R.id.calendrier_pageR);




        // Layout Ajouter
        ajouter_enTete = (ImageView)findViewById(R.id.ajouter_enTete);
        ajouter_champ = (EditText)findViewById(R.id.ajouter_champ);
        ajouter_date = (TextView)findViewById(R.id.ajouter_date);
        ajouter_bouton = (ImageView)findViewById(R.id.ajouter_bouton);
        ajouter_notif_evt_vide = (ImageView)findViewById(R.id.ajouter_notif_evt_vide);
        ajouter_notif_car_inc = (ImageView)findViewById(R.id.ajouter_notif_car_inc);
        ajouter_notif_deja_existant = (TextView)findViewById(R.id.ajouter_notif_deja_existant);





        // Layout Conflit
        conflit_enTete = (ImageView)findViewById(R.id.conflit_enTete);

        conflit_l1 = (LinearLayout) findViewById(R.id.conflit_l1);
        conflit_evt1 = (TextView) findViewById(R.id.conflit_evt1);
        conflit_ok1 = (ImageView) findViewById(R.id.conflit_ok1);
        conflit_croix1 = (ImageView) findViewById(R.id.conflit_croix1);
        conflit_bin1 = (ImageView) findViewById(R.id.conflit_bin1);
        conflit_l2 = (LinearLayout) findViewById(R.id.conflit_l2);
        conflit_evt2 = (TextView) findViewById(R.id.conflit_evt2);
        conflit_ok2 = (ImageView) findViewById(R.id.conflit_ok2);
        conflit_croix2 = (ImageView) findViewById(R.id.conflit_croix2);
        conflit_bin2 = (ImageView) findViewById(R.id.conflit_bin2);
        conflit_l3 = (LinearLayout) findViewById(R.id.conflit_l3);
        conflit_evt3 = (TextView) findViewById(R.id.conflit_evt3);
        conflit_ok3 = (ImageView) findViewById(R.id.conflit_ok3);
        conflit_croix3 = (ImageView) findViewById(R.id.conflit_croix3);
        conflit_bin3 = (ImageView) findViewById(R.id.conflit_bin3);
        conflit_l4 = (LinearLayout) findViewById(R.id.conflit_l4);
        conflit_evt4 = (TextView) findViewById(R.id.conflit_evt4);
        conflit_ok4 = (ImageView) findViewById(R.id.conflit_ok4);
        conflit_croix4 = (ImageView) findViewById(R.id.conflit_croix4);
        conflit_bin4 = (ImageView) findViewById(R.id.conflit_bin4);
        conflit_l5 = (LinearLayout) findViewById(R.id.conflit_l5);
        conflit_evt5 = (TextView) findViewById(R.id.conflit_evt5);
        conflit_ok5 = (ImageView) findViewById(R.id.conflit_ok5);
        conflit_croix5 = (ImageView) findViewById(R.id.conflit_croix5);
        conflit_bin5 = (ImageView) findViewById(R.id.conflit_bin5);
        conflit_l6 = (LinearLayout) findViewById(R.id.conflit_l6);
        conflit_evt6 = (TextView) findViewById(R.id.conflit_evt6);
        conflit_ok6 = (ImageView) findViewById(R.id.conflit_ok6);
        conflit_croix6 = (ImageView) findViewById(R.id.conflit_croix6);
        conflit_bin6 = (ImageView) findViewById(R.id.conflit_bin6);
        conflit_l7 = (LinearLayout) findViewById(R.id.conflit_l7);
        conflit_evt7 = (TextView) findViewById(R.id.conflit_evt7);
        conflit_ok7 = (ImageView) findViewById(R.id.conflit_ok7);
        conflit_croix7 = (ImageView) findViewById(R.id.conflit_croix7);
        conflit_bin7 = (ImageView) findViewById(R.id.conflit_bin7);
        conflit_l8 = (LinearLayout) findViewById(R.id.conflit_l8);
        conflit_evt8 = (TextView) findViewById(R.id.conflit_evt8);
        conflit_ok8 = (ImageView) findViewById(R.id.conflit_ok8);
        conflit_croix8 = (ImageView) findViewById(R.id.conflit_croix8);
        conflit_bin8 = (ImageView) findViewById(R.id.conflit_bin8);
        conflit_l9 = (LinearLayout) findViewById(R.id.conflit_l9);
        conflit_evt9 = (TextView) findViewById(R.id.conflit_evt9);
        conflit_ok9 = (ImageView) findViewById(R.id.conflit_ok9);
        conflit_croix9 = (ImageView) findViewById(R.id.conflit_croix9);
        conflit_bin9 = (ImageView) findViewById(R.id.conflit_bin9);
        conflit_l10 = (LinearLayout) findViewById(R.id.conflit_l10);
        conflit_evt10 = (TextView) findViewById(R.id.conflit_evt10);
        conflit_ok10 = (ImageView) findViewById(R.id.conflit_ok10);
        conflit_croix10 = (ImageView) findViewById(R.id.conflit_croix10);
        conflit_bin10 = (ImageView) findViewById(R.id.conflit_bin10);

        conflit_choixEvt = (LinearLayout)findViewById(R.id.conflit_choixEvt);
        conflit_pageL = (ImageView) findViewById(R.id.conflit_pageL);
        conflit_affPage = (TextView) findViewById(R.id.conflit_affPage);
        conflit_pageR = (ImageView) findViewById(R.id.conflit_pageR);

    }

    void miseEnPage() {
        // Mise en page Layout
        //setHW(layoutMain, 720, 1100);
        //setHW(layoutAjouter, 720, 1100);
        //setHW(layoutCalendrier, 720, 1100);
        setHW(layoutConflit, 720, 1100);
        setHW(layoutMenu, 720, 180);
        setHW(layoutMain, 720, 0);  // Faire disparaitre Main
        setHW(layoutAjouter, 720, 0);  // Faire disparaitre Ajouter
        setHW(layoutCalendrier, 720, 0);  // Faire disparaitre Calendrier
        //setHW(layoutConflit, 720, 0);  // Faire disparaitre Conflit

        setHW(barreMainLayout, 720, 5);




        // Mise en page bouton menu
        setHW(btAjouter, 150, 150);
        setMargins(btAjouter, 67,22, 68,0);
        setHW(btCalendrier, 150, 150);
        setMargins(btCalendrier, 0, 22, 0, 0);
        setHW(btConflit, 150, 150);
        setMargins(btConflit, 68,22, 67,0);




        // Menu Calendrier
        setHW(calendrierEnTete, 720, 97);
        setMargins(calendrierEnTete, 0, 0, 0, 70);
        setHW(calendrier_fond, 720, 665);
        setMargins(calendrier_fond, 0, 0, 0, 0);
        setHW(calendrier_choixCG, 720, 70);
        setMargins(calendrier_choixCG, 0, 0, 0, 30);
        setHW(calendrier_bouton_chaleur, 300, 70);
        setMargins(calendrier_bouton_chaleur, 0, 0, 30, 0);
        setHW(calendrier_bouton_gestation, 300, 70);
        setMargins(calendrier_bouton_gestation, 30, 0, 0, 0);

        // En-tête
        setHW(calendrier_enTete, 720, 80);
        setMargins(calendrier_enTete, 0, 2, 0, 0);
        setHW(calendrier_moisL, 70, 70);
        setHW(calendrier_nomDuMois, 450, 70);
        setTextSize(calendrier_nomDuMois, 25);
        setHW(calendrier_moisR, 70, 70);

        // Lettres
        setHW(calendrier_lettres, 720, 75);
        setMargins(calendrier_lettres, 0, 0, 0, 14);
        setHW(calendrier_lundi, 25, 75);
        setMargins(calendrier_lundi, 0, 0, 51, 0);
        setHW(calendrier_mardi, 42, 75);
        setMargins(calendrier_mardi, 0, 0, 43, 0);
        setHW(calendrier_mercredi, 42, 75);
        setMargins(calendrier_mercredi, 0, 0, 52, 0);
        setHW(calendrier_jeudi, 24, 75);
        setMargins(calendrier_jeudi, 0, 0, 58, 0);
        setHW(calendrier_vendredi, 30, 75);
        setMargins(calendrier_vendredi, 0, 0, 53, 0);
        setHW(calendrier_samedi, 35, 75);
        setMargins(calendrier_samedi, 0, 0, 52, 0);
        setHW(calendrier_dimanche, 30, 75);

        setHW(calendrier_cases, 720, 496);

        // Lignes
        setHW(calendrier_l1, 720, 70);
        setMargins(calendrier_l1, 0, 0, 0, 15);
        setHW(calendrier_l2, 720, 70);
        setMargins(calendrier_l2, 0, 0, 0, 15);
        setHW(calendrier_l3, 720, 70);
        setMargins(calendrier_l3, 0, 0, 0, 15);
        setHW(calendrier_l4, 720, 70);
        setMargins(calendrier_l4, 0, 0, 0, 15);
        setHW(calendrier_l5, 720, 70);
        setMargins(calendrier_l5, 0, 0, 0, 15);
        setHW(calendrier_l6, 720, 70);
        setMargins(calendrier_l6, 0, 0, 0, 15);

        // Boules
        setHW(calendrier_c1, 70, 70);
        setMargins(calendrier_c1, 8, 0, 8, 0);
        setTextSize(calendrier_c1, 20);
        setHW(calendrier_c2, 70, 70);
        setMargins(calendrier_c2, 8, 0, 8, 0);
        setTextSize(calendrier_c2, 20);
        setHW(calendrier_c3, 70, 70);
        setMargins(calendrier_c3, 8, 0, 8, 0);
        setTextSize(calendrier_c3, 20);
        setHW(calendrier_c4, 70, 70);
        setMargins(calendrier_c4, 8, 0, 8, 0);
        setTextSize(calendrier_c4, 20);
        setHW(calendrier_c5, 70, 70);
        setMargins(calendrier_c5, 8, 0, 8, 0);
        setTextSize(calendrier_c5, 20);
        setHW(calendrier_c6, 70, 70);
        setMargins(calendrier_c6, 8, 0, 8, 0);
        setTextSize(calendrier_c6, 20);
        setHW(calendrier_c7, 70, 70);
        setMargins(calendrier_c7, 8, 0, 8, 0);
        setTextSize(calendrier_c7, 20);
        setHW(calendrier_c8, 70, 70);
        setMargins(calendrier_c8, 8, 0, 8, 0);
        setTextSize(calendrier_c8, 20);
        setHW(calendrier_c9, 70, 70);
        setMargins(calendrier_c9, 8, 0, 8, 0);
        setTextSize(calendrier_c9, 20);
        setHW(calendrier_c10, 70, 70);
        setMargins(calendrier_c10, 8, 0, 8, 0);
        setTextSize(calendrier_c10, 20);
        setHW(calendrier_c11, 70, 70);
        setMargins(calendrier_c11, 8, 0, 8, 0);
        setTextSize(calendrier_c11, 20);
        setHW(calendrier_c12, 70, 70);
        setMargins(calendrier_c12, 8, 0, 8, 0);
        setTextSize(calendrier_c12, 20);
        setHW(calendrier_c13, 70, 70);
        setMargins(calendrier_c13, 8, 0, 8, 0);
        setTextSize(calendrier_c13, 20);
        setHW(calendrier_c14, 70, 70);
        setMargins(calendrier_c14, 8, 0, 8, 0);
        setTextSize(calendrier_c14, 20);
        setHW(calendrier_c15, 70, 70);
        setMargins(calendrier_c15, 8, 0, 8, 0);
        setTextSize(calendrier_c15, 20);
        setHW(calendrier_c16, 70, 70);
        setMargins(calendrier_c16, 8, 0, 8, 0);
        setTextSize(calendrier_c16, 20);
        setHW(calendrier_c17, 70, 70);
        setMargins(calendrier_c17, 8, 0, 8, 0);
        setTextSize(calendrier_c17, 20);
        setHW(calendrier_c18, 70, 70);
        setMargins(calendrier_c18, 8, 0, 8, 0);
        setTextSize(calendrier_c18, 20);
        setHW(calendrier_c19, 70, 70);
        setMargins(calendrier_c19, 8, 0, 8, 0);
        setTextSize(calendrier_c19, 20);
        setHW(calendrier_c20, 70, 70);
        setMargins(calendrier_c20, 8, 0, 8, 0);
        setTextSize(calendrier_c20, 20);
        setHW(calendrier_c21, 70, 70);
        setMargins(calendrier_c21, 8, 0, 8, 0);
        setTextSize(calendrier_c21, 20);
        setHW(calendrier_c22, 70, 70);
        setMargins(calendrier_c22, 8, 0, 8, 0);
        setTextSize(calendrier_c22, 20);
        setHW(calendrier_c23, 70, 70);
        setMargins(calendrier_c23, 8, 0, 8, 0);
        setTextSize(calendrier_c23, 20);
        setHW(calendrier_c24, 70, 70);
        setMargins(calendrier_c24, 8, 0, 8, 0);
        setTextSize(calendrier_c24, 20);
        setHW(calendrier_c25, 70, 70);
        setMargins(calendrier_c25, 8, 0, 8, 0);
        setTextSize(calendrier_c25, 20);
        setHW(calendrier_c26, 70, 70);
        setMargins(calendrier_c26, 8, 0, 8, 0);
        setTextSize(calendrier_c26, 20);
        setHW(calendrier_c27, 70, 70);
        setMargins(calendrier_c27, 8, 0, 8, 0);
        setTextSize(calendrier_c27, 20);
        setHW(calendrier_c28, 70, 70);
        setMargins(calendrier_c28, 8, 0, 8, 0);
        setTextSize(calendrier_c28, 20);
        setHW(calendrier_c29, 70, 70);
        setMargins(calendrier_c29, 8, 0, 8, 0);
        setTextSize(calendrier_c29, 20);
        setHW(calendrier_c30, 70, 70);
        setMargins(calendrier_c30, 8, 0, 8, 0);
        setTextSize(calendrier_c30, 20);
        setHW(calendrier_c31, 70, 70);
        setMargins(calendrier_c31, 8, 0, 8, 0);
        setTextSize(calendrier_c31, 20);
        setHW(calendrier_c32, 70, 70);
        setMargins(calendrier_c32, 8, 0, 8, 0);
        setTextSize(calendrier_c32, 20);
        setHW(calendrier_c33, 70, 70);
        setMargins(calendrier_c33, 8, 0, 8, 0);
        setTextSize(calendrier_c33, 20);
        setHW(calendrier_c34, 70, 70);
        setMargins(calendrier_c34, 8, 0, 8, 0);
        setTextSize(calendrier_c34, 20);
        setHW(calendrier_c35, 70, 70);
        setMargins(calendrier_c35, 8, 0, 8, 0);
        setTextSize(calendrier_c35, 20);
        setHW(calendrier_c36, 70, 70);
        setMargins(calendrier_c36, 8, 0, 8, 0);
        setTextSize(calendrier_c36, 20);
        setHW(calendrier_c37, 70, 70);
        setMargins(calendrier_c37, 8, 0, 8, 0);
        setTextSize(calendrier_c37, 20);
        setHW(calendrier_c38, 70, 70);
        setMargins(calendrier_c38, 8, 0, 8, 0);
        setTextSize(calendrier_c38, 20);
        setHW(calendrier_c39, 70, 70);
        setMargins(calendrier_c39, 8, 0, 8, 0);
        setTextSize(calendrier_c39, 20);
        setHW(calendrier_c40, 70, 70);
        setMargins(calendrier_c40, 8, 0, 8, 0);
        setTextSize(calendrier_c40, 20);
        setHW(calendrier_c41, 70, 70);
        setMargins(calendrier_c41, 8, 0, 8, 0);
        setTextSize(calendrier_c41, 20);
        setHW(calendrier_c42, 70, 70);
        setMargins(calendrier_c42, 8, 0, 8, 0);
        setTextSize(calendrier_c42, 20);

        // Affichage des évènements
        setHW(calendrier_nomDeEvt, 720, 80);
        setMargins(calendrier_nomDeEvt, 0, 15, 0, 25);
        setTextSize(calendrier_nomDeEvt, 25);
        setHW(calendrier_choixEvt, 720, 86);
        setHW(calendrier_pageL, 66, 86);
        setMargins(calendrier_pageL, 0, 0, 14, 0);
        setHW(calendrier_affPage, 66, 86);
        setTextSize(calendrier_affPage, 20);
        setHW(calendrier_pageR, 66, 86);
        setMargins(calendrier_pageR, 14, 0, 0, 0);




        // Layout Ajouter
        setHW(ajouter_enTete, 720, 97);
        setMargins(ajouter_enTete, 0, 0, 0, 68);
        setHW(ajouter_champ, 720, 85);
        setMargins(ajouter_champ, 0, 0, 0, 50);
        ajouter_champ.setTextSize(25);
        setHW(ajouter_date, 720, 85);
        setMargins(ajouter_date, 0, 0, 0, 50);
        setHW(ajouter_bouton, 720, 85);
        setTextSize(ajouter_date, 25);
        setMargins(ajouter_bouton, 0, 0, 0, 50);

        setHW(ajouter_notif_evt_vide, 720, 0);  // 130
        setHW(ajouter_notif_car_inc, 720, 0);  // 200
        setHW(ajouter_notif_deja_existant, 720, 0);  // 200
        setTextSize(ajouter_notif_deja_existant, 25);




        // Layout Conflit
        setHW(conflit_enTete, 720, 97);
        setMargins(conflit_enTete, 0, 0, 0, 40);

        setHW(conflit_l1, 720, 65);
        setMargins(conflit_l1, 0, 0, 0, 40);
        setHW(conflit_evt1, ViewGroup.LayoutParams.WRAP_CONTENT, 65);
        setMargins(conflit_evt1, 0, 0, 10, 0);
        setTextSize(conflit_evt1, 20);
        conflit_evt1.setMaxWidth(440*width/720);
        setHW(conflit_ok1, 65, 65);
        setMargins(conflit_ok1, 10, 0, 10, 0);
        setHW(conflit_croix1, 65, 65);
        setMargins(conflit_croix1, 10, 0, 10, 0);
        setHW(conflit_bin1, 65, 65);
        setMargins(conflit_bin1, 10, 0, 0, 0);
        setHW(conflit_l2, 720, 65);
        setMargins(conflit_l2, 0, 0, 0, 40);
        setHW(conflit_evt2, ViewGroup.LayoutParams.WRAP_CONTENT, 65);
        setMargins(conflit_evt2, 0, 0, 10, 0);
        setTextSize(conflit_evt2, 20);
        conflit_evt2.setMaxWidth(440*width/720);
        setHW(conflit_ok2, 65, 65);
        setMargins(conflit_ok2, 10, 0, 10, 0);
        setHW(conflit_croix2, 65, 65);
        setMargins(conflit_croix2, 10, 0, 10, 0);
        setHW(conflit_bin2, 65, 65);
        setMargins(conflit_bin2, 10, 0, 0, 0);
        setHW(conflit_l3, 720, 65);
        setMargins(conflit_l3, 0, 0, 0, 40);
        setHW(conflit_evt3, ViewGroup.LayoutParams.WRAP_CONTENT, 65);
        setMargins(conflit_evt3, 0, 0, 10, 0);
        setTextSize(conflit_evt3, 20);
        conflit_evt3.setMaxWidth(440*width/720);
        setHW(conflit_ok3, 65, 65);
        setMargins(conflit_ok3, 10, 0, 10, 0);
        setHW(conflit_croix3, 65, 65);
        setMargins(conflit_croix3, 10, 0, 10, 0);
        setHW(conflit_bin3, 65, 65);
        setMargins(conflit_bin3, 10, 0, 0, 0);
        setHW(conflit_l4, 720, 65);
        setMargins(conflit_l4, 0, 0, 0, 40);
        setHW(conflit_evt4, ViewGroup.LayoutParams.WRAP_CONTENT, 65);
        setMargins(conflit_evt4, 0, 0, 10, 0);
        setTextSize(conflit_evt4, 20);
        conflit_evt4.setMaxWidth(440*width/720);
        setHW(conflit_ok4, 65, 65);
        setMargins(conflit_ok4, 10, 0, 10, 0);
        setHW(conflit_croix4, 65, 65);
        setMargins(conflit_croix4, 10, 0, 10, 0);
        setHW(conflit_bin4, 65, 65);
        setMargins(conflit_bin4, 10, 0, 0, 0);
        setHW(conflit_l5, 720, 65);
        setMargins(conflit_l5, 0, 0, 0, 40);
        setHW(conflit_evt5, ViewGroup.LayoutParams.WRAP_CONTENT, 65);
        setMargins(conflit_evt5, 0, 0, 10, 0);
        setTextSize(conflit_evt5, 20);
        conflit_evt5.setMaxWidth(440*width/720);
        setHW(conflit_ok5, 65, 65);
        setMargins(conflit_ok5, 10, 0, 10, 0);
        setHW(conflit_croix5, 65, 65);
        setMargins(conflit_croix5, 10, 0, 10, 0);
        setHW(conflit_bin5, 65, 65);
        setMargins(conflit_bin5, 10, 0, 0, 0);
        setHW(conflit_l6, 720, 65);
        setMargins(conflit_l6, 0, 0, 0, 40);
        setHW(conflit_evt6, ViewGroup.LayoutParams.WRAP_CONTENT, 65);
        setMargins(conflit_evt6, 0, 0, 10, 0);
        setTextSize(conflit_evt6, 20);
        conflit_evt6.setMaxWidth(440*width/720);
        setHW(conflit_ok6, 65, 65);
        setMargins(conflit_ok6, 10, 0, 10, 0);
        setHW(conflit_croix6, 65, 65);
        setMargins(conflit_croix6, 10, 0, 10, 0);
        setHW(conflit_bin6, 65, 65);
        setMargins(conflit_bin6, 10, 0, 0, 0);
        setHW(conflit_l7, 720, 65);
        setMargins(conflit_l7, 0, 0, 0, 40);
        setHW(conflit_evt7, ViewGroup.LayoutParams.WRAP_CONTENT, 65);
        setMargins(conflit_evt7, 0, 0, 10, 0);
        setTextSize(conflit_evt7, 20);
        conflit_evt7.setMaxWidth(440*width/720);
        setHW(conflit_ok7, 65, 65);
        setMargins(conflit_ok7, 10, 0, 10, 0);
        setHW(conflit_croix7, 65, 65);
        setMargins(conflit_croix7, 10, 0, 10, 0);
        setHW(conflit_bin7, 65, 65);
        setMargins(conflit_bin7, 10, 0, 0, 0);
        setHW(conflit_l8, 720, 65);
        setMargins(conflit_l8, 0, 0, 0, 40);
        setHW(conflit_evt8, ViewGroup.LayoutParams.WRAP_CONTENT, 65);
        setMargins(conflit_evt8, 0, 0, 10, 0);
        setTextSize(conflit_evt8, 20);
        conflit_evt8.setMaxWidth(440*width/720);
        setHW(conflit_ok8, 65, 65);
        setMargins(conflit_ok8, 10, 0, 10, 0);
        setHW(conflit_croix8, 65, 65);
        setMargins(conflit_croix8, 10, 0, 10, 0);
        setHW(conflit_bin8, 65, 65);
        setMargins(conflit_bin8, 10, 0, 0, 0);
        setHW(conflit_l9, 720, 65);
        setMargins(conflit_l9, 0, 0, 0, 40);
        setHW(conflit_evt9, ViewGroup.LayoutParams.WRAP_CONTENT, 65);
        setMargins(conflit_evt9, 0, 0, 10, 0);
        setTextSize(conflit_evt9, 20);
        conflit_evt9.setMaxWidth(440*width/720);
        setHW(conflit_ok9, 65, 65);
        setMargins(conflit_ok9, 10, 0, 10, 0);
        setHW(conflit_croix9, 65, 65);
        setMargins(conflit_croix9, 10, 0, 10, 0);
        setHW(conflit_bin9, 65, 65);
        setMargins(conflit_bin9, 10, 0, 0, 0);
        setHW(conflit_l10, 720, 65);
        setMargins(conflit_l10, 0, 0, 0, 40);
        setHW(conflit_evt10, ViewGroup.LayoutParams.WRAP_CONTENT, 65);
        setMargins(conflit_evt10, 0, 0, 10, 0);
        setTextSize(conflit_evt10, 20);
        conflit_evt10.setMaxWidth(440*width/720);
        setHW(conflit_ok10, 65, 65);
        setMargins(conflit_ok10, 10, 0, 10, 0);
        setHW(conflit_croix10, 65, 65);
        setMargins(conflit_croix10, 10, 0, 10, 0);
        setHW(conflit_bin10, 65, 65);
        setMargins(conflit_bin10, 10, 0, 0, 0);

        setHW(conflit_choixEvt, 720, 86);
        setHW(conflit_pageL, 66, 86);
        setMargins(conflit_pageL, 0, 0, 14, 0);
        setHW(conflit_affPage, 66, 86);
        setTextSize(conflit_affPage, 20);
        setHW(conflit_pageR, 66, 86);
        setMargins(conflit_pageR, 14, 0, 0, 0);
    }


    // Initialisation de la List cases
    void initListCases() {
        for (int i = 1; i<43; i++) {
            List<String> uneCase = new ArrayList<String>();

            uneCase.add(String.valueOf(i));
            uneCase.add("null");

            cases.add(uneCase);
        }

        Log.i(TAG, "Initialisation List cases");
    }


    // Fonctions dédié aux graphismes
    void initDateAjouter() {
        Calendar now = Calendar.getInstance();
        setText(ajouter_date, dateAffichage.format(now.getTime()));
    }
    void razChampAjouter() {
        setText(ajouter_champ, "");
    }





    // Renseignement graphique
    void trouverWH() {
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        height = metrics.heightPixels;
        width = metrics.widthPixels;
        Log.i(TAG, width + "x" + height);
    }

    public void setMargins (View v, int l, int t, int r, int b) {
        if (v.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
            p.setMargins(l*width/720, t*width/1280, r*width/720, b*width/1280);
            v.requestLayout();
        }
    }

    public void setHW (View v, int w, int h) {
        v.setLayoutParams(new LinearLayout.LayoutParams(w*width/720, (h*height)/1280));
    }

    public void setTextSize(TextView v, float s) {
        v.setTextSize((s*height)/1280);
    }

    public void setText(TextView v, String t) {
        v.setText(t);

    }





    // Fonctions OnClick
    void OnClickMenuAjouter(){
        Log.i(TAG, "Ouverture du layout Ajouter");

        //setHW(layoutMain, 720, 1100);
        setHW(layoutAjouter, 720, 1100);
        //setHW(layoutCalendrier, 720, 1100);
        //setHW(layoutConflit, 720, 1100);

        setHW(layoutMain, 720, 0);  // Faire disparaitre Main
        //setHW(layoutAjouter, 720, 0);  // Faire disparaitre Ajouter
        setHW(layoutCalendrier, 720, 0);  // Faire disparaitre Calendrier
        setHW(layoutConflit, 720, 0);  // Faire disparaitre Conflit

        initDateAjouter();
        razChampAjouter();
    }
    void OnClickMenuCalendrier(){
        Log.i(TAG, "Ouverture du layout Calendrier");

        //setHW(layoutMain, 720, 1100);
        //setHW(layoutAjouter, 720, 1100);
        setHW(layoutCalendrier, 720, 1100);
        //setHW(layoutConflit, 720, 1100);

        setHW(layoutMain, 720, 0);  // Faire disparaitre Main
        setHW(layoutAjouter, 720, 0);  // Faire disparaitre Ajouter
        //setHW(layoutCalendrier, 720, 0);  // Faire disparaitre Calendrier
        setHW(layoutConflit, 720, 0);  // Faire disparaitre Conflit
    }
    void OnClickMenuConflit(){
        Log.i(TAG, "Ouverture du layout Conflit");

        //setHW(layoutMain, 720, 1100);
        //setHW(layoutAjouter, 720, 1100);
        //setHW(layoutCalendrier, 720, 1100);
        setHW(layoutConflit, 720, 1100);

        setHW(layoutMain, 720, 0);  // Faire disparaitre Main
        setHW(layoutAjouter, 720, 0);  // Faire disparaitre Ajouter
        setHW(layoutCalendrier, 720, 0);  // Faire disparaitre Calendrier
        //setHW(layoutConflit, 720, 0);  // Faire disparaitre Conflit
    }
    void OnClickAjouter() throws ParseException {
        setHW(ajouter_notif_car_inc, 0, 0);
        setHW(ajouter_notif_deja_existant, 0, 0);
        setHW(ajouter_notif_evt_vide, 0, 0);


        nomEvt = ajouter_champ.getText().toString();
        boolean cI = false;  // permet de verifier si un caractère interdit est present

        cI = contientCarInterdit(nomEvt);

        if("".equals(nomEvt)){
            setHW(ajouter_notif_evt_vide, 720, 130);

            Log.i(TAG, "Tentative d'ajout d'un évènement vide.");
        }

        else{
            if (cI == true) {
                setHW(ajouter_notif_car_inc, 720, 200);
                Log.i(TAG, "Tentative d'ajout d'un évènement contenant des caractères interdits.");
            }

            else {
                List<EvtV> evts = dataManager.readByNom(nomEvt);
                Integer lenList = evts.size();

                if (lenList > 0) {
                    setHW(ajouter_notif_deja_existant, 720, 200);
                    Log.i(TAG, "Tentative d'ajout d'un évènement déjà existant.");
                    EvtV evt = evts.get(0);
                    String dD = evt.getDateDebut();

                    ajouter_notif_deja_existant.setText(dateAffichage.format(dateSQL.parse(dD)));
                }

                else {
                    Calendar tDS = Calendar.getInstance();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String dD = sdf.format(tDS.getTime());
                    tDS.add(tDS.DATE, 21);
                    String dC = sdf.format(tDS.getTime());

                    dataManager.insertEvt(nomEvt, dD, dC);
                    dataManager.close();

                    Log.i(TAG, "Ajout de l'évènement "+ nomEvt + " à la BDD.");
                    razChampAjouter();
                }
            }
        }
    }





    // Fonctions en tout genre
    public boolean contientCarInterdit(String c) {
        boolean present = false;
        Integer indexOf1 = null;
        Integer indexOf2 = null;

        indexOf1 = c.indexOf("'");
        indexOf2 = c.indexOf("\"");

        if(indexOf1 != -1 || indexOf2 != -1){
            present = true;
        }

        return present;
    }
}
