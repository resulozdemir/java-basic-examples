import java.util.Scanner;

public class sinifiGecme {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        int mat,fizik,turkce,kimya,muzik,toplamNot = 0,dersAdeti = 0;
        double ort = 0;

        System.out.print("turkce notunuzu giriniz : ");
        turkce = inp.nextInt();
        if(turkce < 0 || turkce > 100)
        {
        }
        else {
            toplamNot+=turkce;
            dersAdeti++;
        }

        System.out.print("matematik notunuzu giriniz : ");
        mat = inp.nextInt();
        if (mat < 0 || mat > 100) {

        }
        else {
            toplamNot+=mat;
            dersAdeti++;
        }

        System.out.print("fizik notunuzu giriniz : ");
        fizik = inp.nextInt();
        if (fizik < 0 || fizik > 100) {

        }
        else {
            toplamNot+=fizik;
            dersAdeti++;
        }

        System.out.print("kimya notunuzu giriniz :");
        kimya = inp.nextInt();
        if (kimya < 0 || kimya > 100) {

        }
        else {
            toplamNot+=kimya;
            dersAdeti++;
        }

        System.out.print("muzik notunuzu giriniz : ");
        muzik = inp.nextInt();
        if (muzik < 0 || muzik > 100){

        }
        else {
            toplamNot+=muzik;
            dersAdeti++;
        }

        ort = toplamNot/dersAdeti;


        if (ort < 55){
            System.out.println("Sınıf tekrarı");
            System.out.println("Ortalaman : " + ort);
        }

        else if (ort >= 55){
            System.out.println("sınıfı gectin");
            System.out.println("Ortalaman : " + ort);
        }
    }
}
