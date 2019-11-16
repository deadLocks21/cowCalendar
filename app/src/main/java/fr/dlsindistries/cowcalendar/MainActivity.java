package fr.dlsindistries.cowcalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
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

    // En-tête
    private LinearLayout calendrier_enTete = null;
    private ImageView calendrier_moisL = null;
    private TextView calendrier_nomDuMois = null;
    private ImageView calendrier_moisR = null;

    // Lettres
    private LinearLayout calendrier_lettres = null;





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

        // En-tête
        calendrier_enTete = (LinearLayout) findViewById(R.id.calendrier_enTete);
        calendrier_moisL = (ImageView)findViewById(R.id.calendrier_moisL);
        calendrier_nomDuMois = (TextView)findViewById(R.id.calendrier_nomDuMois);
        calendrier_moisR = (ImageView)findViewById(R.id.calendrier_moisR);

        // Lettres
        calendrier_lettres = (LinearLayout) findViewById(R.id.calendrier_lettres);
    }

    void miseEnPage() {
        // Mise en page Layout
        //setHW(layoutMain, 720, 1100);
        //setHW(layoutAjouter, 720, 1100);
        setHW(layoutCalendrier, 720, 1100);
        setHW(layoutMenu, 720, 180);
        setHW(layoutMain, 720, 0);  // Faire disparaitre Main
        setHW(layoutAjouter, 720, 0);  // Faire disparaitre Ajouter
        // setHW(layoutCalendrier, 720, 0);  // Faire disparaitre Calendrier

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
        setHW(calendrier_fond, 720, 720);
        setMargins(calendrier_fond, 0, 78, 0, 0);

        // En-tête
        setHW(calendrier_enTete, 720, 80);
        setHW(calendrier_moisL, 70, 70);
        setHW(calendrier_nomDuMois, 450, 70);
        setTextSize(calendrier_nomDuMois, 25);
        setHW(calendrier_moisR, 70, 70);

        // Lettres
        setHW(calendrier_lettres, 720, 75);
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
