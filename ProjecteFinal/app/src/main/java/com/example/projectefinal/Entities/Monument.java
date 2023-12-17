package com.example.projectefinal.Entities;

import android.graphics.Bitmap;

import java.io.Serializable;

public class Monument implements Serializable {
    private String nom;
    private int anyConstruccio;
    private String descripcio;
    private String imatge;
    private String ubicacio;
    private boolean visitat;
    private String dataVisita;
    private String tipusMonument;

    public Monument(String nom, int anyConstruccio, String descripcio, String ubicacio,String imatge, boolean visitat, String dataVisita, String tipusMonument) {
        this.nom = nom;
        this.anyConstruccio = anyConstruccio;
        this.descripcio = descripcio;
        this.ubicacio = ubicacio;
        this.imatge = imatge;
        this.visitat = visitat;
        this.dataVisita = dataVisita;
        this.tipusMonument = tipusMonument;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAnyConstruccio() {
        return anyConstruccio;
    }

    public void setAnyConstruccio(int anyConstruccio) {
        this.anyConstruccio = anyConstruccio;
    }

    public String getUbicacio() {
        return ubicacio;
    }

    public void setUbicacio(String ubicacio) {
        this.ubicacio = ubicacio;
    }

    public String getTipusMonument() {
        return tipusMonument;
    }

    public void setTipusMonument(String tipusMonument) {
        this.tipusMonument = tipusMonument;
    }

    public String getImatge() {
        return imatge;
    }

    public void setImatge(String imatge) {
        this.imatge = imatge;
    }

    public boolean isVisitat() {
        return visitat;
    }

    public void setVisitat(boolean visitat) {
        this.visitat = visitat;
    }

    public String getDataVisita() {
        return dataVisita;
    }

    public void setDataVisita(String dataVisita) {
        this.dataVisita = dataVisita;
    }
}
