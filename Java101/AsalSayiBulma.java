package Java101;
import java.util.Scanner;

public class AsalSayiBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int sayi = inp.nextInt();
        boolean durum = true;

        for (int i = 2; i < sayi; i++)
        {
            if (sayi % i == 0)
            {
                durum=false;
                break;
            }
        }

        if (durum==true)
        {
            System.out.println(sayi + " Asaldir.");
        }
        else
        {
            System.out.println(sayi + "Asal Değildir.");
        }
    }
}
