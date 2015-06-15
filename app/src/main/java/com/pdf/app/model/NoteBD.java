package com.pdf.app.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by Kirby on 15/06/2015.
 */
@Table(name = "note")
public class NoteBD extends Model {

    @Column(name = "idNote")
    public int idNote;
    @Column(name = "idSpectacle")
    public int idSpectacle;
    @Column(name = "idBoutique")
    public int idBoutique;
    @Column(name = "idRestaurant")
    public int idRestaurant;
    @Column(name = "note")
    public int note;
    @Column(name="commentaire")
    public String commentaire;

    public NoteBD(){super();}

    public NoteBD(int idNote, int idSpectacle, int idBoutique, int idRestaurant, int note, String commentaire){
        this.idNote = idNote;
        this.idSpectacle = idSpectacle;
        this.idBoutique = idBoutique;
        this.idRestaurant = idRestaurant;
        this.note = note;
        this.commentaire = commentaire;
    }

}
