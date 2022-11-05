package Java101;

import java.util.Scanner;

public class manavKasaProgrami {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        double armut = 2.14 , elma = 3.67 , domates = 1.11, muz = 0.95 , patlican = 5.00;
        double armutKilo,elmaKilo,domatesKilo,muzKilo,patlicanKilo;
        double armutUcret,elmaUcret,domatesUcret,muzUcret,patlicanUcret,toplamUcret;

        System.out.print("Armut kac kilo : ");
        armutKilo = inp.nextDouble();

        System.out.print("Elma kac kilo : ");
        elmaKilo = inp.nextDouble();

        System.out.print("Domates kac kilo : ");
        domatesKilo = inp.nextDouble();

        System.out.print("Muz kac kilo : ");
        muzKilo = inp.nextDouble();

        System.out.print("Patlican kac kilo : ");
        patlicanKilo = inp.nextDouble();

        armutUcret = armutKilo * armut;
        elmaUcret = elmaKilo * elma;
        domatesUcret = domatesKilo * domates;
        muzUcret = muzKilo * muz;
        patlicanUcret = patlicanKilo * patlican;

        toplamUcret = armutUcret + elmaUcret +muzUcret + domatesUcret + patlicanUcret;
        System.out.println("Toplam ucret : " + toplamUcret);

    }
}
