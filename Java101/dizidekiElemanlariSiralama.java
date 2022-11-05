package Java101;

import java.util.Scanner;

public class dizidekiElemanlariSiralama {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        int diziBoyutu = 0,sayac,gecici=0,sayac2;

        System.out.print("Dizinin boyutunu giriniz : ");
        diziBoyutu = inp.nextInt();

        int[] dizi = new int[diziBoyutu];

        for(sayac = 0;sayac < diziBoyutu;sayac++){
            System.out.print((sayac+1) + ". Elemani girin : ");
            dizi[sayac] = inp.nextInt();
        }

        for(sayac = 0;sayac < diziBoyutu - 1;sayac++){
            for(sayac2 = sayac + 1 ; sayac2 < diziBoyutu ;sayac2++){
                if(dizi[sayac2] < dizi[sayac]){
                    gecici = dizi[sayac];
                    dizi[sayac] = dizi[sayac2];
                    dizi[sayac2] = gecici;
                }
            }
        }

        for(sayac = 0;sayac < diziBoyutu;sayac++){
            System.out.println((sayac+1) + ". Elemani : " + dizi[sayac]);
        }

    }
}
