package com.pdf.app.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.sql.Time;

/**
 * Created by Kirby on 15/06/2015.
 */
@Table(name="horaire")
public class HoraireBD extends Model {

    @Column(name="id", unique = true)
    public int id;
    @Column(name="idSpectacle")
    public int idSpectacle;
    @Column(name="heure")
    public Time heure;

    public HoraireBD(){super();}

    public HoraireBD(int id, int idSpectacle, Time heure){
        this.id = id;
        this.idSpectacle = idSpectacle;
        this.heure = heure;
    }

}
