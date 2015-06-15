package com.pdf.app.model;


import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.Date;

/**
 * Created by Kirby on 15/06/2015.
 */

@Table(name="spectacle")
public class SpectacleBD extends Model {

    @Column(name = "idSpectacle", unique = true)
    public int idSpectacle;
    @Column(name= "nom")
    public String nom;
    @Column(name= "duree")
    public int duree;
    @Column(name= "dateCreation")
    public Date dateCreation;
    @Column(name= "nbActeurs")
    public int nbActeurs;
    @Column(name= "eventHistorique")
    public String eventHistorique;
    @Column(name= "noteMoyenne")
    public float noteMoyenne;
    @Column(name= "longitude")
    public float longitude;
    @Column(name= "lattitude")
    public float lattitude;

    public SpectacleBD(){super();}

    public SpectacleBD (int idSpectacle, String nom, int duree, Date dateCreation, int nbActeurs, String eventHistorique, float noteMoyenne, float longitude, float lattitude){
        this.idSpectacle = idSpectacle;
        this.nom = nom;
        this.duree = duree;
        this.dateCreation = dateCreation;
        this.nbActeurs = nbActeurs;
        this.eventHistorique = eventHistorique;
        this.noteMoyenne = noteMoyenne;
        this.longitude = longitude;
        this.lattitude = lattitude;
    }


}
