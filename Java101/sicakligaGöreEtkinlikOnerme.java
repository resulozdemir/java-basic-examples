package Java101;

import java.util.Scanner;

public class sicakligaGöreEtkinlikOnerme {
    public static void main(String args[])
    {
        Scanner inp = new Scanner(System.in);

        int sicaklik = 0,flag =0;

        System.out.print("sicakligi girin : ");
        sicaklik = inp.nextInt();

        while(sicaklik < 5 && flag == 0)
        {
            System.out.println("kayak yapabilirsiniz");
            flag++;
        }

        while(sicaklik >= 5 && sicaklik <= 15 && flag ==0){
            System.out.println("sinemaya gidebilirsiniz");
            flag++;
        }

        while(sicaklik > 15 && sicaklik <= 25 && flag == 0){
            System.out.println("piknik yapabilirsiniz");
            flag++;
        }

        while(sicaklik > 25 && flag == 0){
            System.out.println("yüzebilirsiniz");
            flag++;
        }


    }
}
