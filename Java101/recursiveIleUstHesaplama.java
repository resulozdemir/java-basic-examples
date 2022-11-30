package Java101;
import java.util.Scanner;

public class recursiveIleUstHesaplama {
    static double hesapla(int taban, int us) {
        if (us > 0) {
            return taban * hesapla(taban, us - 1);
        }
        else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int taban, us;
        Scanner inp = new Scanner(System.in);

        System.out.print("Taban değerini giriniz :");
        taban = inp.nextInt();

        System.out.print("Üs değerini giriniz :");
        us = inp.nextInt();

        System.out.println(hesapla(taban, us));



    }
}
