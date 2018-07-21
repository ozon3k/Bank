package com.pawelozga;

public class Firmowy extends Account {

    String nip;
    String regon;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getRegon() {
        return regon;
    }

    public void setRegon(String regon) {
        this.regon = regon;
    }

    public Firmowy(String dane, String numerKonta, int stanKonta, String nip,String regon){
        super(dane, numerKonta, stanKonta);
        this.nip= nip;
        this.regon = regon;
    }


    @Override
    public rachunek getType() {
        return rachunek.FIRMOWY;
    }
}
