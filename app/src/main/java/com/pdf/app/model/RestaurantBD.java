package com.pdf.app.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by Kirby on 15/06/2015.
 */
@Table(name = "restaurant")
public class RestaurantBD extends Model{

    @Column(name = "idRestaurant")
    public int idRestaurant;
    @Column(name = "description")
    public String description;
    @Column(name = "noteMoyenne")
    public float noteMoyenne;
    @Column(name = "longitude")
    public float longitude;
    @Column(name = "lattitude")
    public float lattitude;

    public RestaurantBD (){super();}

    public RestaurantBD (int idRestaurant, String description, float noteMoyenne, float longitude, float lattitude){
        this.idRestaurant = idRestaurant;
        this.description = description;
        this.noteMoyenne = noteMoyenne;
        this.longitude = longitude;
        this.lattitude = lattitude;
    }

}
