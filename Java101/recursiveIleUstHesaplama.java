package Java101;
import java.util.Scanner;

public class recursiveIleUstHesaplama {
    static int sayac=0;
    static int asalSayiMi(int sayi,int i) {

        if (sayi % i != 0 && i < sayi) {
            return asalSayiMi(sayi,i+1);
        }
        else if (sayi % i == 0 && i < sayi){
            sayac++;
        }

        return sayac;
    }

    public static void main(String[] args) {
        int sayi,i=2;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayi giriniz :");
        sayi = inp.nextInt();

        String sonuc = asalSayiMi(sayi,i) == 0 ? "Asal sayi" : "Asal sayi degil";
        System.out.println(sonuc);
    }
}
