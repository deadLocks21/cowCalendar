package fr.dlsindistries.cowcalendar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
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
import java.util.Date;
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
    private dataManage dataManager = new dataManage(this);

    // Variable de gestion du temps
    private Calendar dateCalendrier = Calendar.getInstance();  // Variable de type Calendar contenant la date du calendrier, initialisé à la date du jour.
    private SimpleDateFormat dateAffichage = new SimpleDateFormat("dd/MM/yyyy");
    private SimpleDateFormat dateSQL = new SimpleDateFormat("yyyy-MM-dd");
    private SimpleDateFormat sdfYear = new SimpleDateFormat("yyyy");
    private SimpleDateFormat sdfMonth = new SimpleDateFormat("MM");
    private SimpleDateFormat sdfDay = new SimpleDateFormat("dd");

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
    private String nomEvt = "";
    private String numEvt = "0";
    private String cOUg = "";
    private List<String> evtAjh = new ArrayList<String>();
    private List<List<String>> cases = new ArrayList<List<String>>();
    private List<String> chaleurPosterieur = new ArrayList<String>();
    private List<String> lignesConflit = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trouverWH();


        initPage();
        miseEnPage();


        initListCases();

        joursDuMois();
        majCalendrier();
        razEvt();

        //dataManager.insertEvt("v", "2001-04-11", "2001-04-11");
        //dataManager.insertEvt("v", "2019-10-10", "2019-11-17");

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
        calendrier_moisL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    OnClickMoisL();
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });
        calendrier_moisR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    OnClickMoisR();
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });
        calendrier_bouton_chaleur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    OnClickChaleur();
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });
        calendrier_bouton_gestation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    OnClickGestation();
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });
        calendrier_c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC1();
            }
        });
        calendrier_c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC2();
            }
        });
        calendrier_c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC3();
            }
        });
        calendrier_c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC4();
            }
        });
        calendrier_c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC5();
            }
        });
        calendrier_c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC6();
            }
        });
        calendrier_c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC7();
            }
        });
        calendrier_c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC8();
            }
        });
        calendrier_c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC9();
            }
        });
        calendrier_c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC10();
            }
        });
        calendrier_c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC11();
            }
        });
        calendrier_c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC12();
            }
        });
        calendrier_c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC13();
            }
        });
        calendrier_c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC14();
            }
        });
        calendrier_c15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC15();
            }
        });
        calendrier_c16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC16();
            }
        });
        calendrier_c17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC17();
            }
        });
        calendrier_c18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC18();
            }
        });
        calendrier_c19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC19();
            }
        });
        calendrier_c20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC20();
            }
        });
        calendrier_c21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC21();
            }
        });
        calendrier_c22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC22();
            }
        });
        calendrier_c23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC23();
            }
        });
        calendrier_c24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC24();
            }
        });
        calendrier_c25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC25();
            }
        });
        calendrier_c26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC26();
            }
        });
        calendrier_c27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC27();
            }
        });
        calendrier_c28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC28();
            }
        });
        calendrier_c29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC29();
            }
        });
        calendrier_c30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC30();
            }
        });
        calendrier_c31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC31();
            }
        });
        calendrier_c32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC32();
            }
        });
        calendrier_c33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC33();
            }
        });
        calendrier_c34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC34();
            }
        });
        calendrier_c35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC35();
            }
        });
        calendrier_c36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC36();
            }
        });
        calendrier_c37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC37();
            }
        });
        calendrier_c38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC38();
            }
        });
        calendrier_c39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC39();
            }
        });
        calendrier_c40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC40();
            }
        });
        calendrier_c41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC41();
            }
        });
        calendrier_c42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickC42();
            }
        });
        calendrier_pageL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickCPageL();
            }
        });
        calendrier_pageR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickCPageR();
            }
        });
        conflit_pageL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickCPageLConflit();
            }
        });
        conflit_pageR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickCPageRConflit();
            }
        });

        conflit_ok1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickOK(1);

            }
        });
        conflit_ok2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickOK(2);
            }
        });
        conflit_ok3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickOK(3);
            }
        });
        conflit_ok4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickOK(4);
            }
        });
        conflit_ok5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickOK(5);
            }
        });
        conflit_ok6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickOK(6);
            }
        });
        conflit_ok7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickOK(7);
            }
        });
        conflit_ok8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickOK(8);
            }
        });
        conflit_ok9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickOK(9);
            }
        });
        conflit_ok10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickOK(10);
            }
        });
    }


    // Initialisation des graphismes
    void initPage() {
        // Initialisation Layout
        layoutMain = (LinearLayout) findViewById(R.id.layoutMain);
        layoutAjouter = (LinearLayout) findViewById(R.id.layoutAjouter);
        layoutCalendrier = (LinearLayout) findViewById(R.id.layoutCalendrier);
        layoutConflit = (LinearLayout) findViewById(R.id.layoutConflit);
        layoutMenu = (LinearLayout) findViewById(R.id.layoutMenu);

        barreMainLayout = (ImageView) findViewById(R.id.barreMainLayout);


        // Initialisation bouton du menu
        btAjouter = (ImageView) findViewById(R.id.btAjouter);
        btCalendrier = (ImageView) findViewById(R.id.btCalendrier);
        btConflit = (ImageView) findViewById(R.id.btConflit);


        // Menu Calendrier
        calendrierEnTete = (ImageView) findViewById(R.id.calendrierEnTete);
        calendrier_fond = (LinearLayout) findViewById(R.id.calendrier_fond);

        calendrier_choixCG = (LinearLayout) findViewById(R.id.calendrier_choixCG);
        calendrier_bouton_chaleur = (ImageView) findViewById(R.id.calendrier_chaleur);
        calendrier_bouton_gestation = (ImageView) findViewById(R.id.calendrier_gestation);

        // En-tête
        calendrier_enTete = (LinearLayout) findViewById(R.id.calendrier_enTete);
        calendrier_moisL = (ImageView) findViewById(R.id.calendrier_moisL);
        calendrier_nomDuMois = (TextView) findViewById(R.id.calendrier_nomDuMois);
        calendrier_moisR = (ImageView) findViewById(R.id.calendrier_moisR);

        // Lettres
        calendrier_lettres = (LinearLayout) findViewById(R.id.calendrier_lettres);
        calendrier_lundi = (ImageView) findViewById(R.id.calendrier_lundi);
        calendrier_mardi = (ImageView) findViewById(R.id.calendrier_mardi);
        calendrier_mercredi = (ImageView) findViewById(R.id.calendrier_mercredi);
        calendrier_jeudi = (ImageView) findViewById(R.id.calendrier_jeudi);
        calendrier_vendredi = (ImageView) findViewById(R.id.calendrier_vendredi);
        calendrier_samedi = (ImageView) findViewById(R.id.calendrier_samedi);
        calendrier_dimanche = (ImageView) findViewById(R.id.calendrier_dimanche);

        calendrier_cases = (LinearLayout) findViewById(R.id.calendrier_cases);

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
        calendrier_nomDeEvt = (TextView) findViewById(R.id.calendrier_nomDeEvt);
        calendrier_choixEvt = (LinearLayout) findViewById(R.id.calendrier_choixEvt);
        calendrier_pageL = (ImageView) findViewById(R.id.calendrier_pageL);
        calendrier_affPage = (TextView) findViewById(R.id.calendrier_affPage);
        calendrier_pageR = (ImageView) findViewById(R.id.calendrier_pageR);


        // Layout Ajouter
        ajouter_enTete = (ImageView) findViewById(R.id.ajouter_enTete);
        ajouter_champ = (EditText) findViewById(R.id.ajouter_champ);
        ajouter_date = (TextView) findViewById(R.id.ajouter_date);
        ajouter_bouton = (ImageView) findViewById(R.id.ajouter_bouton);
        ajouter_notif_evt_vide = (ImageView) findViewById(R.id.ajouter_notif_evt_vide);
        ajouter_notif_car_inc = (ImageView) findViewById(R.id.ajouter_notif_car_inc);
        ajouter_notif_deja_existant = (TextView) findViewById(R.id.ajouter_notif_deja_existant);


        // Layout Conflit
        conflit_enTete = (ImageView) findViewById(R.id.conflit_enTete);

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

        conflit_choixEvt = (LinearLayout) findViewById(R.id.conflit_choixEvt);
        conflit_pageL = (ImageView) findViewById(R.id.conflit_pageL);
        conflit_affPage = (TextView) findViewById(R.id.conflit_affPage);
        conflit_pageR = (ImageView) findViewById(R.id.conflit_pageR);

    }
    void miseEnPage() {
        if (width < 1300) {
            // Mise en page Layout
            //setHW(layoutMain, 720, 1100);
            //setHW(layoutAjouter, 720, 1100);
            setHW(layoutCalendrier, 720, 1100);
            //setHW(layoutConflit, 720, 1100);
            setHW(layoutMenu, 720, 180);
            setHW(layoutMain, 720, 0);  // Faire disparaitre Main
            setHW(layoutAjouter, 720, 0);  // Faire disparaitre Ajouter
            //setHW(layoutCalendrier, 720, 0);  // Faire disparaitre Calendrier
            setHW(layoutConflit, 720, 0);  // Faire disparaitre Conflit

            setHW(barreMainLayout, 720, 5);


            // Mise en page bouton menu
            setHW(btAjouter, 150, 150);
            setMargins(btAjouter, 67, 22, 68, 0);
            setHW(btCalendrier, 150, 150);
            setMargins(btCalendrier, 0, 22, 0, 0);
            setHW(btConflit, 150, 150);
            setMargins(btConflit, 68, 22, 67, 0);


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
            setHW(conflit_evt1, 450, 65);
            setMargins(conflit_evt1, 0, 0, 10, 0);
            setTextSize(conflit_evt1, 20);
            //conflit_evt1.setMaxWidth(440 * width / 720);
            setHW(conflit_ok1, 65, 65);
            setMargins(conflit_ok1, 10, 0, 10, 0);
            setHW(conflit_croix1, 65, 65);
            setMargins(conflit_croix1, 10, 0, 10, 0);
            setHW(conflit_bin1, 65, 65);
            setMargins(conflit_bin1, 10, 0, 0, 0);
            setHW(conflit_l2, 720, 65);
            setMargins(conflit_l2, 0, 0, 0, 40);
            setHW(conflit_evt2, 450, 65);
            setMargins(conflit_evt2, 0, 0, 10, 0);
            setTextSize(conflit_evt2, 20);
            //conflit_evt2.setMaxWidth(440 * width / 720);
            setHW(conflit_ok2, 65, 65);
            setMargins(conflit_ok2, 10, 0, 10, 0);
            setHW(conflit_croix2, 65, 65);
            setMargins(conflit_croix2, 10, 0, 10, 0);
            setHW(conflit_bin2, 65, 65);
            setMargins(conflit_bin2, 10, 0, 0, 0);
            setHW(conflit_l3, 720, 65);
            setMargins(conflit_l3, 0, 0, 0, 40);
            setHW(conflit_evt3, 450, 65);
            setMargins(conflit_evt3, 0, 0, 10, 0);
            setTextSize(conflit_evt3, 20);
            //conflit_evt3.setMaxWidth(440 * width / 720);
            setHW(conflit_ok3, 65, 65);
            setMargins(conflit_ok3, 10, 0, 10, 0);
            setHW(conflit_croix3, 65, 65);
            setMargins(conflit_croix3, 10, 0, 10, 0);
            setHW(conflit_bin3, 65, 65);
            setMargins(conflit_bin3, 10, 0, 0, 0);
            setHW(conflit_l4, 720, 65);
            setMargins(conflit_l4, 0, 0, 0, 40);
            setHW(conflit_evt4, 450, 65);
            setMargins(conflit_evt4, 0, 0, 10, 0);
            setTextSize(conflit_evt4, 20);
            //conflit_evt4.setMaxWidth(440 * width / 720);
            setHW(conflit_ok4, 65, 65);
            setMargins(conflit_ok4, 10, 0, 10, 0);
            setHW(conflit_croix4, 65, 65);
            setMargins(conflit_croix4, 10, 0, 10, 0);
            setHW(conflit_bin4, 65, 65);
            setMargins(conflit_bin4, 10, 0, 0, 0);
            setHW(conflit_l5, 720, 65);
            setMargins(conflit_l5, 0, 0, 0, 40);
            setHW(conflit_evt5, 450, 65);
            setMargins(conflit_evt5, 0, 0, 10, 0);
            setTextSize(conflit_evt5, 20);
            //conflit_evt5.setMaxWidth(440 * width / 720);
            setHW(conflit_ok5, 65, 65);
            setMargins(conflit_ok5, 10, 0, 10, 0);
            setHW(conflit_croix5, 65, 65);
            setMargins(conflit_croix5, 10, 0, 10, 0);
            setHW(conflit_bin5, 65, 65);
            setMargins(conflit_bin5, 10, 0, 0, 0);
            setHW(conflit_l6, 720, 65);
            setMargins(conflit_l6, 0, 0, 0, 40);
            setHW(conflit_evt6, 450, 65);
            setMargins(conflit_evt6, 0, 0, 10, 0);
            setTextSize(conflit_evt6, 20);
            //conflit_evt6.setMaxWidth(440 * width / 720);
            setHW(conflit_ok6, 65, 65);
            setMargins(conflit_ok6, 10, 0, 10, 0);
            setHW(conflit_croix6, 65, 65);
            setMargins(conflit_croix6, 10, 0, 10, 0);
            setHW(conflit_bin6, 65, 65);
            setMargins(conflit_bin6, 10, 0, 0, 0);
            setHW(conflit_l7, 720, 65);
            setMargins(conflit_l7, 0, 0, 0, 40);
            setHW(conflit_evt7, 450, 65);
            setMargins(conflit_evt7, 0, 0, 10, 0);
            setTextSize(conflit_evt7, 20);
            //conflit_evt7.setMaxWidth(440 * width / 720);
            setHW(conflit_ok7, 65, 65);
            setMargins(conflit_ok7, 10, 0, 10, 0);
            setHW(conflit_croix7, 65, 65);
            setMargins(conflit_croix7, 10, 0, 10, 0);
            setHW(conflit_bin7, 65, 65);
            setMargins(conflit_bin7, 10, 0, 0, 0);
            setHW(conflit_l8, 720, 65);
            setMargins(conflit_l8, 0, 0, 0, 40);
            setHW(conflit_evt8, 450, 65);
            setMargins(conflit_evt8, 0, 0, 10, 0);
            setTextSize(conflit_evt8, 20);
            //conflit_evt8.setMaxWidth(440 * width / 720);
            setHW(conflit_ok8, 65, 65);
            setMargins(conflit_ok8, 10, 0, 10, 0);
            setHW(conflit_croix8, 65, 65);
            setMargins(conflit_croix8, 10, 0, 10, 0);
            setHW(conflit_bin8, 65, 65);
            setMargins(conflit_bin8, 10, 0, 0, 0);
            setHW(conflit_l9, 720, 65);
            setMargins(conflit_l9, 0, 0, 0, 40);
            setHW(conflit_evt9, 450, 65);
            setMargins(conflit_evt9, 0, 0, 10, 0);
            setTextSize(conflit_evt9, 20);
            //conflit_evt9.setMaxWidth(440 * width / 720);
            setHW(conflit_ok9, 65, 65);
            setMargins(conflit_ok9, 10, 0, 10, 0);
            setHW(conflit_croix9, 65, 65);
            setMargins(conflit_croix9, 10, 0, 10, 0);
            setHW(conflit_bin9, 65, 65);
            setMargins(conflit_bin9, 10, 0, 0, 0);
            setHW(conflit_l10, 720, 65);
            setMargins(conflit_l10, 0, 0, 0, 40);
            setHW(conflit_evt10, 450, 65);
            setMargins(conflit_evt10, 0, 0, 10, 0);
            setTextSize(conflit_evt10, 20);
            //conflit_evt10.setMaxWidth(440 * width / 720);
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
            setText(conflit_affPage, "1");
            setHW(conflit_pageR, 66, 86);
            setMargins(conflit_pageR, 14, 0, 0, 0);
        }
        else {
            // Mise en page Layout
            //setHW(layoutMain, 720, 1100);
            //setHW(layoutAjouter, 720, 1100);
            setHW(layoutCalendrier, 720, 1100);
            //setHW(layoutConflit, 720, 1100);
            setHW(layoutMenu, 720, 180);
            setHW(layoutMain, 720, 0);  // Faire disparaitre Main
            setHW(layoutAjouter, 720, 0);  // Faire disparaitre Ajouter
            //setHW(layoutCalendrier, 720, 0);  // Faire disparaitre Calendrier
            setHW(layoutConflit, 720, 0);  // Faire disparaitre Conflit

            setHW(barreMainLayout, 720, 5);


            // Mise en page bouton menu
            setHW(btAjouter, 150, 150);
            setMargins(btAjouter, 67, 22, 68, 0);
            setHW(btCalendrier, 150, 150);
            setMargins(btCalendrier, 0, 22, 0, 0);
            setHW(btConflit, 150, 150);
            setMargins(btConflit, 68, 22, 67, 0);


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
            setTextSize(calendrier_nomDuMois, 16);
            setHW(calendrier_moisR, 70, 70);

            // Lettres
            setHW(calendrier_lettres, 720, 75);
            setMargins(calendrier_lettres, 0, 0, 0, 14);
            setHW(calendrier_lundi, 16, 75);
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
            setTextSize(calendrier_c1, 15);
            setHW(calendrier_c2, 70, 70);
            setMargins(calendrier_c2, 8, 0, 8, 0);
            setTextSize(calendrier_c2, 15);
            setHW(calendrier_c3, 70, 70);
            setMargins(calendrier_c3, 8, 0, 8, 0);
            setTextSize(calendrier_c3, 15);
            setHW(calendrier_c4, 70, 70);
            setMargins(calendrier_c4, 8, 0, 8, 0);
            setTextSize(calendrier_c4, 15);
            setHW(calendrier_c5, 70, 70);
            setMargins(calendrier_c5, 8, 0, 8, 0);
            setTextSize(calendrier_c5, 15);
            setHW(calendrier_c6, 70, 70);
            setMargins(calendrier_c6, 8, 0, 8, 0);
            setTextSize(calendrier_c6, 15);
            setHW(calendrier_c7, 70, 70);
            setMargins(calendrier_c7, 8, 0, 8, 0);
            setTextSize(calendrier_c7, 15);
            setHW(calendrier_c8, 70, 70);
            setMargins(calendrier_c8, 8, 0, 8, 0);
            setTextSize(calendrier_c8, 15);
            setHW(calendrier_c9, 70, 70);
            setMargins(calendrier_c9, 8, 0, 8, 0);
            setTextSize(calendrier_c9, 15);
            setHW(calendrier_c10, 70, 70);
            setMargins(calendrier_c10, 8, 0, 8, 0);
            setTextSize(calendrier_c10, 15);
            setHW(calendrier_c11, 70, 70);
            setMargins(calendrier_c11, 8, 0, 8, 0);
            setTextSize(calendrier_c11, 15);
            setHW(calendrier_c12, 70, 70);
            setMargins(calendrier_c12, 8, 0, 8, 0);
            setTextSize(calendrier_c12, 15);
            setHW(calendrier_c13, 70, 70);
            setMargins(calendrier_c13, 8, 0, 8, 0);
            setTextSize(calendrier_c13, 15);
            setHW(calendrier_c14, 70, 70);
            setMargins(calendrier_c14, 8, 0, 8, 0);
            setTextSize(calendrier_c14, 15);
            setHW(calendrier_c15, 70, 70);
            setMargins(calendrier_c15, 8, 0, 8, 0);
            setTextSize(calendrier_c15, 15);
            setHW(calendrier_c16, 70, 70);
            setMargins(calendrier_c16, 8, 0, 8, 0);
            setTextSize(calendrier_c16, 15);
            setHW(calendrier_c17, 70, 70);
            setMargins(calendrier_c17, 8, 0, 8, 0);
            setTextSize(calendrier_c17, 15);
            setHW(calendrier_c18, 70, 70);
            setMargins(calendrier_c18, 8, 0, 8, 0);
            setTextSize(calendrier_c18, 15);
            setHW(calendrier_c19, 70, 70);
            setMargins(calendrier_c19, 8, 0, 8, 0);
            setTextSize(calendrier_c19, 15);
            setHW(calendrier_c20, 70, 70);
            setMargins(calendrier_c20, 8, 0, 8, 0);
            setTextSize(calendrier_c20, 15);
            setHW(calendrier_c21, 70, 70);
            setMargins(calendrier_c21, 8, 0, 8, 0);
            setTextSize(calendrier_c21, 15);
            setHW(calendrier_c22, 70, 70);
            setMargins(calendrier_c22, 8, 0, 8, 0);
            setTextSize(calendrier_c22, 15);
            setHW(calendrier_c23, 70, 70);
            setMargins(calendrier_c23, 8, 0, 8, 0);
            setTextSize(calendrier_c23, 15);
            setHW(calendrier_c24, 70, 70);
            setMargins(calendrier_c24, 8, 0, 8, 0);
            setTextSize(calendrier_c24, 15);
            setHW(calendrier_c25, 70, 70);
            setMargins(calendrier_c25, 8, 0, 8, 0);
            setTextSize(calendrier_c25, 15);
            setHW(calendrier_c26, 70, 70);
            setMargins(calendrier_c26, 8, 0, 8, 0);
            setTextSize(calendrier_c26, 15);
            setHW(calendrier_c27, 70, 70);
            setMargins(calendrier_c27, 8, 0, 8, 0);
            setTextSize(calendrier_c27, 15);
            setHW(calendrier_c28, 70, 70);
            setMargins(calendrier_c28, 8, 0, 8, 0);
            setTextSize(calendrier_c28, 15);
            setHW(calendrier_c29, 70, 70);
            setMargins(calendrier_c29, 8, 0, 8, 0);
            setTextSize(calendrier_c29, 15);
            setHW(calendrier_c30, 70, 70);
            setMargins(calendrier_c30, 8, 0, 8, 0);
            setTextSize(calendrier_c30, 15);
            setHW(calendrier_c31, 70, 70);
            setMargins(calendrier_c31, 8, 0, 8, 0);
            setTextSize(calendrier_c31, 15);
            setHW(calendrier_c32, 70, 70);
            setMargins(calendrier_c32, 8, 0, 8, 0);
            setTextSize(calendrier_c32, 15);
            setHW(calendrier_c33, 70, 70);
            setMargins(calendrier_c33, 8, 0, 8, 0);
            setTextSize(calendrier_c33, 15);
            setHW(calendrier_c34, 70, 70);
            setMargins(calendrier_c34, 8, 0, 8, 0);
            setTextSize(calendrier_c34, 15);
            setHW(calendrier_c35, 70, 70);
            setMargins(calendrier_c35, 8, 0, 8, 0);
            setTextSize(calendrier_c35, 15);
            setHW(calendrier_c36, 70, 70);
            setMargins(calendrier_c36, 8, 0, 8, 0);
            setTextSize(calendrier_c36, 15);
            setHW(calendrier_c37, 70, 70);
            setMargins(calendrier_c37, 8, 0, 8, 0);
            setTextSize(calendrier_c37, 15);
            setHW(calendrier_c38, 70, 70);
            setMargins(calendrier_c38, 8, 0, 8, 0);
            setTextSize(calendrier_c38, 15);
            setHW(calendrier_c39, 70, 70);
            setMargins(calendrier_c39, 8, 0, 8, 0);
            setTextSize(calendrier_c39, 15);
            setHW(calendrier_c40, 70, 70);
            setMargins(calendrier_c40, 8, 0, 8, 0);
            setTextSize(calendrier_c40, 15);
            setHW(calendrier_c41, 70, 70);
            setMargins(calendrier_c41, 8, 0, 8, 0);
            setTextSize(calendrier_c41, 15);
            setHW(calendrier_c42, 70, 70);
            setMargins(calendrier_c42, 8, 0, 8, 0);
            setTextSize(calendrier_c42, 15);

            // Affichage des évènements
            setHW(calendrier_nomDeEvt, 720, 80);
            setMargins(calendrier_nomDeEvt, 0, 15, 0, 16);
            setTextSize(calendrier_nomDeEvt, 16);
            setHW(calendrier_choixEvt, 720, 86);
            setHW(calendrier_pageL, 66, 86);
            setMargins(calendrier_pageL, 0, 0, 14, 0);
            setHW(calendrier_affPage, 66, 86);
            setTextSize(calendrier_affPage, 15);
            setHW(calendrier_pageR, 66, 86);
            setMargins(calendrier_pageR, 14, 0, 0, 0);


            // Layout Ajouter
            setHW(ajouter_enTete, 720, 97);
            setMargins(ajouter_enTete, 0, 0, 0, 68);
            setHW(ajouter_champ, 720, 85);
            setMargins(ajouter_champ, 0, 0, 0, 50);
            ajouter_champ.setTextSize(20);
            setHW(ajouter_date, 720, 85);
            setMargins(ajouter_date, 0, 0, 0, 50);
            setHW(ajouter_bouton, 720, 85);
            setTextSize(ajouter_date, 16);
            setMargins(ajouter_bouton, 0, 0, 0, 50);

            setHW(ajouter_notif_evt_vide, 720, 0);  // 130
            setHW(ajouter_notif_car_inc, 720, 0);  // 150
            setHW(ajouter_notif_deja_existant, 720, 0);  // 150
            setTextSize(ajouter_notif_deja_existant, 16);


            // Layout Conflit
            setHW(conflit_enTete, 720, 97);
            setMargins(conflit_enTete, 0, 0, 0, 40);

            setHW(conflit_l1, 720, 65);
            setMargins(conflit_l1, 0, 0, 0, 40);
            setHW(conflit_evt1, 450, 65);
            setMargins(conflit_evt1, 0, 0, 10, 0);
            setTextSize(conflit_evt1, 15);
            //conflit_evt1.setMaxWidth(440 * width / 720);
            setHW(conflit_ok1, 65, 65);
            setMargins(conflit_ok1, 10, 0, 10, 0);
            setHW(conflit_croix1, 65, 65);
            setMargins(conflit_croix1, 10, 0, 10, 0);
            setHW(conflit_bin1, 65, 65);
            setMargins(conflit_bin1, 10, 0, 0, 0);
            setHW(conflit_l2, 720, 65);
            setMargins(conflit_l2, 0, 0, 0, 40);
            setHW(conflit_evt2, 450, 65);
            setMargins(conflit_evt2, 0, 0, 10, 0);
            setTextSize(conflit_evt2, 15);
            //conflit_evt2.setMaxWidth(440 * width / 720);
            setHW(conflit_ok2, 65, 65);
            setMargins(conflit_ok2, 10, 0, 10, 0);
            setHW(conflit_croix2, 65, 65);
            setMargins(conflit_croix2, 10, 0, 10, 0);
            setHW(conflit_bin2, 65, 65);
            setMargins(conflit_bin2, 10, 0, 0, 0);
            setHW(conflit_l3, 720, 65);
            setMargins(conflit_l3, 0, 0, 0, 40);
            setHW(conflit_evt3, 450, 65);
            setMargins(conflit_evt3, 0, 0, 10, 0);
            setTextSize(conflit_evt3, 15);
            //conflit_evt3.setMaxWidth(440 * width / 720);
            setHW(conflit_ok3, 65, 65);
            setMargins(conflit_ok3, 10, 0, 10, 0);
            setHW(conflit_croix3, 65, 65);
            setMargins(conflit_croix3, 10, 0, 10, 0);
            setHW(conflit_bin3, 65, 65);
            setMargins(conflit_bin3, 10, 0, 0, 0);
            setHW(conflit_l4, 720, 65);
            setMargins(conflit_l4, 0, 0, 0, 40);
            setHW(conflit_evt4, 450, 65);
            setMargins(conflit_evt4, 0, 0, 10, 0);
            setTextSize(conflit_evt4, 15);
            //conflit_evt4.setMaxWidth(440 * width / 720);
            setHW(conflit_ok4, 65, 65);
            setMargins(conflit_ok4, 10, 0, 10, 0);
            setHW(conflit_croix4, 65, 65);
            setMargins(conflit_croix4, 10, 0, 10, 0);
            setHW(conflit_bin4, 65, 65);
            setMargins(conflit_bin4, 10, 0, 0, 0);
            setHW(conflit_l5, 720, 65);
            setMargins(conflit_l5, 0, 0, 0, 40);
            setHW(conflit_evt5, 450, 65);
            setMargins(conflit_evt5, 0, 0, 10, 0);
            setTextSize(conflit_evt5, 15);
            //conflit_evt5.setMaxWidth(440 * width / 720);
            setHW(conflit_ok5, 65, 65);
            setMargins(conflit_ok5, 10, 0, 10, 0);
            setHW(conflit_croix5, 65, 65);
            setMargins(conflit_croix5, 10, 0, 10, 0);
            setHW(conflit_bin5, 65, 65);
            setMargins(conflit_bin5, 10, 0, 0, 0);
            setHW(conflit_l6, 720, 65);
            setMargins(conflit_l6, 0, 0, 0, 40);
            setHW(conflit_evt6, 450, 65);
            setMargins(conflit_evt6, 0, 0, 10, 0);
            setTextSize(conflit_evt6, 15);
            //conflit_evt6.setMaxWidth(440 * width / 720);
            setHW(conflit_ok6, 65, 65);
            setMargins(conflit_ok6, 10, 0, 10, 0);
            setHW(conflit_croix6, 65, 65);
            setMargins(conflit_croix6, 10, 0, 10, 0);
            setHW(conflit_bin6, 65, 65);
            setMargins(conflit_bin6, 10, 0, 0, 0);
            setHW(conflit_l7, 720, 65);
            setMargins(conflit_l7, 0, 0, 0, 40);
            setHW(conflit_evt7, 450, 65);
            setMargins(conflit_evt7, 0, 0, 10, 0);
            setTextSize(conflit_evt7, 15);
            //conflit_evt7.setMaxWidth(440 * width / 720);
            setHW(conflit_ok7, 65, 65);
            setMargins(conflit_ok7, 10, 0, 10, 0);
            setHW(conflit_croix7, 65, 65);
            setMargins(conflit_croix7, 10, 0, 10, 0);
            setHW(conflit_bin7, 65, 65);
            setMargins(conflit_bin7, 10, 0, 0, 0);
            setHW(conflit_l8, 720, 65);
            setMargins(conflit_l8, 0, 0, 0, 40);
            setHW(conflit_evt8, 450, 65);
            setMargins(conflit_evt8, 0, 0, 10, 0);
            setTextSize(conflit_evt8, 15);
            //conflit_evt8.setMaxWidth(440 * width / 720);
            setHW(conflit_ok8, 65, 65);
            setMargins(conflit_ok8, 10, 0, 10, 0);
            setHW(conflit_croix8, 65, 65);
            setMargins(conflit_croix8, 10, 0, 10, 0);
            setHW(conflit_bin8, 65, 65);
            setMargins(conflit_bin8, 10, 0, 0, 0);
            setHW(conflit_l9, 720, 65);
            setMargins(conflit_l9, 0, 0, 0, 40);
            setHW(conflit_evt9, 450, 65);
            setMargins(conflit_evt9, 0, 0, 10, 0);
            setTextSize(conflit_evt9, 15);
            //conflit_evt9.setMaxWidth(440 * width / 720);
            setHW(conflit_ok9, 65, 65);
            setMargins(conflit_ok9, 10, 0, 10, 0);
            setHW(conflit_croix9, 65, 65);
            setMargins(conflit_croix9, 10, 0, 10, 0);
            setHW(conflit_bin9, 65, 65);
            setMargins(conflit_bin9, 10, 0, 0, 0);
            setHW(conflit_l10, 720, 65);
            setMargins(conflit_l10, 0, 0, 0, 40);
            setHW(conflit_evt10, 450, 65);
            setMargins(conflit_evt10, 0, 0, 10, 0);
            setTextSize(conflit_evt10, 15);
            //conflit_evt10.setMaxWidth(440 * width / 720);
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
            setTextSize(conflit_affPage, 15);
            setText(conflit_affPage, "1");
            setHW(conflit_pageR, 66, 86);
            setMargins(conflit_pageR, 14, 0, 0, 0);

        }
    }


    // Initialisation de la List cases
    void initListCases() {
        for (int i = 1; i < 43; i++) {
            List<String> uneCase = new ArrayList<String>();

            uneCase.add("0");
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
    void joursDuMois() {
        razJoursMois();

        Calendar ajh = Calendar.getInstance();

        ajh.set(Integer.parseInt(sdfYear.format(dateCalendrier.getTime())), Integer.parseInt(sdfMonth.format(dateCalendrier.getTime()))-1, Integer.parseInt(sdfDay.format(dateCalendrier.getTime())));

        SimpleDateFormat Jour = new SimpleDateFormat("dd");

        Integer y = ajh.get(Calendar.YEAR);
        Integer m = ajh.get(Calendar.MONTH);

        ajh.set(y, m, 1);
        Integer pJourDuMois  = ajh.get(Calendar.DAY_OF_WEEK);

        Integer numberOfDaysInThisMonth = ajh.getActualMaximum(Calendar.DAY_OF_MONTH);

        List<String> uneCase = new ArrayList<String>();

        if (pJourDuMois == 2)
        {
            uneCase = cases.get(0);
            uneCase.set(0, "01");
            cases.set(0, uneCase);
            uneCase = cases.get(1);
            uneCase.set(0, "02");
            cases.set(1, uneCase);
            uneCase = cases.get(2);
            uneCase.set(0, "03");
            cases.set(2, uneCase);
            uneCase = cases.get(3);
            uneCase.set(0, "04");
            cases.set(3, uneCase);
            uneCase = cases.get(4);
            uneCase.set(0, "05");
            cases.set(4, uneCase);
            uneCase = cases.get(5);
            uneCase.set(0, "06");
            cases.set(5, uneCase);
            uneCase = cases.get(6);
            uneCase.set(0, "07");
            cases.set(6, uneCase);
            uneCase = cases.get(7);
            uneCase.set(0, "08");
            cases.set(7, uneCase);
            uneCase = cases.get(8);
            uneCase.set(0, "09");
            cases.set(8, uneCase);
            uneCase = cases.get(9);
            uneCase.set(0, "10");
            cases.set(9, uneCase);
            uneCase = cases.get(10);
            uneCase.set(0, "11");
            cases.set(10, uneCase);
            uneCase = cases.get(11);
            uneCase.set(0, "12");
            cases.set(11, uneCase);
            uneCase = cases.get(12);
            uneCase.set(0, "13");
            cases.set(12, uneCase);
            uneCase = cases.get(13);
            uneCase.set(0, "14");
            cases.set(13, uneCase);
            uneCase = cases.get(14);
            uneCase.set(0, "15");
            cases.set(14, uneCase);
            uneCase = cases.get(15);
            uneCase.set(0, "16");
            cases.set(15, uneCase);
            uneCase = cases.get(16);
            uneCase.set(0, "17");
            cases.set(16, uneCase);
            uneCase = cases.get(17);
            uneCase.set(0, "18");
            cases.set(17, uneCase);
            uneCase = cases.get(18);
            uneCase.set(0, "19");
            cases.set(18, uneCase);
            uneCase = cases.get(19);
            uneCase.set(0, "20");
            cases.set(19, uneCase);
            uneCase = cases.get(20);
            uneCase.set(0, "21");
            cases.set(20, uneCase);
            uneCase = cases.get(21);
            uneCase.set(0, "22");
            cases.set(21, uneCase);
            uneCase = cases.get(22);
            uneCase.set(0, "23");
            cases.set(22, uneCase);
            uneCase = cases.get(23);
            uneCase.set(0, "24");
            cases.set(23, uneCase);
            uneCase = cases.get(24);
            uneCase.set(0, "25");
            cases.set(24, uneCase);
            uneCase = cases.get(25);
            uneCase.set(0, "26");
            cases.set(25, uneCase);
            uneCase = cases.get(26);
            uneCase.set(0, "27");
            cases.set(26, uneCase);
            uneCase = cases.get(27);
            uneCase.set(0, "28");
            cases.set(27, uneCase);

            if (numberOfDaysInThisMonth > 28)
            {
                uneCase = cases.get(28);
                uneCase.set(0, "29");
                cases.set(28, uneCase);
            }

            if (numberOfDaysInThisMonth > 29)
            {
                uneCase = cases.get(29);
                uneCase.set(0, "30");
                cases.set(29, uneCase);
            }
            if (numberOfDaysInThisMonth > 30)
            {
                uneCase = cases.get(30);
                uneCase.set(0, "31");
                cases.set(30, uneCase);
            }
        }



        if (pJourDuMois == 3)
        {
            uneCase = cases.get(1);
            uneCase.set(0, "01");
            cases.set(1, uneCase);
            uneCase = cases.get(2);
            uneCase.set(0, "02");
            cases.set(2, uneCase);
            uneCase = cases.get(3);
            uneCase.set(0, "03");
            cases.set(3, uneCase);
            uneCase = cases.get(4);
            uneCase.set(0, "04");
            cases.set(4, uneCase);
            uneCase = cases.get(5);
            uneCase.set(0, "05");
            cases.set(5, uneCase);
            uneCase = cases.get(6);
            uneCase.set(0, "06");
            cases.set(6, uneCase);
            uneCase = cases.get(7);
            uneCase.set(0, "07");
            cases.set(7, uneCase);
            uneCase = cases.get(8);
            uneCase.set(0, "08");
            cases.set(8, uneCase);
            uneCase = cases.get(9);
            uneCase.set(0, "09");
            cases.set(9, uneCase);
            uneCase = cases.get(10);
            uneCase.set(0, "10");
            cases.set(10, uneCase);
            uneCase = cases.get(11);
            uneCase.set(0, "11");
            cases.set(11, uneCase);
            uneCase = cases.get(12);
            uneCase.set(0, "12");
            cases.set(12, uneCase);
            uneCase = cases.get(13);
            uneCase.set(0, "13");
            cases.set(13, uneCase);
            uneCase = cases.get(14);
            uneCase.set(0, "14");
            cases.set(14, uneCase);
            uneCase = cases.get(15);
            uneCase.set(0, "15");
            cases.set(15, uneCase);
            uneCase = cases.get(16);
            uneCase.set(0, "16");
            cases.set(16, uneCase);
            uneCase = cases.get(17);
            uneCase.set(0, "17");
            cases.set(17, uneCase);
            uneCase = cases.get(18);
            uneCase.set(0, "18");
            cases.set(18, uneCase);
            uneCase = cases.get(19);
            uneCase.set(0, "19");
            cases.set(19, uneCase);
            uneCase = cases.get(20);
            uneCase.set(0, "20");
            cases.set(20, uneCase);
            uneCase = cases.get(21);
            uneCase.set(0, "21");
            cases.set(21, uneCase);
            uneCase = cases.get(22);
            uneCase.set(0, "22");
            cases.set(22, uneCase);
            uneCase = cases.get(23);
            uneCase.set(0, "23");
            cases.set(23, uneCase);
            uneCase = cases.get(24);
            uneCase.set(0, "24");
            cases.set(24, uneCase);
            uneCase = cases.get(25);
            uneCase.set(0, "25");
            cases.set(25, uneCase);
            uneCase = cases.get(26);
            uneCase.set(0, "26");
            cases.set(26, uneCase);
            uneCase = cases.get(27);
            uneCase.set(0, "27");
            cases.set(27, uneCase);
            uneCase = cases.get(28);
            uneCase.set(0, "28");
            cases.set(28, uneCase);

            if (numberOfDaysInThisMonth > 28)
            {
                uneCase = cases.get(29);
                uneCase.set(0, "29");
                cases.set(29, uneCase);
            }

            if (numberOfDaysInThisMonth > 29)
            {
                uneCase = cases.get(30);
                uneCase.set(0, "30");
                cases.set(30, uneCase);
            }
            if (numberOfDaysInThisMonth > 30)
            {
                uneCase = cases.get(31);
                uneCase.set(0, "31");
                cases.set(31, uneCase);
            }
        }



        if (pJourDuMois == 4)
        {
            uneCase = cases.get(2);
            uneCase.set(0, "01");
            cases.set(2, uneCase);
            uneCase = cases.get(3);
            uneCase.set(0, "02");
            cases.set(3, uneCase);
            uneCase = cases.get(4);
            uneCase.set(0, "03");
            cases.set(4, uneCase);
            uneCase = cases.get(5);
            uneCase.set(0, "04");
            cases.set(5, uneCase);
            uneCase = cases.get(6);
            uneCase.set(0, "05");
            cases.set(6, uneCase);
            uneCase = cases.get(7);
            uneCase.set(0, "06");
            cases.set(7, uneCase);
            uneCase = cases.get(8);
            uneCase.set(0, "07");
            cases.set(8, uneCase);
            uneCase = cases.get(9);
            uneCase.set(0, "08");
            cases.set(9, uneCase);
            uneCase = cases.get(10);
            uneCase.set(0, "09");
            cases.set(10, uneCase);
            uneCase = cases.get(11);
            uneCase.set(0, "10");
            cases.set(11, uneCase);
            uneCase = cases.get(12);
            uneCase.set(0, "11");
            cases.set(12, uneCase);
            uneCase = cases.get(13);
            uneCase.set(0, "12");
            cases.set(13, uneCase);
            uneCase = cases.get(14);
            uneCase.set(0, "13");
            cases.set(14, uneCase);
            uneCase = cases.get(15);
            uneCase.set(0, "14");
            cases.set(15, uneCase);
            uneCase = cases.get(16);
            uneCase.set(0, "15");
            cases.set(16, uneCase);
            uneCase = cases.get(17);
            uneCase.set(0, "16");
            cases.set(17, uneCase);
            uneCase = cases.get(18);
            uneCase.set(0, "17");
            cases.set(18, uneCase);
            uneCase = cases.get(19);
            uneCase.set(0, "18");
            cases.set(19, uneCase);
            uneCase = cases.get(20);
            uneCase.set(0, "19");
            cases.set(20, uneCase);
            uneCase = cases.get(21);
            uneCase.set(0, "20");
            cases.set(21, uneCase);
            uneCase = cases.get(22);
            uneCase.set(0, "21");
            cases.set(22, uneCase);
            uneCase = cases.get(23);
            uneCase.set(0, "22");
            cases.set(23, uneCase);
            uneCase = cases.get(24);
            uneCase.set(0, "23");
            cases.set(24, uneCase);
            uneCase = cases.get(25);
            uneCase.set(0, "24");
            cases.set(25, uneCase);
            uneCase = cases.get(26);
            uneCase.set(0, "25");
            cases.set(26, uneCase);
            uneCase = cases.get(27);
            uneCase.set(0, "26");
            cases.set(27, uneCase);
            uneCase = cases.get(28);
            uneCase.set(0, "27");
            cases.set(28, uneCase);
            uneCase = cases.get(29);
            uneCase.set(0, "28");
            cases.set(29, uneCase);

            if (numberOfDaysInThisMonth > 28)
            {
                uneCase = cases.get(30);
                uneCase.set(0, "29");
                cases.set(30, uneCase);
            }

            if (numberOfDaysInThisMonth > 29)
            {
                uneCase = cases.get(31);
                uneCase.set(0, "30");
                cases.set(31, uneCase);
            }
            if (numberOfDaysInThisMonth > 30)
            {
                uneCase = cases.get(32);
                uneCase.set(0, "31");
                cases.set(32, uneCase);
            }
        }



        if (pJourDuMois == 5)
        {
            uneCase = cases.get(3);
            uneCase.set(0, "01");
            cases.set(3, uneCase);
            uneCase = cases.get(4);
            uneCase.set(0, "02");
            cases.set(4, uneCase);
            uneCase = cases.get(5);
            uneCase.set(0, "03");
            cases.set(5, uneCase);
            uneCase = cases.get(6);
            uneCase.set(0, "04");
            cases.set(6, uneCase);
            uneCase = cases.get(7);
            uneCase.set(0, "05");
            cases.set(7, uneCase);
            uneCase = cases.get(8);
            uneCase.set(0, "06");
            cases.set(8, uneCase);
            uneCase = cases.get(9);
            uneCase.set(0, "07");
            cases.set(9, uneCase);
            uneCase = cases.get(10);
            uneCase.set(0, "08");
            cases.set(10, uneCase);
            uneCase = cases.get(11);
            uneCase.set(0, "09");
            cases.set(11, uneCase);
            uneCase = cases.get(12);
            uneCase.set(0, "10");
            cases.set(12, uneCase);
            uneCase = cases.get(13);
            uneCase.set(0, "11");
            cases.set(13, uneCase);
            uneCase = cases.get(14);
            uneCase.set(0, "12");
            cases.set(14, uneCase);
            uneCase = cases.get(15);
            uneCase.set(0, "13");
            cases.set(15, uneCase);
            uneCase = cases.get(16);
            uneCase.set(0, "14");
            cases.set(16, uneCase);
            uneCase = cases.get(17);
            uneCase.set(0, "15");
            cases.set(17, uneCase);
            uneCase = cases.get(18);
            uneCase.set(0, "16");
            cases.set(18, uneCase);
            uneCase = cases.get(19);
            uneCase.set(0, "17");
            cases.set(19, uneCase);
            uneCase = cases.get(20);
            uneCase.set(0, "18");
            cases.set(20, uneCase);
            uneCase = cases.get(21);
            uneCase.set(0, "19");
            cases.set(21, uneCase);
            uneCase = cases.get(22);
            uneCase.set(0, "20");
            cases.set(22, uneCase);
            uneCase = cases.get(23);
            uneCase.set(0, "21");
            cases.set(23, uneCase);
            uneCase = cases.get(24);
            uneCase.set(0, "22");
            cases.set(24, uneCase);
            uneCase = cases.get(25);
            uneCase.set(0, "23");
            cases.set(25, uneCase);
            uneCase = cases.get(26);
            uneCase.set(0, "24");
            cases.set(26, uneCase);
            uneCase = cases.get(27);
            uneCase.set(0, "25");
            cases.set(27, uneCase);
            uneCase = cases.get(28);
            uneCase.set(0, "26");
            cases.set(28, uneCase);
            uneCase = cases.get(29);
            uneCase.set(0, "27");
            cases.set(29, uneCase);
            uneCase = cases.get(30);
            uneCase.set(0, "28");
            cases.set(30, uneCase);

            if (numberOfDaysInThisMonth > 28)
            {
                uneCase = cases.get(31);
                uneCase.set(0, "29");
                cases.set(31, uneCase);
            }

            if (numberOfDaysInThisMonth > 29)
            {
                uneCase = cases.get(32);
                uneCase.set(0, "30");
                cases.set(32, uneCase);
            }
            if (numberOfDaysInThisMonth > 30)
            {
                uneCase = cases.get(33);
                uneCase.set(0, "31");
                cases.set(33, uneCase);
            }
        }



        if (pJourDuMois == 6)
        {
            uneCase = cases.get(4);
            uneCase.set(0, "01");
            cases.set(4, uneCase);
            uneCase = cases.get(5);
            uneCase.set(0, "02");
            cases.set(5, uneCase);
            uneCase = cases.get(6);
            uneCase.set(0, "03");
            cases.set(6, uneCase);
            uneCase = cases.get(7);
            uneCase.set(0, "04");
            cases.set(7, uneCase);
            uneCase = cases.get(8);
            uneCase.set(0, "05");
            cases.set(8, uneCase);
            uneCase = cases.get(9);
            uneCase.set(0, "06");
            cases.set(9, uneCase);
            uneCase = cases.get(10);
            uneCase.set(0, "07");
            cases.set(10, uneCase);
            uneCase = cases.get(11);
            uneCase.set(0, "08");
            cases.set(11, uneCase);
            uneCase = cases.get(12);
            uneCase.set(0, "09");
            cases.set(12, uneCase);
            uneCase = cases.get(13);
            uneCase.set(0, "10");
            cases.set(13, uneCase);
            uneCase = cases.get(14);
            uneCase.set(0, "11");
            cases.set(14, uneCase);
            uneCase = cases.get(15);
            uneCase.set(0, "12");
            cases.set(15, uneCase);
            uneCase = cases.get(16);
            uneCase.set(0, "13");
            cases.set(16, uneCase);
            uneCase = cases.get(17);
            uneCase.set(0, "14");
            cases.set(17, uneCase);
            uneCase = cases.get(18);
            uneCase.set(0, "15");
            cases.set(18, uneCase);
            uneCase = cases.get(19);
            uneCase.set(0, "16");
            cases.set(19, uneCase);
            uneCase = cases.get(20);
            uneCase.set(0, "17");
            cases.set(20, uneCase);
            uneCase = cases.get(21);
            uneCase.set(0, "18");
            cases.set(21, uneCase);
            uneCase = cases.get(22);
            uneCase.set(0, "19");
            cases.set(22, uneCase);
            uneCase = cases.get(23);
            uneCase.set(0, "20");
            cases.set(23, uneCase);
            uneCase = cases.get(24);
            uneCase.set(0, "21");
            cases.set(24, uneCase);
            uneCase = cases.get(25);
            uneCase.set(0, "22");
            cases.set(25, uneCase);
            uneCase = cases.get(26);
            uneCase.set(0, "23");
            cases.set(26, uneCase);
            uneCase = cases.get(27);
            uneCase.set(0, "24");
            cases.set(27, uneCase);
            uneCase = cases.get(28);
            uneCase.set(0, "25");
            cases.set(28, uneCase);
            uneCase = cases.get(29);
            uneCase.set(0, "26");
            cases.set(29, uneCase);
            uneCase = cases.get(30);
            uneCase.set(0, "27");
            cases.set(30, uneCase);
            uneCase = cases.get(31);
            uneCase.set(0, "28");
            cases.set(31, uneCase);

            if (numberOfDaysInThisMonth > 28)
            {
                uneCase = cases.get(32);
                uneCase.set(0, "29");
                cases.set(32, uneCase);
            }

            if (numberOfDaysInThisMonth > 29)
            {
                uneCase = cases.get(33);
                uneCase.set(0, "30");
                cases.set(33, uneCase);
            }
            if (numberOfDaysInThisMonth > 30)
            {
                uneCase = cases.get(34);
                uneCase.set(0, "31");
                cases.set(34, uneCase);
            }
        }



        if (pJourDuMois == 7)
        {
            uneCase = cases.get(5);
            uneCase.set(0, "01");
            cases.set(5, uneCase);
            uneCase = cases.get(6);
            uneCase.set(0, "02");
            cases.set(6, uneCase);
            uneCase = cases.get(7);
            uneCase.set(0, "03");
            cases.set(7, uneCase);
            uneCase = cases.get(8);
            uneCase.set(0, "04");
            cases.set(8, uneCase);
            uneCase = cases.get(9);
            uneCase.set(0, "05");
            cases.set(9, uneCase);
            uneCase = cases.get(10);
            uneCase.set(0, "06");
            cases.set(10, uneCase);
            uneCase = cases.get(11);
            uneCase.set(0, "07");
            cases.set(11, uneCase);
            uneCase = cases.get(12);
            uneCase.set(0, "08");
            cases.set(12, uneCase);
            uneCase = cases.get(13);
            uneCase.set(0, "09");
            cases.set(13, uneCase);
            uneCase = cases.get(14);
            uneCase.set(0, "10");
            cases.set(14, uneCase);
            uneCase = cases.get(15);
            uneCase.set(0, "11");
            cases.set(15, uneCase);
            uneCase = cases.get(16);
            uneCase.set(0, "12");
            cases.set(16, uneCase);
            uneCase = cases.get(17);
            uneCase.set(0, "13");
            cases.set(17, uneCase);
            uneCase = cases.get(18);
            uneCase.set(0, "14");
            cases.set(18, uneCase);
            uneCase = cases.get(19);
            uneCase.set(0, "15");
            cases.set(19, uneCase);
            uneCase = cases.get(20);
            uneCase.set(0, "16");
            cases.set(20, uneCase);
            uneCase = cases.get(21);
            uneCase.set(0, "17");
            cases.set(21, uneCase);
            uneCase = cases.get(22);
            uneCase.set(0, "18");
            cases.set(22, uneCase);
            uneCase = cases.get(23);
            uneCase.set(0, "19");
            cases.set(23, uneCase);
            uneCase = cases.get(24);
            uneCase.set(0, "20");
            cases.set(24, uneCase);
            uneCase = cases.get(25);
            uneCase.set(0, "21");
            cases.set(25, uneCase);
            uneCase = cases.get(26);
            uneCase.set(0, "22");
            cases.set(26, uneCase);
            uneCase = cases.get(27);
            uneCase.set(0, "23");
            cases.set(27, uneCase);
            uneCase = cases.get(28);
            uneCase.set(0, "24");
            cases.set(28, uneCase);
            uneCase = cases.get(29);
            uneCase.set(0, "25");
            cases.set(29, uneCase);
            uneCase = cases.get(30);
            uneCase.set(0, "26");
            cases.set(30, uneCase);
            uneCase = cases.get(31);
            uneCase.set(0, "27");
            cases.set(31, uneCase);
            uneCase = cases.get(32);
            uneCase.set(0, "28");
            cases.set(32, uneCase);

            if (numberOfDaysInThisMonth > 28)
            {
                uneCase = cases.get(33);
                uneCase.set(0, "29");
                cases.set(33, uneCase);
            }

            if (numberOfDaysInThisMonth > 29)
            {
                uneCase = cases.get(34);
                uneCase.set(0, "30");
                cases.set(34, uneCase);
            }
            if (numberOfDaysInThisMonth > 30)
            {
                uneCase = cases.get(35);
                uneCase.set(0, "31");
                cases.set(35, uneCase);
            }
        }



        if (pJourDuMois == 1)
        {
            uneCase = cases.get(6);
            uneCase.set(0, "01");
            cases.set(6, uneCase);
            uneCase = cases.get(7);
            uneCase.set(0, "02");
            cases.set(7, uneCase);
            uneCase = cases.get(8);
            uneCase.set(0, "03");
            cases.set(8, uneCase);
            uneCase = cases.get(9);
            uneCase.set(0, "04");
            cases.set(9, uneCase);
            uneCase = cases.get(10);
            uneCase.set(0, "05");
            cases.set(10, uneCase);
            uneCase = cases.get(11);
            uneCase.set(0, "06");
            cases.set(11, uneCase);
            uneCase = cases.get(12);
            uneCase.set(0, "07");
            cases.set(12, uneCase);
            uneCase = cases.get(13);
            uneCase.set(0, "08");
            cases.set(13, uneCase);
            uneCase = cases.get(14);
            uneCase.set(0, "09");
            cases.set(14, uneCase);
            uneCase = cases.get(15);
            uneCase.set(0, "10");
            cases.set(15, uneCase);
            uneCase = cases.get(16);
            uneCase.set(0, "11");
            cases.set(16, uneCase);
            uneCase = cases.get(17);
            uneCase.set(0, "12");
            cases.set(17, uneCase);
            uneCase = cases.get(18);
            uneCase.set(0, "13");
            cases.set(18, uneCase);
            uneCase = cases.get(19);
            uneCase.set(0, "14");
            cases.set(19, uneCase);
            uneCase = cases.get(20);
            uneCase.set(0, "15");
            cases.set(20, uneCase);
            uneCase = cases.get(21);
            uneCase.set(0, "16");
            cases.set(21, uneCase);
            uneCase = cases.get(22);
            uneCase.set(0, "17");
            cases.set(22, uneCase);
            uneCase = cases.get(23);
            uneCase.set(0, "18");
            cases.set(23, uneCase);
            uneCase = cases.get(24);
            uneCase.set(0, "19");
            cases.set(24, uneCase);
            uneCase = cases.get(25);
            uneCase.set(0, "20");
            cases.set(25, uneCase);
            uneCase = cases.get(26);
            uneCase.set(0, "21");
            cases.set(26, uneCase);
            uneCase = cases.get(27);
            uneCase.set(0, "22");
            cases.set(27, uneCase);
            uneCase = cases.get(28);
            uneCase.set(0, "23");
            cases.set(28, uneCase);
            uneCase = cases.get(29);
            uneCase.set(0, "24");
            cases.set(29, uneCase);
            uneCase = cases.get(30);
            uneCase.set(0, "25");
            cases.set(30, uneCase);
            uneCase = cases.get(31);
            uneCase.set(0, "26");
            cases.set(31, uneCase);
            uneCase = cases.get(32);
            uneCase.set(0, "27");
            cases.set(32, uneCase);
            uneCase = cases.get(33);
            uneCase.set(0, "28");
            cases.set(33, uneCase);

            if (numberOfDaysInThisMonth > 28)
            {
                uneCase = cases.get(34);
                uneCase.set(0, "29");
                cases.set(34, uneCase);
            }

            if (numberOfDaysInThisMonth > 29)
            {
                uneCase = cases.get(35);
                uneCase.set(0, "30");
                cases.set(35, uneCase);
            }
            if (numberOfDaysInThisMonth > 30)
            {
                uneCase = cases.get(36);
                uneCase.set(0, "31");
                cases.set(36, uneCase);
            }
        }

        detJourActuel();
    }
    void razJoursMois() {
        setText(calendrier_c1, "");
        setText(calendrier_c2, "");
        setText(calendrier_c3, "");
        setText(calendrier_c4, "");
        setText(calendrier_c5, "");
        setText(calendrier_c6, "");
        setText(calendrier_c7, "");
        setText(calendrier_c8, "");
        setText(calendrier_c9, "");
        setText(calendrier_c10, "");
        setText(calendrier_c11, "");
        setText(calendrier_c12, "");
        setText(calendrier_c13, "");
        setText(calendrier_c14, "");
        setText(calendrier_c15, "");
        setText(calendrier_c16, "");
        setText(calendrier_c17, "");
        setText(calendrier_c18, "");
        setText(calendrier_c19, "");
        setText(calendrier_c20, "");
        setText(calendrier_c21, "");
        setText(calendrier_c22, "");
        setText(calendrier_c23, "");
        setText(calendrier_c24, "");
        setText(calendrier_c25, "");
        setText(calendrier_c26, "");
        setText(calendrier_c27, "");
        setText(calendrier_c28, "");
        setText(calendrier_c29, "");
        setText(calendrier_c30, "");
        setText(calendrier_c31, "");
        setText(calendrier_c32, "");
        setText(calendrier_c33, "");
        setText(calendrier_c34, "");
        setText(calendrier_c35, "");
        setText(calendrier_c36, "");
        setText(calendrier_c37, "");
        setText(calendrier_c38, "");
        setText(calendrier_c39, "");
        setText(calendrier_c40, "");
        setText(calendrier_c41, "");
        setText(calendrier_c42, "");

        setBg(calendrier_c1, "j");
        setBg(calendrier_c2, "j");
        setBg(calendrier_c3, "j");
        setBg(calendrier_c4, "j");
        setBg(calendrier_c5, "j");
        setBg(calendrier_c6, "j");
        setBg(calendrier_c7, "j");
        setBg(calendrier_c8, "j");
        setBg(calendrier_c9, "j");
        setBg(calendrier_c10, "j");
        setBg(calendrier_c11, "j");
        setBg(calendrier_c12, "j");
        setBg(calendrier_c13, "j");
        setBg(calendrier_c14, "j");
        setBg(calendrier_c15, "j");
        setBg(calendrier_c16, "j");
        setBg(calendrier_c17, "j");
        setBg(calendrier_c18, "j");
        setBg(calendrier_c19, "j");
        setBg(calendrier_c20, "j");
        setBg(calendrier_c21, "j");
        setBg(calendrier_c22, "j");
        setBg(calendrier_c23, "j");
        setBg(calendrier_c24, "j");
        setBg(calendrier_c25, "j");
        setBg(calendrier_c26, "j");
        setBg(calendrier_c27, "j");
        setBg(calendrier_c28, "j");
        setBg(calendrier_c29, "j");
        setBg(calendrier_c30, "j");
        setBg(calendrier_c31, "j");
        setBg(calendrier_c32, "j");
        setBg(calendrier_c33, "j");
        setBg(calendrier_c34, "j");
        setBg(calendrier_c35, "j");
        setBg(calendrier_c36, "j");
        setBg(calendrier_c37, "j");
        setBg(calendrier_c38, "j");
        setBg(calendrier_c39, "j");
        setBg(calendrier_c40, "j");
        setBg(calendrier_c41, "j");
        setBg(calendrier_c42, "j");

        cases.clear();

        for (int i = 1; i < 43; i++) {
            List<String> uneCase = new ArrayList<String>();

            uneCase.add("");
            uneCase.add("null");

            cases.add(uneCase);
        }
    }
    void majCalendrier() {
        // Log.i(TAG, String.valueOf(cases));

        Integer numMois = Integer.parseInt(sdfMonth.format(dateCalendrier.getTime()));

        if (numMois == 1) {
            setText(calendrier_nomDuMois, NOM_MOIS_01 + " " + sdfYear.format(dateCalendrier.getTime()));
        }

        if (numMois == 2) {
            setText(calendrier_nomDuMois, NOM_MOIS_02 + " " + sdfYear.format(dateCalendrier.getTime()));
        }

        if (numMois == 3) {
            setText(calendrier_nomDuMois, NOM_MOIS_03 + " " + sdfYear.format(dateCalendrier.getTime()));
        }

        if (numMois == 4) {
            setText(calendrier_nomDuMois, NOM_MOIS_04 + " " + sdfYear.format(dateCalendrier.getTime()));
        }

        if (numMois == 5) {
            setText(calendrier_nomDuMois, NOM_MOIS_05 + " " + sdfYear.format(dateCalendrier.getTime()));
        }

        if (numMois == 6) {
            setText(calendrier_nomDuMois, NOM_MOIS_06 + " " + sdfYear.format(dateCalendrier.getTime()));
        }

        if (numMois == 7) {
            setText(calendrier_nomDuMois, NOM_MOIS_07 + " " + sdfYear.format(dateCalendrier.getTime()));
        }

        if (numMois == 8) {
            setText(calendrier_nomDuMois, NOM_MOIS_08 + " " + sdfYear.format(dateCalendrier.getTime()));
        }

        if (numMois == 9) {
            setText(calendrier_nomDuMois, NOM_MOIS_09 + " " + sdfYear.format(dateCalendrier.getTime()));
        }

        if (numMois == 10) {
            setText(calendrier_nomDuMois, NOM_MOIS_10 + " " + sdfYear.format(dateCalendrier.getTime()));
        }

        if (numMois == 11) {
            setText(calendrier_nomDuMois, NOM_MOIS_11 + " " + sdfYear.format(dateCalendrier.getTime()));
        }

        if (numMois == 12) {
            setText(calendrier_nomDuMois, NOM_MOIS_12 + " " + sdfYear.format(dateCalendrier.getTime()));
        }

        List<String> uneCase = new ArrayList<String>();

        uneCase = cases.get(0);
        setText(calendrier_c1, uneCase.get(0));
        setBg(calendrier_c1, uneCase.get(1));

        uneCase = cases.get(1);
        setText(calendrier_c2, uneCase.get(0));
        setBg(calendrier_c2, uneCase.get(1));

        uneCase = cases.get(2);
        setText(calendrier_c3, uneCase.get(0));
        setBg(calendrier_c3, uneCase.get(1));

        uneCase = cases.get(3);
        setText(calendrier_c4, uneCase.get(0));
        setBg(calendrier_c4, uneCase.get(1));

        uneCase = cases.get(4);
        setText(calendrier_c5, uneCase.get(0));
        setBg(calendrier_c5, uneCase.get(1));

        uneCase = cases.get(5);
        setText(calendrier_c6, uneCase.get(0));
        setBg(calendrier_c6, uneCase.get(1));
        uneCase = cases.get(6);
        setText(calendrier_c7, uneCase.get(0));
        setBg(calendrier_c7, uneCase.get(1));

        uneCase = cases.get(7);
        setText(calendrier_c8, uneCase.get(0));
        setBg(calendrier_c8, uneCase.get(1));

        uneCase = cases.get(8);
        setText(calendrier_c9, uneCase.get(0));
        setBg(calendrier_c9, uneCase.get(1));

        uneCase = cases.get(9);
        setText(calendrier_c10, uneCase.get(0));
        setBg(calendrier_c10, uneCase.get(1));

        uneCase = cases.get(10);
        setText(calendrier_c11, uneCase.get(0));
        setBg(calendrier_c11, uneCase.get(1));

        uneCase = cases.get(11);
        setText(calendrier_c12, uneCase.get(0));
        setBg(calendrier_c12, uneCase.get(1));

        uneCase = cases.get(12);
        setText(calendrier_c13, uneCase.get(0));
        setBg(calendrier_c13, uneCase.get(1));

        uneCase = cases.get(13);
        setText(calendrier_c14, uneCase.get(0));
        setBg(calendrier_c14, uneCase.get(1));

        uneCase = cases.get(14);
        setText(calendrier_c15, uneCase.get(0));
        setBg(calendrier_c15, uneCase.get(1));

        uneCase = cases.get(15);
        setText(calendrier_c16, uneCase.get(0));
        setBg(calendrier_c16, uneCase.get(1));

        uneCase = cases.get(16);
        setText(calendrier_c17, uneCase.get(0));
        setBg(calendrier_c17, uneCase.get(1));

        uneCase = cases.get(17);
        setText(calendrier_c18, uneCase.get(0));
        setBg(calendrier_c18, uneCase.get(1));

        uneCase = cases.get(18);
        setText(calendrier_c19, uneCase.get(0));
        setBg(calendrier_c19, uneCase.get(1));

        uneCase = cases.get(19);
        setText(calendrier_c20, uneCase.get(0));
        setBg(calendrier_c20, uneCase.get(1));

        uneCase = cases.get(20);
        setText(calendrier_c21, uneCase.get(0));
        setBg(calendrier_c21, uneCase.get(1));

        uneCase = cases.get(21);
        setText(calendrier_c22, uneCase.get(0));
        setBg(calendrier_c22, uneCase.get(1));

        uneCase = cases.get(22);
        setText(calendrier_c23, uneCase.get(0));
        setBg(calendrier_c23, uneCase.get(1));

        uneCase = cases.get(23);
        setText(calendrier_c24, uneCase.get(0));
        setBg(calendrier_c24, uneCase.get(1));

        uneCase = cases.get(24);
        setText(calendrier_c25, uneCase.get(0));
        setBg(calendrier_c25, uneCase.get(1));

        uneCase = cases.get(25);
        setText(calendrier_c26, uneCase.get(0));
        setBg(calendrier_c26, uneCase.get(1));

        uneCase = cases.get(26);
        setText(calendrier_c27, uneCase.get(0));
        setBg(calendrier_c27, uneCase.get(1));

        uneCase = cases.get(27);
        setText(calendrier_c28, uneCase.get(0));
        setBg(calendrier_c28, uneCase.get(1));

        uneCase = cases.get(28);
        setText(calendrier_c29, uneCase.get(0));
        setBg(calendrier_c29, uneCase.get(1));

        uneCase = cases.get(29);
        setText(calendrier_c30, uneCase.get(0));
        setBg(calendrier_c30, uneCase.get(1));

        uneCase = cases.get(30);
        setText(calendrier_c31, uneCase.get(0));
        setBg(calendrier_c31, uneCase.get(1));

        uneCase = cases.get(31);
        setText(calendrier_c32, uneCase.get(0));
        setBg(calendrier_c32, uneCase.get(1));

        uneCase = cases.get(32);
        setText(calendrier_c33, uneCase.get(0));
        setBg(calendrier_c33, uneCase.get(1));

        uneCase = cases.get(33);
        setText(calendrier_c34, uneCase.get(0));
        setBg(calendrier_c34, uneCase.get(1));

        uneCase = cases.get(34);
        setText(calendrier_c35, uneCase.get(0));
        setBg(calendrier_c35, uneCase.get(1));

        uneCase = cases.get(35);
        setText(calendrier_c36, uneCase.get(0));
        setBg(calendrier_c36, uneCase.get(1));

        uneCase = cases.get(36);
        setText(calendrier_c37, uneCase.get(0));
        setBg(calendrier_c37, uneCase.get(1));

        uneCase = cases.get(37);
        setText(calendrier_c38, uneCase.get(0));
        setBg(calendrier_c38, uneCase.get(1));

        uneCase = cases.get(38);
        setText(calendrier_c39, uneCase.get(0));
        setBg(calendrier_c39, uneCase.get(1));

        uneCase = cases.get(39);
        setText(calendrier_c40, uneCase.get(0));
        setBg(calendrier_c40, uneCase.get(1));

        uneCase = cases.get(40);
        setText(calendrier_c41, uneCase.get(0));
        setBg(calendrier_c41, uneCase.get(1));

        uneCase = cases.get(41);
        setText(calendrier_c42, uneCase.get(0));
        setBg(calendrier_c42, uneCase.get(1));
    }
    void majEvt() {
        setText(calendrier_nomDeEvt, nomEvt);

        Log.i(TAG + "_", "numEvt : "+numEvt);
        if (Integer.parseInt(numEvt) == 0) {
            setHW(calendrier_choixEvt, 0, 0);
        }
        else {
            setHW(calendrier_choixEvt, 720, 86);
            setText(calendrier_affPage, numEvt);
            calendrier_pageL.setVisibility(View.INVISIBLE);

            calendrier_pageR.setVisibility(View.VISIBLE);
            if (evtAjh.size() == 1) {
                calendrier_pageR.setVisibility(View.INVISIBLE);
            }
        }
    }
    void razEvt() {
        numEvt = "0";
        nomEvt = "";
        evtAjh.clear();
        majEvt();
    }
    void majConflit() {
        razConflit();
        /*Log.i("ConflitBug", "razConflit");*/
        Integer p = Integer.parseInt(String.valueOf(conflit_affPage.getText()));
        /*Log.i("ConflitBug", "detPage");

        Log.i("ConflitBug", "cP " + chaleurPosterieur);
        Log.i("ConflitBug", "lignesConflit " + lignesConflit);
        Log.i("ConflitBug", "formule " + ((p-1)*10+0));

        Log.i("ConflitBug", chaleurPosterieur.size() + " " + ((p-1)*10+1));*/

        if (chaleurPosterieur.size() > ((p-1)*10+0)) {
            lignesConflit.add(chaleurPosterieur.get((p-1)*10+0));
        }
        else {
            lignesConflit.add("");
        }

        if (chaleurPosterieur.size() > ((p-1)*10+1)) {
            lignesConflit.add(chaleurPosterieur.get((p-1)*10+1));
        }
        else {
            lignesConflit.add("");
        }

        if (chaleurPosterieur.size() > ((p-1)*10+2)) {
            lignesConflit.add(chaleurPosterieur.get((p-1)*10+2));
        }
        else {
            lignesConflit.add("");
        }

        if (chaleurPosterieur.size() > ((p-1)*10+3)) {
            lignesConflit.add(chaleurPosterieur.get((p-1)*10+3));
        }
        else {
            lignesConflit.add("");
        }

        if (chaleurPosterieur.size() > ((p-1)*10+4)) {
            lignesConflit.add(chaleurPosterieur.get((p-1)*10+4));
        }
        else {
            lignesConflit.add("");
        }

        if (chaleurPosterieur.size() > ((p-1)*10+5)) {
            lignesConflit.add(chaleurPosterieur.get((p-1)*10+5));
        }
        else {
            lignesConflit.add("");
        }

        if (chaleurPosterieur.size() > ((p-1)*10+6)) {
            lignesConflit.add(chaleurPosterieur.get((p-1)*10+6));
        }
        else {
            lignesConflit.add("");
        }

        if (chaleurPosterieur.size() > ((p-1)*10+7)) {
            lignesConflit.add(chaleurPosterieur.get((p-1)*10+7));
        }
        else {
            lignesConflit.add("");
        }

        if (chaleurPosterieur.size() > ((p-1)*10+8)) {
            lignesConflit.add(chaleurPosterieur.get((p-1)*10+8));
        }
        else {
            lignesConflit.add("");
        }

        if (chaleurPosterieur.size() > ((p-1)*10+9)) {
            lignesConflit.add(chaleurPosterieur.get((p-1)*10+9));
        }
        else {
            lignesConflit.add("");
        }

        Log.i("ConflitBug", "attribution List");

        majGraphiqueConflit();
    }
    void majGraphiqueConflit() {
        conflit_l1.setVisibility(View.VISIBLE);
        if (lignesConflit.get(0).equals("")) {
            conflit_l1.setVisibility(View.INVISIBLE);
        }
        else {
            conflit_evt1.setText(lignesConflit.get(0));
        }
        conflit_l2.setVisibility(View.VISIBLE);
        if (lignesConflit.get(1).equals("")) {
            conflit_l2.setVisibility(View.INVISIBLE);
        }
        else {
            conflit_evt2.setText(lignesConflit.get(1));
        }
        conflit_l3.setVisibility(View.VISIBLE);
        if (lignesConflit.get(2).equals("")) {
            conflit_l3.setVisibility(View.INVISIBLE);
        }
        else {
            conflit_evt3.setText(lignesConflit.get(2));
        }
        conflit_l4.setVisibility(View.VISIBLE);
        if (lignesConflit.get(3).equals("")) {
            conflit_l4.setVisibility(View.INVISIBLE);
        }
        else {
            conflit_evt4.setText(lignesConflit.get(3));
        }
        conflit_l5.setVisibility(View.VISIBLE);
        if (lignesConflit.get(4).equals("")) {
            conflit_l5.setVisibility(View.INVISIBLE);
        }
        else {
            conflit_evt5.setText(lignesConflit.get(4));
        }
        conflit_l6.setVisibility(View.VISIBLE);
        if (lignesConflit.get(5).equals("")) {
            conflit_l6.setVisibility(View.INVISIBLE);
        }
        else {
            conflit_evt6.setText(lignesConflit.get(5));
        }
        conflit_l7.setVisibility(View.VISIBLE);
        if (lignesConflit.get(6).equals("")) {
            conflit_l7.setVisibility(View.INVISIBLE);
        }
        else {
            conflit_evt7.setText(lignesConflit.get(6));
        }
        conflit_l8.setVisibility(View.VISIBLE);
        if (lignesConflit.get(7).equals("")) {
            conflit_l8.setVisibility(View.INVISIBLE);
        }
        else {
            conflit_evt8.setText(lignesConflit.get(7));
        }
        conflit_l9.setVisibility(View.VISIBLE);
        if (lignesConflit.get(8).equals("")) {
            conflit_l9.setVisibility(View.INVISIBLE);
        }
        else {
            conflit_evt9.setText(lignesConflit.get(8));
        }
        conflit_l10.setVisibility(View.VISIBLE);
        if (lignesConflit.get(9).equals("")) {
            conflit_l10.setVisibility(View.INVISIBLE);
        }
        else {
            conflit_evt10.setText(lignesConflit.get(9));
        }

        razConflit();
    }
    void razConflit() {
        lignesConflit.clear();
    }


    // Renseignement graphique
    void trouverWH() {
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        height = metrics.heightPixels;
        width = metrics.widthPixels;
        Log.i(TAG, width + "x" + height);
    }
    public void setMargins(View v, int l, int t, int r, int b) {
        if (v.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
            p.setMargins(l * width / 720, t * width / 1280, r * width / 720, b * width / 1280);
            v.requestLayout();
        }
    }
    public void setHW(View v, int w, int h) {
        v.setLayoutParams(new LinearLayout.LayoutParams(w * width / 720, (h * height) / 1280));
    }
    public void setTextSize(TextView v, float s) {
        v.setTextSize((s * height) / 1280);
    }
    public void setText(TextView v, String t) {
        v.setText(t);

    }
    public void setBg(TextView v, String t) {
        if (t.equals("null")) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                v.setBackground(getDrawable(R.drawable.calendrier_j));
                // Log.i(TAG, v.getText() + " passe son background à j");
            }
        }

        if (t.equals("jA")) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                v.setBackground(getDrawable(R.drawable.calendrier_jour_actuel));
                // Log.i(TAG, v.getText() + " passe son background à jA");
            }
        }

        if (t.equals("jC")) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                v.setBackground(getDrawable(R.drawable.calendrier_jour_chaleur));
                // Log.i(TAG, v.getText() + " passe son background à jC");
            }
        }

        if (t.equals("jCS")) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                v.setBackground(getDrawable(R.drawable.calendrier_jour_chaleur_sel));
                // Log.i(TAG, v.getText() + " passe son background à jCS");
            }
        }

        if (t.equals("jG")) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                v.setBackground(getDrawable(R.drawable.calendrier_jour_gestation));
                // Log.i(TAG, v.getText() + " passe son background à jG");
            }
        }

        if (t.equals("jGS")) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                v.setBackground(getDrawable(R.drawable.calendrier_jour_gestation_sel));
                // Log.i(TAG, v.getText() + " passe son background à jGS");
            }
        }
    }


    // Fonctions OnClick
    void OnClickMenuAjouter() {
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
    void OnClickMenuCalendrier() {
        Log.i(TAG, "Ouverture du layout Calendrier");

        //setHW(layoutMain, 720, 1100);
        //setHW(layoutAjouter, 720, 1100);
        setHW(layoutCalendrier, 720, 1100);
        //setHW(layoutConflit, 720, 1100);

        setHW(layoutMain, 720, 0);  // Faire disparaitre Main
        setHW(layoutAjouter, 720, 0);  // Faire disparaitre Ajouter
        //setHW(layoutCalendrier, 720, 0);  // Faire disparaitre Calendrier
        setHW(layoutConflit, 720, 0);  // Faire disparaitre Conflit

        joursDuMois();
        majCalendrier();
        razEvt();
        cOUg = "";
    }
    void OnClickMenuConflit() {
        Log.i(TAG, "Ouverture du layout Conflit");

        //setHW(layoutMain, 720, 1100);
        //setHW(layoutAjouter, 720, 1100);
        //setHW(layoutCalendrier, 720, 1100);
        setHW(layoutConflit, 720, 1100);

        setHW(layoutMain, 720, 0);  // Faire disparaitre Main
        setHW(layoutAjouter, 720, 0);  // Faire disparaitre Ajouter
        setHW(layoutCalendrier, 720, 0);  // Faire disparaitre Calendrier
        //setHW(layoutConflit, 720, 0);  // Faire disparaitre Conflit

        setText(conflit_affPage, "1");
        conflit_pageL.setVisibility(View.INVISIBLE);
        lignesConflit.clear();
        chaleurPosterieur.clear();

        Calendar now = Calendar.getInstance();

        List<EvtV> evts = new ArrayList<EvtV>();
        evts =  dataManager.chaleurPosterieur(dateSQL.format(now.getTime()));
        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                chaleurPosterieur.add(evt.getNomEvt());
            }
        }

        if (chaleurPosterieur.size() == 0) {
            conflit_choixEvt.setVisibility(View.INVISIBLE);
        }

        if (chaleurPosterieur.size() < 11) {
            conflit_choixEvt.setVisibility(View.INVISIBLE);
        }

        majConflit();

        /*setText(conflit_affPage, "1");


        Calendar now = Calendar.getInstance();

        chaleurPosterieur.clear();
        List<EvtV> evts = new ArrayList<EvtV>();
        evts.clear();
        evts =  dataManager.chaleurPosterieur(dateSQL.format(now.getTime()));

        Log.i(TAG + "_", String.valueOf(chaleurPosterieur.size()));

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                chaleurPosterieur.add(evt.getNomEvt());
            }
        }

        lignesConflit.clear();
        for (int i = 0; i < 10; i++) {
            lignesConflit.add("");
        }

        setHW(conflit_choixEvt, 720, 86);
        if (chaleurPosterieur.size() < 11) {
            setHW(conflit_choixEvt, 0, 0);
            updateMoins10Conflit();
        }
        else {
            Integer numP = Integer.parseInt((String) conflit_affPage.getText());


            if (chaleurPosterieur.size() < ((numP)*10)) {
                updateIncConflit();
                conflit_pageR.setVisibility(View.INVISIBLE);
                conflit_pageL.setVisibility(View.VISIBLE);
            }
            else {
                updateCompletConflit();
                conflit_pageR.setVisibility(View.VISIBLE);
                conflit_pageL.setVisibility(View.VISIBLE);
            }
        }

        conflit_pageL.setVisibility(View.INVISIBLE);

        majConflit();*/
    }
    void OnClickAjouter() throws ParseException {
        setHW(ajouter_notif_car_inc, 0, 0);
        setHW(ajouter_notif_deja_existant, 0, 0);
        setHW(ajouter_notif_evt_vide, 0, 0);


        nomEvt = ajouter_champ.getText().toString();
        boolean cI = false;  // permet de verifier si un caractère interdit est present

        cI = contientCarInterdit(nomEvt);

        if ("".equals(nomEvt)) {
            setHW(ajouter_notif_evt_vide, 720, 130);

            Log.i(TAG, "Tentative d'ajout d'un évènement vide.");
        } else {
            if (cI == true) {
                setHW(ajouter_notif_car_inc, 720, 200);
                Log.i(TAG, "Tentative d'ajout d'un évènement contenant des caractères interdits.");
            } else {
                List<EvtV> evts = dataManager.readByNom(nomEvt);
                Integer lenList = evts.size();

                if (lenList > 0) {
                    setHW(ajouter_notif_deja_existant, 720, 200);
                    Log.i(TAG, "Tentative d'ajout d'un évènement déjà existant.");
                    EvtV evt = evts.get(0);
                    String dD = evt.getDateDebut();

                    ajouter_notif_deja_existant.setText(dateAffichage.format(dateSQL.parse(dD)));
                } else {
                    Calendar tDS = Calendar.getInstance();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String dD = sdf.format(tDS.getTime());
                    tDS.add(tDS.DATE, 21);
                    String dC = sdf.format(tDS.getTime());

                    dataManager.insertEvt(nomEvt, dD, dC);
                    dataManager.close();

                    Log.i(TAG, "Ajout de l'évènement " + nomEvt + " à la BDD.");
                    razChampAjouter();
                }
            }
        }

        if ("uneBaseDeTravail".equals(nomEvt)) {
            dataManager.insertEvt("a", "2019-10-01", "2019-11-01");
            dataManager.insertEvt("aa", "2019-10-01", "2019-11-01");
            dataManager.insertEvt("aaa", "2019-10-01", "2019-11-01");
            dataManager.insertEvt("b", "2019-10-01", "2019-11-05");
            dataManager.insertEvt("bb", "2019-10-01", "2019-11-05");
            dataManager.updateGestation("b", "2019-11-10");
            dataManager.updateGestation("bb", "2019-11-10");
            dataManager.insertEvt("bbb", "2019-10-01", "2019-11-05");
            dataManager.insertEvt("bbbb", "2019-10-01", "2019-11-05");
            dataManager.insertEvt("bbbbb", "2019-10-01", "2019-11-05");
            dataManager.insertEvt("bbbbbb", "2019-10-01", "2019-11-05");
            dataManager.insertEvt("aaaa", "2019-10-01", "2019-11-01");
            dataManager.insertEvt("aaaaa", "2019-10-01", "2019-11-01");
            dataManager.insertEvt("aaaaaa", "2019-10-01", "2019-11-01");
            dataManager.insertEvt("aaaaaaa", "2019-10-01", "2019-11-01");
            dataManager.insertEvt("aaaaaaaa", "2019-10-01", "2019-11-01");
        }
    }
    void OnClickMoisL() throws ParseException {
        moisAv();
        detJourActuel();

        if (cOUg.equals("g")) {
            casesGestation();
        }

        if (cOUg.equals("c")) {
            casesChaleur();
        }


        majCalendrier();
        razEvt();
    }
    void OnClickMoisR() throws ParseException {
        moisAp();
        detJourActuel();

        if (cOUg.equals("g")) {
            casesGestation();
        }

        if (cOUg.equals("c")) {
            casesChaleur();
        }

        majCalendrier();
        razEvt();
    }
    void OnClickChaleur() throws ParseException {
        //Log.i("ClickChal", cOUg);
        if (!cOUg.equals("c")) {
           // Log.i("ClickChal", "RAS");
            joursDuMois();
            //Log.i("ClickChal" + "_", "joursDuMois");
            casesChaleur();
            //Log.i("ClickChal" + "_", "casesChaleur");
            majCalendrier();
            //Log.i("ClickChal" + "_", "majCalr");
            cOUg = "c";
            razEvt();
            //Log.i("ClickChal" + "_", "razEvt");
        }
    }
    void OnClickGestation() throws ParseException {
        if (!cOUg.equals("g")) {
            joursDuMois();
            casesGestation();
            majCalendrier();
            cOUg = "g";
            razEvt();
        }
    }
    void OnClickC1() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c1.getText());
        caseSelectionnee("1");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC2() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c2.getText());
        caseSelectionnee("2");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC3() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c3.getText());
        caseSelectionnee("3");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC4() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c4.getText());
        caseSelectionnee("4");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC5() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c5.getText());
        caseSelectionnee("5");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC6() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c6.getText());
        caseSelectionnee("6");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC7() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c7.getText());
        caseSelectionnee("7");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC8() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c8.getText());
        caseSelectionnee("8");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC9() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c9.getText());
        caseSelectionnee("9");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC10() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c10.getText());
        caseSelectionnee("10");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC11() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c11.getText());
        caseSelectionnee("11");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC12() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c12.getText());
        caseSelectionnee("12");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC13() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c13.getText());
        caseSelectionnee("13");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC14() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c14.getText());
        caseSelectionnee("14");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC15() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c15.getText());
        caseSelectionnee("15");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC16() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c16.getText());
        caseSelectionnee("16");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC17() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c17.getText());
        caseSelectionnee("17");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC18() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c18.getText());
        caseSelectionnee("18");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC19() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c19.getText());
        caseSelectionnee("19");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC20() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c20.getText());
        caseSelectionnee("20");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC21() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c21.getText());
        caseSelectionnee("21");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC22() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c22.getText());
        caseSelectionnee("22");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC23() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c23.getText());
        caseSelectionnee("23");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC24() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c24.getText());
        caseSelectionnee("24");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC25() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c25.getText());
        caseSelectionnee("25");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC26() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c26.getText());
        caseSelectionnee("26");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC27() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c27.getText());
        caseSelectionnee("27");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC28() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c28.getText());
        caseSelectionnee("28");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC29() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c29.getText());
        caseSelectionnee("29");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC30() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c30.getText());
        caseSelectionnee("30");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC31() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c31.getText());
        caseSelectionnee("31");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC32() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c32.getText());
        caseSelectionnee("32");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC33() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c33.getText());
        caseSelectionnee("33");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC34() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c34.getText());
        caseSelectionnee("34");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC35() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c35.getText());
        caseSelectionnee("35");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC36() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c36.getText());
        caseSelectionnee("36");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC37() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c37.getText());
        caseSelectionnee("37");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC38() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c38.getText());
        caseSelectionnee("38");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC39() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c39.getText());
        caseSelectionnee("39");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC40() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c40.getText());
        caseSelectionnee("40");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC41() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c41.getText());
        caseSelectionnee("41");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickC42() {
        razEvt();
        mettreCalendrierAJour((String) calendrier_c42.getText());
        caseSelectionnee("42");

        List<EvtV> evts = new ArrayList<EvtV>();

        if (cOUg.equals("c")) {
            evts = dataManager.selectEvtChaleurJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (cOUg.equals("g")) {
            evts = dataManager.selectEvtGestationJour(dateSQL.format(dateCalendrier.getTime()));
        }

        if (evts.size() != 0) {
            for ( EvtV evt : evts ) {
                evtAjh.add(evt.getNomEvt());
            }

            numEvt = "1";
            nomEvt = evtAjh.get(0);

            majEvt();
        }
    }
    void OnClickCPageL() {
        if (Integer.parseInt(numEvt) != 1) {
            numEvt = String.valueOf(Integer.parseInt(numEvt)-1);
            nomEvt = evtAjh.get(Integer.parseInt(numEvt)-1);
            majEvt();
        }

        calendrier_pageL.setVisibility(View.VISIBLE);
        calendrier_pageR.setVisibility(View.VISIBLE);
        if (Integer.parseInt(numEvt) == 1) {
            calendrier_pageL.setVisibility(View.INVISIBLE);
        }
    }
    void OnClickCPageR() {
        if (Integer.parseInt(numEvt) != evtAjh.size()) {
            numEvt = String.valueOf(Integer.parseInt(numEvt)+1);
            nomEvt = evtAjh.get(Integer.parseInt(numEvt)-1);
            majEvt();
        }

        calendrier_pageL.setVisibility(View.VISIBLE);
        calendrier_pageR.setVisibility(View.VISIBLE);
        if (Integer.parseInt(numEvt) == evtAjh.size()) {
            calendrier_pageR.setVisibility(View.INVISIBLE);
        }
    }
    void OnClickCPageLConflit() {
        Integer p = Integer.parseInt(String.valueOf(conflit_affPage.getText()));
        /*setText(conflit_affPage, "1");*/

        conflit_pageR.setVisibility(View.VISIBLE);

        if (p > 1) {
            setText(conflit_affPage, String.valueOf(p-1));

            if (p -1 == 1) {
                conflit_pageL.setVisibility(View.INVISIBLE);
            }

            lignesConflit.clear();
            chaleurPosterieur.clear();

            Calendar now = Calendar.getInstance();

            List<EvtV> evts = new ArrayList<EvtV>();
            evts =  dataManager.chaleurPosterieur(dateSQL.format(now.getTime()));
            if (evts.size() != 0) {
                for ( EvtV evt : evts ) {
                    chaleurPosterieur.add(evt.getNomEvt());
                }
            }

            majConflit();
        }


        /*razConflit();

        if (Integer.parseInt(String.valueOf(conflit_affPage.getText())) != 1) {
            setText(conflit_affPage, String.valueOf((Integer.parseInt(String.valueOf(conflit_affPage.getText()))-1)));

            conflit_pageL.setVisibility(View.VISIBLE);
            conflit_pageR.setVisibility(View.VISIBLE);
            if (Integer.parseInt(String.valueOf(conflit_affPage.getText())) == 1) {
                conflit_pageL.setVisibility(View.INVISIBLE);
            }


            if (chaleurPosterieur.size() < 11) {
                setHW(conflit_choixEvt, 0, 0);
                updateMoins10Conflit();
            }
            else {
                Integer numP = Integer.parseInt((String) conflit_affPage.getText());


                if (chaleurPosterieur.size() < ((numP)*10)) {
                    updateIncConflit();
                    conflit_pageR.setVisibility(View.INVISIBLE);
                }
                else {
                    updateCompletConflit();
                }
            }

            majConflit();
        }*/
    }
    void OnClickCPageRConflit() {
        Integer p = Integer.parseInt(String.valueOf(conflit_affPage.getText()));
        /*setText(conflit_affPage, "1");*/

        /*if (chaleurPosterieur.size() > ((p)*10+9)) {*/
        conflit_pageL.setVisibility(View.VISIBLE);
        setText(conflit_affPage, String.valueOf(p + 1));

        lignesConflit.clear();

        majConflit();

        Log.i("Bientot fini", " " + (p));
        Log.i("Bientot fini", chaleurPosterieur.size() + " " + ((p+1)*10+1));
        if (chaleurPosterieur.size() < ((p+1)*10+1)) {
            conflit_pageR.setVisibility(View.INVISIBLE);
        }
        //}

        /*razConflit();

        setText(conflit_affPage, String.valueOf((Integer.parseInt(String.valueOf(conflit_affPage.getText()))+1)));

        if (chaleurPosterieur.size() < 11) {
            setHW(conflit_choixEvt, 0, 0);
            updateMoins10Conflit();
        }
        else {
            Integer numP = Integer.parseInt((String) conflit_affPage.getText());


            if (chaleurPosterieur.size() < ((numP)*10)) {
                updateIncConflit();
                conflit_pageR.setVisibility(View.INVISIBLE);
            }
            else {
                updateCompletConflit();
            }
        }

        majConflit();*/
    }
    void OnClickOK(Integer i) {
        Log.i("ClickOK", "Click");

        if (i == 1) {
            List<EvtV> evts = dataManager.readByNom(String.valueOf(conflit_evt1.getText()));
            EvtV event = null;
            for (EvtV evt : evts) {
                event = evt;
            }

            dataManager.autoUpdateGestation(event.getNomEvt());
        }

        if (i == 2) {
            List<EvtV> evts = dataManager.readByNom(String.valueOf(conflit_evt2.getText()));
            for (EvtV evt : evts) {
                Log.i("ClickOK", String.valueOf(evt.getDateChaleur()));
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

        if (indexOf1 != -1 || indexOf2 != -1) {
            present = true;
        }

        return present;
    }
    void moisAv() {
        dateCalendrier.set(Integer.parseInt(sdfYear.format(dateCalendrier.getTime())), Integer.parseInt(sdfMonth.format(dateCalendrier.getTime())) - 2, 1);
        joursDuMois();

        Log.i(TAG, "Le calendrier recule d'un mois");
    }
    void moisAp() {
        dateCalendrier.set(Integer.parseInt(sdfYear.format(dateCalendrier.getTime())), Integer.parseInt(sdfMonth.format(dateCalendrier.getTime())), 1);

        joursDuMois();

        Log.i(TAG, "Le calendrier avance d'un mois");
    }
    void detJourActuel() {
        Calendar now = Calendar.getInstance();

        if (sdfMonth.format(now.getTime()).equals(sdfMonth.format(dateCalendrier.getTime()))) {
            if (sdfYear.format(now.getTime()).equals(sdfYear.format(dateCalendrier.getTime()))) {
                for (int i = 0; i < 42; i++) {
                    // Log.i(TAG, String.valueOf(i));

                    List<String> uneCase = new ArrayList<String>();
                    uneCase = cases.get(i);


                    if (uneCase.get(0).equals(sdfDay.format(now.getTime()))) {
                        uneCase.set(1, "jA");
                        cases.set(i, uneCase);
                        Log.i(TAG, "La case " + (i + 1) + " représente le jour actuel.");
                    }
                }
            }
        }
    }
    void casesChaleur() throws ParseException {
        Log.i("ClickChal1", sdfYear.format(dateCalendrier.getTime()) + "-" + sdfMonth.format(dateCalendrier.getTime()));
        List<EvtV> evts = dataManager.selectEvtChaleurMois(sdfYear.format(dateCalendrier.getTime()) + "-" + sdfMonth.format(dateCalendrier.getTime()));

        Log.i("ClickChal1", "ListEvts");

        for (EvtV evt : evts) {
            // Log.i(TAG, evt.info());

            for (int i = 0; i < 42; i++) {
                // Log.i(TAG, String.valueOf(i));

                List<String> uneCase = new ArrayList<String>();
                uneCase = cases.get(i);

                Log.i("ClickChal1", "RAS");
                Log.i("ClickChal1", String.valueOf(uneCase));
                Log.i("ClickChal1", sdfDay.format(dateSQL.parse(evt.getDateChaleur())));

                if (!uneCase.get(0).equals("")) {
                    if (Integer.parseInt(uneCase.get(0)) == Integer.parseInt(sdfDay.format(dateSQL.parse(evt.getDateChaleur())))) {
                        uneCase.set(1, "jC");
                        cases.set(i, uneCase);
                        Log.i(TAG, "La case " + (i + 1) + " représente un jour Chaleur.");
                    }
                }
            }
        }
    }
    void casesGestation() throws ParseException {
        List<EvtV> evts = dataManager.selectEvtGestationMois(sdfYear.format(dateCalendrier.getTime()) + "-" + sdfMonth.format(dateCalendrier.getTime()));

        for (EvtV evt : evts) {
            //Log.i(TAG, evt.info());

            for (int i = 0; i < 42; i++) {
                // Log.i(TAG, String.valueOf(i));

                List<String> uneCase = new ArrayList<String>();
                uneCase = cases.get(i);
                if (!uneCase.get(0).equals("")) {
                    if (Integer.parseInt(uneCase.get(0)) == Integer.parseInt(sdfDay.format(dateSQL.parse(evt.getDateGestation())))) {
                        uneCase.set(1, "jG");
                        cases.set(i, uneCase);
                        Log.i(TAG, "La case " + (i + 1) + " représente un jour de Gestation.");
                    }
                }
            }
        }
    }
    void mettreCalendrierAJour(String XX) {
        dateCalendrier.set(Integer.parseInt(sdfYear.format(dateCalendrier.getTime())), Integer.parseInt(sdfMonth.format(dateCalendrier.getTime()))-1, Integer.parseInt(XX));
    }
    void caseSelectionnee(String XX) {
        for (int i = 0; i < 42; i++) {
            // Log.i(TAG, String.valueOf(i));

            List<String> uneCase = new ArrayList<String>();
            uneCase = cases.get(i);

            if (!uneCase.get(0).equals("")) {
                if (Integer.parseInt(uneCase.get(0)) == Integer.parseInt(XX)) {
                    // Log.i(TAG, "La case " + (i + 1) + " a été clické.");

                    if (cOUg.equals("g")) {
                        uneCase.set(1, "jGS");
                        cases.set(i, uneCase);
                        Log.i(TAG, "La case " + (i + 1) + " a été colorié en jGS.");
                    }

                    if (cOUg.equals("c")) {
                        uneCase.set(1, "jCS");
                        cases.set(i, uneCase);
                        Log.i(TAG, "La case " + (i + 1) + " a été colorié en jCS.");
                    }
                }
            }
        }
    }
}
