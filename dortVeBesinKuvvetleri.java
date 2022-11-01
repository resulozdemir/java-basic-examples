import java.util.Scanner;

public class dortVeBesinKuvvetleri { //girilen sayiya kadar

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz");
        int sayi=sc.nextInt();

        System.out.print( sayi+ " sayısından küçük dördün kuvvetleri: ");
        for (int i=1; i<=sayi; i*=4){
            System.out.print(i + "   ");
        }

        System.out.print( sayi+ " sayısından küçük beşin kuvvetleri: ");
        for (int i=1; i<=sayi; i*=5){
            System.out.print(i + "   ");
        }

    }
}
