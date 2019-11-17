package fr.dlsindistries.cowcalendar;

import java.sql.Date;

public class EvtI {
    private long idEvt;
    private String nomEvt;
    private Date dateDebut;
    private Date dateChaleur;
    private Date dateGestation;

    public EvtI(long idEvt, String nomEvt, Date dateDebut, Date dateChaleur, Date dateGestation){
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

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateChaleur() {
        return dateChaleur;
    }

    public void setDateChaleur(Date dateChaleur) {
        this.dateChaleur = dateChaleur;
    }

    public Date getDateGestation() {
        return dateGestation;
    }

    public void setDateGestation(Date dateGestation) {
        this.dateGestation = dateGestation;
    }
}
