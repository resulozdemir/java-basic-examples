package Java101;
import java.util.Scanner;

public class cinZodyagiHesaplama {
    public static void main(String[] args) {
        int yil;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dogum yilinizi giriniz : ");
        yil = inp.nextInt();

        if(yil % 12 == 0){
            System.out.println("Cin Zodyagı Burcunuz : Maymun");
        }

        else if(yil % 12 == 1){
            System.out.println("Çin Zodyağı Burcunuz : Horoz");
        }

        else if(yil % 12 == 2){
            System.out.println("Çin Zodyağı Burcunuz : Kopek");
        }

        else if(yil % 12 == 3){
            System.out.println("Çin Zodyağı Burcunuz : Domuz");
        }

        else if(yil % 12 == 4){
            System.out.println("Çin Zodyağı Burcunuz : Fare");
        }

        else if(yil % 12 == 5){
            System.out.println("Çin Zodyağı Burcunuz : Okuz");
        }

        else if(yil % 12 == 6){
            System.out.println("Çin Zodyağı Burcunuz : Kaplan");
        }

        else if(yil % 12 == 7){
            System.out.println("Çin Zodyağı Burcunuz : Tavsan");
        }

        else if(yil % 12 == 8){
            System.out.println("Çin Zodyağı Burcunuz : Ejderha");
        }

        else if(yil % 12 == 9){
            System.out.println("Çin Zodyağı Burcunuz : Yilan");
        }

        else if(yil % 12 == 10){
            System.out.println("Çin Zodyağı Burcunuz : At");
        }

        else if(yil % 12 == 11){
            System.out.println("Çin Zodyağı Burcunuz : Koyun");
        }
    }
}
