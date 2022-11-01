import java.util.Arrays;
import java.util.Scanner;

public class minVeMaxDegerBulma {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayiAdeti = 0;

        System.out.println("kac adet sayi gireceksiniz : ");
        sayiAdeti = inp.nextInt();

        int[] dizi = new int[sayiAdeti];

        for(int i=0;i<sayiAdeti;i++)
        {
            System.out.print((i+1) + ".Elemani girin : ");
            dizi[i] = inp.nextInt();
        }

        Arrays.sort(dizi);

        System.out.println("en kucuk eleman : " + dizi[0]);
        System.out.println("en buyuk eleman : " + dizi[sayiAdeti-1]);
    }

}
