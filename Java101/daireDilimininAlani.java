package Java101;

import java.util.Scanner;

public class daireDilimininAlani {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        double pi=3.14,alan;
        int aci,r;

        System.out.print("Dairenin yaricapini girin : ");
        r = inp.nextInt();

        System.out.print("Dairenin acisini giriniz : ");
        aci = inp.nextInt();

        alan = (pi * (r * r) * aci) / 360;
        System.out.println("Alan : " + alan);

    }
}
