package Java101;
import java.util.Scanner;

public class ucakBiletiFiyatiHesaplama {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int KM,yas,yolculukTipi,kontrol=0;
        double biletFiyati;
        final double mesafeUcreti = 0.10;

        System.out.print("Mesafeyi KM türünden giriniz : ");
        KM = inp.nextInt();

        System.out.print("Yaşinizi giriniz : ");
        yas = inp.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidis Donus): ");
        yolculukTipi = inp.nextInt();

        if(yolculukTipi!=1 && yolculukTipi!=2 || KM <= 0){
            System.out.println("Hatali veri girdiniz!");
            kontrol++;
        }

        while (kontrol==0){
            biletFiyati = KM * mesafeUcreti;

            if(yas <= 12){
                biletFiyati /= 2;
            }
            else if (yas <=24 && yas > 12) {
                biletFiyati = biletFiyati * 90 / 100;
            }
            else if (yas >= 65) {
                biletFiyati = biletFiyati * 70 / 100;
            }
            if (yolculukTipi==2) {
                biletFiyati *= 2;
                biletFiyati = biletFiyati * 80 / 100;
            }

            kontrol++;
            System.out.println("Bilet fiyati : " + biletFiyati);
        }





    }
}
