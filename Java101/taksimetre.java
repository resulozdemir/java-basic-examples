package Java101;

import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        double mesafe,ucret,KMucreti = 2.20,acilisUcreti = 10;

        System.out.print("Mesafeyi giriniz : ");
        mesafe = inp.nextDouble();

        ucret = mesafe * KMucreti + acilisUcreti;

        if(ucret <= 20){
            System.out.println("Ucret : " + 20);
        }
        else{
            System.out.println("Ucret : " + ucret);
        }
    }
}
