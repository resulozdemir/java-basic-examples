package Java101;

import java.util.Scanner;

public class palindromikKelime
{
    public static void main(String args[])
    {

        Scanner inp = new Scanner(System.in);
        String kelime;

        System.out.print("kelimeyi giriniz : ");
        kelime = inp.nextLine();

        palindromik(kelime);


    }

    public static void palindromik(String kelime){
        String reverse = "";
        int i;

        for(i = kelime.length() -1;i >=0; i-- ){
            reverse += kelime.charAt(i);
        }

        if(kelime.equals(reverse)){
            System.out.println("Palindromik kelimedir");
        }
        else{
            System.out.println("Palindromik kelime degildir");
        }
    }
}
