package Java101;
import java.util.Arrays;
import java.util.Scanner;

public class dizidekiEnBuyukVeEnKucuk {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int[] dizi = {52,4,95,6,32,48,1,-2,6};
        int girilenSayi;

        System.out.println("Dizi : {52,4,95,6,32,48,1,-2,6}");
        System.out.print("Sayi giriniz : ");
        girilenSayi = inp.nextInt();

        dizi[dizi.length-1]=girilenSayi;
        Arrays.sort(dizi);

        int index = Arrays.binarySearch(dizi,girilenSayi);

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + dizi[index - 1]);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + dizi[index + 1]);








    }




}
