package com.pdf.app.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by Kirby on 15/06/2015.
 */
@Table(name = "menu")
public class MenuBD extends Model{

    @Column(name = "idMenu", unique = true)
    public int idMenu;
    @Column(name = "description")
    public String description;
    @Column(name = "prix")
    public float prix;

    public MenuBD(){super();}

    public MenuBD(int idMenu, String description, float prix){
        this.idMenu = idMenu;
        this.description = description;
        this.prix = prix;
    }

}
