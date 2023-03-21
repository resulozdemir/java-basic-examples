package Java101;

import java.util.Scanner;

public class recursiveIleDesenOlusturma {
    static String desen(int sayi) {
        int sayac=0;
        String yazdirma = "";

        if (sayi > 0 && sayac == 0) {
            yazdirma += "sayi,";
            if(sayi-5 < 0){
                sayac++;
            }
            return desen(sayi-5);

        }
        else if (sayi < 0 && sayac == 1){
            yazdirma += "sayi,";
            return desen(sayi+5);
        }

        return yazdirma;
    }

    public static void main(String[] args) {
        int sayi;
        Scanner inp = new Scanner(System.in);

        System.out.print("Taban değerini giriniz :");
        sayi = inp.nextInt();

        System.out.println(desen(sayi));





    }
}
