package fr.dlsindistries.cowcalendar;

import android.util.Log;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class EvtV {
    private long idEvt;
    private String nomEvt;
    private String dateDebut;
    private String dateChaleur;
    private String dateGestation;


    public EvtV(long idEvt, String nomEvt, String dateDebut, String dateChaleur, String dateGestation){
        super();
        this.idEvt = idEvt;
        this.nomEvt = nomEvt;
        this.dateDebut = dateDebut;
        this.dateChaleur = dateChaleur;
        this.dateGestation = dateGestation;
    }



    public long getIdEvt() {
        return idEvt;
    }

    public void setIdEvt(long idEvt) {
        this.idEvt = idEvt;
    }

    public String getNomEvt() {
        return nomEvt;
    }

    public void setNomEvt(String nomEvt) {
        this.nomEvt = nomEvt;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateChaleur() {
        return dateChaleur;
    }

    public void setDateChaleur(String dateChaleur) {
        this.dateChaleur = dateChaleur;
    }

    public String getDateGestation() {
        return dateGestation;
    }

    public void setDateGestation(String dateGestation) {
        this.dateGestation = dateGestation;
    }

    public String info(){
        String i = "idEvt :" + this.idEvt + ", nomEvt :" + this.nomEvt + ", dateD :" + this.dateDebut + ", dateC :" + this.dateChaleur + ", dateG :"+ this.dateGestation;

        return i;
    }
}
