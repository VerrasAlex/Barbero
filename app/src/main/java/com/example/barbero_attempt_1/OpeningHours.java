package com.example.barbero_attempt_1;

public class OpeningHours {

    //Variables
    private Hour openingHour;
    private Hour closingHour;

    //Setters
    public void setOpeningHour(Hour openingHour) {
        this.openingHour = openingHour;
    }

    public void setClosingHour(Hour closingHour) {
        this.closingHour = closingHour;
    }

    //Getters
    public Hour getOpeningHour() {
        return openingHour;
    }

    public Hour getClosingHour() {
        return closingHour;
    }
}
