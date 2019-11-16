package fr.dlsindistries.cowcalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Variables des Layout de l'application
    private LinearLayout layoutMain = null;
    private LinearLayout layoutAjouter = null;
    private LinearLayout layoutCalendrier = null;
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
    private ImageView calendrier_c1 = null;
    private ImageView calendrier_c2 = null;
    private ImageView calendrier_c3 = null;
    private ImageView calendrier_c4 = null;
    private ImageView calendrier_c5 = null;
    private ImageView calendrier_c6 = null;
    private ImageView calendrier_c7 = null;
    private ImageView calendrier_c8 = null;
    private ImageView calendrier_c9 = null;
    private ImageView calendrier_c10 = null;
    private ImageView calendrier_c11 = null;
    private ImageView calendrier_c12 = null;
    private ImageView calendrier_c13 = null;
    private ImageView calendrier_c14 = null;
    private ImageView calendrier_c15 = null;
    private ImageView calendrier_c16 = null;
    private ImageView calendrier_c17 = null;
    private ImageView calendrier_c18 = null;
    private ImageView calendrier_c19 = null;
    private ImageView calendrier_c20 = null;
    private ImageView calendrier_c21 = null;
    private ImageView calendrier_c22 = null;
    private ImageView calendrier_c23 = null;
    private ImageView calendrier_c24 = null;
    private ImageView calendrier_c25 = null;
    private ImageView calendrier_c26 = null;
    private ImageView calendrier_c27 = null;
    private ImageView calendrier_c28 = null;
    private ImageView calendrier_c29 = null;
    private ImageView calendrier_c30 = null;
    private ImageView calendrier_c31 = null;
    private ImageView calendrier_c32 = null;
    private ImageView calendrier_c33 = null;
    private ImageView calendrier_c34 = null;
    private ImageView calendrier_c35 = null;
    private ImageView calendrier_c36 = null;
    private ImageView calendrier_c37 = null;
    private ImageView calendrier_c38 = null;
    private ImageView calendrier_c39 = null;
    private ImageView calendrier_c40 = null;
    private ImageView calendrier_c41 = null;
    private ImageView calendrier_c42 = null;

    // Affichage des évènements
    private TextView calendrier_nomDeEvt = null;
    private LinearLayout calendrier_choixEvt = null;
    private ImageView calendrier_pageL = null;
    private ImageView calendrier_affPage = null;
    private ImageView calendrier_pageR = null;




    // Layout Ajouter
    private ImageView ajouter_enTete = null;
    private EditText ajouter_champ = null;
    private TextView ajouter_date = null;
    private ImageView ajouter_bouton = null;





    // Constantes
    private String TAG = "DEBUG_";

    // Variables
    private Integer width;
    private Integer height;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trouverWH();

        initPage();
        miseEnPage();
    }




    // Initialisation des graphismes
    void initPage() {
        // Initialisation Layout
        layoutMain = (LinearLayout)findViewById(R.id.layoutMain);
        layoutAjouter = (LinearLayout)findViewById(R.id.layoutAjouter);
        layoutCalendrier = (LinearLayout)findViewById(R.id.layoutCalendrier);
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
        calendrier_c1 = (ImageView) findViewById(R.id.calendrier_c1);
        calendrier_c2 = (ImageView) findViewById(R.id.calendrier_c2);
        calendrier_c3 = (ImageView) findViewById(R.id.calendrier_c3);
        calendrier_c4 = (ImageView) findViewById(R.id.calendrier_c4);
        calendrier_c5 = (ImageView) findViewById(R.id.calendrier_c5);
        calendrier_c6 = (ImageView) findViewById(R.id.calendrier_c6);
        calendrier_c7 = (ImageView) findViewById(R.id.calendrier_c7);
        calendrier_c8 = (ImageView) findViewById(R.id.calendrier_c8);
        calendrier_c9 = (ImageView) findViewById(R.id.calendrier_c9);
        calendrier_c10 = (ImageView) findViewById(R.id.calendrier_c10);
        calendrier_c11 = (ImageView) findViewById(R.id.calendrier_c11);
        calendrier_c12 = (ImageView) findViewById(R.id.calendrier_c12);
        calendrier_c13 = (ImageView) findViewById(R.id.calendrier_c13);
        calendrier_c14 = (ImageView) findViewById(R.id.calendrier_c14);
        calendrier_c15 = (ImageView) findViewById(R.id.calendrier_c15);
        calendrier_c16 = (ImageView) findViewById(R.id.calendrier_c16);
        calendrier_c17 = (ImageView) findViewById(R.id.calendrier_c17);
        calendrier_c18 = (ImageView) findViewById(R.id.calendrier_c18);
        calendrier_c19 = (ImageView) findViewById(R.id.calendrier_c19);
        calendrier_c20 = (ImageView) findViewById(R.id.calendrier_c20);
        calendrier_c21 = (ImageView) findViewById(R.id.calendrier_c21);
        calendrier_c22 = (ImageView) findViewById(R.id.calendrier_c22);
        calendrier_c23 = (ImageView) findViewById(R.id.calendrier_c23);
        calendrier_c24 = (ImageView) findViewById(R.id.calendrier_c24);
        calendrier_c25 = (ImageView) findViewById(R.id.calendrier_c25);
        calendrier_c26 = (ImageView) findViewById(R.id.calendrier_c26);
        calendrier_c27 = (ImageView) findViewById(R.id.calendrier_c27);
        calendrier_c28 = (ImageView) findViewById(R.id.calendrier_c28);
        calendrier_c29 = (ImageView) findViewById(R.id.calendrier_c29);
        calendrier_c30 = (ImageView) findViewById(R.id.calendrier_c30);
        calendrier_c31 = (ImageView) findViewById(R.id.calendrier_c31);
        calendrier_c32 = (ImageView) findViewById(R.id.calendrier_c32);
        calendrier_c33 = (ImageView) findViewById(R.id.calendrier_c33);
        calendrier_c34 = (ImageView) findViewById(R.id.calendrier_c34);
        calendrier_c35 = (ImageView) findViewById(R.id.calendrier_c35);
        calendrier_c36 = (ImageView) findViewById(R.id.calendrier_c36);
        calendrier_c37 = (ImageView) findViewById(R.id.calendrier_c37);
        calendrier_c38 = (ImageView) findViewById(R.id.calendrier_c38);
        calendrier_c39 = (ImageView) findViewById(R.id.calendrier_c39);
        calendrier_c40 = (ImageView) findViewById(R.id.calendrier_c40);
        calendrier_c41 = (ImageView) findViewById(R.id.calendrier_c41);
        calendrier_c42 = (ImageView) findViewById(R.id.calendrier_c42);

        // Affichage des évènements
        calendrier_nomDeEvt = (TextView)findViewById(R.id.calendrier_nomDeEvt);
        calendrier_choixEvt = (LinearLayout)findViewById(R.id.calendrier_choixEvt);
        calendrier_pageL = (ImageView) findViewById(R.id.calendrier_pageL);
        calendrier_affPage = (ImageView) findViewById(R.id.calendrier_affPage);
        calendrier_pageR = (ImageView) findViewById(R.id.calendrier_pageR);




        // Layout Ajouter
        ajouter_enTete = (ImageView)findViewById(R.id.ajouter_enTete);
        ajouter_champ = (EditText)findViewById(R.id.ajouter_champ);
        ajouter_date = (TextView)findViewById(R.id.ajouter_date);
        ajouter_bouton = (ImageView)findViewById(R.id.ajouter_bouton);
    }

    void miseEnPage() {
        // Mise en page Layout
        //setHW(layoutMain, 720, 1100);
        //setHW(layoutAjouter, 720, 1100);
        setHW(layoutCalendrier, 720, 1100);
        setHW(layoutMenu, 720, 180);
        setHW(layoutMain, 720, 0);  // Faire disparaitre Main
        setHW(layoutAjouter, 720, 0);  // Faire disparaitre Ajouter
        //setHW(layoutCalendrier, 720, 0);  // Faire disparaitre Calendrier

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
        setHW(calendrier_c2, 70, 70);
        setMargins(calendrier_c2, 8, 0, 8, 0);
        setHW(calendrier_c3, 70, 70);
        setMargins(calendrier_c3, 8, 0, 8, 0);
        setHW(calendrier_c4, 70, 70);
        setMargins(calendrier_c4, 8, 0, 8, 0);
        setHW(calendrier_c5, 70, 70);
        setMargins(calendrier_c5, 8, 0, 8, 0);
        setHW(calendrier_c6, 70, 70);
        setMargins(calendrier_c6, 8, 0, 8, 0);
        setHW(calendrier_c7, 70, 70);
        setMargins(calendrier_c7, 8, 0, 8, 0);
        setHW(calendrier_c8, 70, 70);
        setMargins(calendrier_c8, 8, 0, 8, 0);
        setHW(calendrier_c9, 70, 70);
        setMargins(calendrier_c9, 8, 0, 8, 0);
        setHW(calendrier_c10, 70, 70);
        setMargins(calendrier_c10, 8, 0, 8, 0);
        setHW(calendrier_c11, 70, 70);
        setMargins(calendrier_c11, 8, 0, 8, 0);
        setHW(calendrier_c12, 70, 70);
        setMargins(calendrier_c12, 8, 0, 8, 0);
        setHW(calendrier_c13, 70, 70);
        setMargins(calendrier_c13, 8, 0, 8, 0);
        setHW(calendrier_c14, 70, 70);
        setMargins(calendrier_c14, 8, 0, 8, 0);
        setHW(calendrier_c15, 70, 70);
        setMargins(calendrier_c15, 8, 0, 8, 0);
        setHW(calendrier_c16, 70, 70);
        setMargins(calendrier_c16, 8, 0, 8, 0);
        setHW(calendrier_c17, 70, 70);
        setMargins(calendrier_c17, 8, 0, 8, 0);
        setHW(calendrier_c18, 70, 70);
        setMargins(calendrier_c18, 8, 0, 8, 0);
        setHW(calendrier_c19, 70, 70);
        setMargins(calendrier_c19, 8, 0, 8, 0);
        setHW(calendrier_c20, 70, 70);
        setMargins(calendrier_c20, 8, 0, 8, 0);
        setHW(calendrier_c21, 70, 70);
        setMargins(calendrier_c21, 8, 0, 8, 0);
        setHW(calendrier_c22, 70, 70);
        setMargins(calendrier_c22, 8, 0, 8, 0);
        setHW(calendrier_c23, 70, 70);
        setMargins(calendrier_c23, 8, 0, 8, 0);
        setHW(calendrier_c24, 70, 70);
        setMargins(calendrier_c24, 8, 0, 8, 0);
        setHW(calendrier_c25, 70, 70);
        setMargins(calendrier_c25, 8, 0, 8, 0);
        setHW(calendrier_c26, 70, 70);
        setMargins(calendrier_c26, 8, 0, 8, 0);
        setHW(calendrier_c27, 70, 70);
        setMargins(calendrier_c27, 8, 0, 8, 0);
        setHW(calendrier_c28, 70, 70);
        setMargins(calendrier_c28, 8, 0, 8, 0);
        setHW(calendrier_c29, 70, 70);
        setMargins(calendrier_c29, 8, 0, 8, 0);
        setHW(calendrier_c30, 70, 70);
        setMargins(calendrier_c30, 8, 0, 8, 0);
        setHW(calendrier_c31, 70, 70);
        setMargins(calendrier_c31, 8, 0, 8, 0);
        setHW(calendrier_c32, 70, 70);
        setMargins(calendrier_c32, 8, 0, 8, 0);
        setHW(calendrier_c33, 70, 70);
        setMargins(calendrier_c33, 8, 0, 8, 0);
        setHW(calendrier_c34, 70, 70);
        setMargins(calendrier_c34, 8, 0, 8, 0);
        setHW(calendrier_c35, 70, 70);
        setMargins(calendrier_c35, 8, 0, 8, 0);
        setHW(calendrier_c36, 70, 70);
        setMargins(calendrier_c36, 8, 0, 8, 0);
        setHW(calendrier_c37, 70, 70);
        setMargins(calendrier_c37, 8, 0, 8, 0);
        setHW(calendrier_c38, 70, 70);
        setMargins(calendrier_c38, 8, 0, 8, 0);
        setHW(calendrier_c39, 70, 70);
        setMargins(calendrier_c39, 8, 0, 8, 0);
        setHW(calendrier_c40, 70, 70);
        setMargins(calendrier_c40, 8, 0, 8, 0);
        setHW(calendrier_c41, 70, 70);
        setMargins(calendrier_c41, 8, 0, 8, 0);
        setHW(calendrier_c42, 70, 70);
        setMargins(calendrier_c42, 8, 0, 8, 0);

        // Affichage des évènements
        setHW(calendrier_nomDeEvt, 720, 80);
        setMargins(calendrier_nomDeEvt, 0, 15, 0, 25);
        setTextSize(calendrier_nomDeEvt, 25);
        setHW(calendrier_choixEvt, 720, 86);
        setHW(calendrier_pageL, 66, 86);
        setMargins(calendrier_pageL, 0, 0, 14, 0);
        setHW(calendrier_affPage, 66, 86);
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
}
