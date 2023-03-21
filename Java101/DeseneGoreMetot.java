package Java101;
import java.util.Scanner;

public class DeseneGoreMetot {
    public static boolean flag = false;
    public static boolean initialInputFlag = false;
    public static int checkNumber = 0;

    public static int desen(int sayi) {


        if(!initialInputFlag) {
            initialInputFlag = true;
            checkNumber = sayi;
        }

        if (sayi <= 0 || flag) {
            if( sayi > checkNumber ) {
                return 0;
            }
            flag = true;
            System.out.print(sayi + ",");
            return desen ((sayi + 5));
        }
        else {
            System.out.print(sayi + ",");
            return desen ((sayi -5));
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N Sayısı : ");
        int sayi = scanner.nextInt();

        System.out.println(desen(sayi));
    }

}
