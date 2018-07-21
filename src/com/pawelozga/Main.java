package com.pawelozga;

public class Main {

    public static void main(String[] args) {
        Account Rachunek1 = new Firmowy("elo", "1234567890", 5000, "123aasd", "345asd");

        System.out.println(Rachunek1.dane);
        System.out.println(Rachunek1.getType());
        System.out.println(Rachunek1.stanKonta);

        Rachunek1.otwarcie();
        Rachunek1.wplata(30);
        System.out.println(Rachunek1.stanKonta);
        Rachunek1.wyplata(15);
        System.out.println(Rachunek1.stanKonta);
        Rachunek1.zamkniecie();
        Rachunek1.wyplata(1);
    }
}
