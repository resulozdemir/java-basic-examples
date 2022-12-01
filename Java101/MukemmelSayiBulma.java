package Java101;
import java.util.Scanner;

public class MukemmelSayiBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi,toplam=0;

        System.out.print("Sayı Giriniz : ");
        sayi = inp.nextInt();

        for (int i = 1; i < sayi; i++)
        {
            if (sayi % i == 0)
            {
                toplam += i;
            }
        }

        if(toplam == sayi){
            System.out.println(sayi + " Mukemmel sayidir!");
        }

        else {
            System.out.println(sayi + " Mukemmel sayi degildir!");
        }
    }
}
