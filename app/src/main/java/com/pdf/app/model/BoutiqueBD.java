package com.pdf.app.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by Kirby on 15/06/2015.
 */
@Table(name = "boutique")
public class BoutiqueBD extends Model {

    @Column(name = "idBoutique")
    public int idBoutique;
    @Column(name = "description")
    public String description;
    @Column(name = "noteMoyenne")
    public float noteMoyenne;
    @Column(name = "longitude")
    public float longitude;
    @Column(name = "lattitude")
    public float lattitude;

    public BoutiqueBD (){super();}

    public BoutiqueBD (int idBoutique, String description, float noteMoyenne, float longitude, float lattitude){
        this.idBoutique = idBoutique;
        this.description = description;
        this.noteMoyenne = noteMoyenne;
        this.longitude = longitude;
        this.lattitude = lattitude;
    }

}
