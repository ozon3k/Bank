package com.pawelozga;

public class Osobisty extends Account {


    public Osobisty(String dane, String numerKonta, int stanKonta) {
        super(dane, numerKonta, stanKonta);
    }

    @Override
    public rachunek getType() {
        return rachunek.OSOBISTY;
    }
}
