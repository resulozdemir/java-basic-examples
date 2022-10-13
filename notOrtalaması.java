import java.util.Scanner;

public class notOrtalaması {
    public static void main(String[] args){

        int matematik,fizik,kimya,turkce,muzik,tarih,ortalama;

        Scanner inp = new Scanner(System.in);

        System.out.print("matematik notunuz : ");
        matematik = inp.nextInt();

        System.out.print("turkce notunuz : ");
        turkce = inp.nextInt();

        System.out.print("fizik notunuz : ");
        fizik = inp.nextInt();

        System.out.print("kimya notunuz : ");
        kimya = inp.nextInt();

        System.out.print("muzik notunuz : ");
        muzik = inp.nextInt();

        System.out.print("tarih notunuz : ");
        tarih = inp.nextInt();

        ortalama = (matematik+fizik+kimya+muzik+tarih+turkce)/6;

        String sonuc = ortalama < 60 ? "Sınıfta kaldi" : "Sınıfı gecti";

        System.out.print(sonuc);
    }
}
