package com.example.barbero_attempt_1;

import java.util.ArrayList;

public class BarberShopBrand extends User {

    //Variables
    private String barberShopName;
    private ArrayList<BarberShop> BarberShops;

    //Setters
    public void setBarberShopName(String barberShopName) {
        this.barberShopName = barberShopName;
    }

    //Getters
    public String getBarberShopName() {
        return barberShopName;
    }
}
