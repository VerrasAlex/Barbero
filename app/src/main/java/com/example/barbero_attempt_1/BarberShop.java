package com.example.barbero_attempt_1;

import java.util.*;

public class BarberShop {

    //Variables
    private Address barberShopAddress;
    private List<OpeningHours> openingHours = new ArrayList<OpeningHours>(7);
    private ArrayList<Service> serviceList;

    //Setters
    public void setBarberShopAddress(Address barberShopAddress) {
        this.barberShopAddress = barberShopAddress;
    }

    public void setOpeningHours(List<OpeningHours> openingHours) {
        this.openingHours = openingHours;
    }

    //Getters
    public Address getBarberShopAddress() {
        return barberShopAddress;
    }

    public List<OpeningHours> getOpeningHours() {
        return openingHours;
    }
}
