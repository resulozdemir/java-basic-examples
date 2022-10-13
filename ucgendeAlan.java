import java.util.Scanner;


public class ucgendeAlan {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        int kenarBir,kenarIki,kenarUc;
        double alan,temp;

        System.out.print("Ucgenin kenar uzunlugunu giriniz  : ");
        kenarBir = inp.nextInt();

        System.out.print("Ucgenin kenar uzunlugunu giriniz  : ");
        kenarIki = inp.nextInt();

        System.out.print("Ucgenin kenar uzunlugunu giriniz  : ");
        kenarUc = inp.nextInt();

        temp = (kenarBir+kenarIki+kenarUc) / 2;
        alan = Math.sqrt((temp * (temp - kenarBir) * (temp - kenarIki) * (temp - kenarUc)));

        System.out.println(alan);
    }
}
