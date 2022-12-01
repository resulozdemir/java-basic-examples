package Java101;
import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int yil,birler,onlar,gecici;

        System.out.print("Yil giriniz : ");
        yil = inp.nextInt();

        birler = yil % 10;
        gecici = yil / 10;
        onlar = gecici % 10;

        if(birler == 0 && onlar == 0){
            if (yil % 400 == 0){
                System.out.println(yil + " bir artık yıldır !");
            }
            else {
                System.out.println(yil + " bir artık yıldır degildir!");
            }
        }

        else {
            if(yil % 4 == 0){
                System.out.println(yil + " bir artık yıldır !");
            }
            else {
                System.out.println(yil + " bir artık yıldır degildir!");
            }
        }

    }
}
