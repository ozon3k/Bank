package com.pawelozga;

public abstract class Account {
enum rachunek{
    OSOBISTY,
    FIRMOWY;
}
String dane;
String numerKonta;
int stanKonta;
boolean czyOtwarty = false;

    public String getDane() {
        return dane;
    }

    public void setDane(String dane) {
        this.dane = dane;
    }

    public String getNumerKonta() {
        return numerKonta;
    }

    public void setNumerKonta(String numerKonta) {
        this.numerKonta = numerKonta;
    }

    public int getStanKonta() {
        return stanKonta;
    }

    public void setStanKonta(int stanKonta) {
        this.stanKonta = stanKonta;
    }

    public abstract rachunek getType();


    public Account(String dane, String numerKonta, int stanKonta){
        this.dane = dane;
        this.numerKonta = numerKonta;
        this.stanKonta =stanKonta;
    }



    public void otwarcie(){
        this.czyOtwarty= true;
    }
    public void zamkniecie() {
        this.czyOtwarty= false;
    }
    public void wplata(int w){
        if (czyOtwarty= true){

            this.stanKonta = stanKonta + w;
        }else{
            System.out.println("konto zamknięte");
        }
    }
    public void wyplata(int w){
        if (czyOtwarty =true){
            this.stanKonta = stanKonta - w;

        }else{
            System.out.println("konto zamknięte");
        }
    }




}
