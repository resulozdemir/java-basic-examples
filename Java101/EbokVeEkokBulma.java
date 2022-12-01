package Java101;
import java.util.Scanner;

public class EbokVeEkokBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi1,sayi2, ebob = 0,ekok;

        System.out.print("1.Sayiyi Giriniz : ");
        sayi1 = inp.nextInt();

        System.out.print("2.Sayiyi Giriniz : ");
        sayi2 = inp.nextInt();

        if(sayi1 <= sayi2){
            for (int i = 1; i < sayi1; i++) {
                if (sayi1 % i == 0 && sayi2 % i == 0) {
                    ebob = i;
                }

            }
        }

        else if(sayi1 > sayi2){
            for (int i = 1; i < sayi2; i++) {
                if (sayi1 % i == 0 && sayi2 % i == 0) {
                    ebob = i;
                }

            }
        }

        ekok = (sayi1 * sayi2) / ebob;

        System.out.println("Eboblari : " + ebob);
        System.out.println("Ekoklari : " + ekok);
    }
}
