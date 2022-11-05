package Java101;

import java.util.Scanner;

public class vucutKitleEndeksiHesaplama {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        double boy,kitleEndeksi,kilo;

        System.out.print("Boyunuzu metre cinsinden giriniz : ");
        boy = inp.nextDouble();

        System.out.print("Kilonuzu kg cinsinden giriniz : ");
        kilo = inp.nextDouble();

        kitleEndeksi = kilo / (boy * boy);

        System.out.println("Vucut kitle endeksiniz : " + kitleEndeksi);


    }
}
