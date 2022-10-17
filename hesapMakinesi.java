import java.util.Scanner;

public class hesapMakinesi
{
    public static void main(String args[])
    {
        Scanner inp = new Scanner(System.in);

        int sayi1,sayi2,islem,sonuc = 0;

        System.out.print("1.sayiyi giriniz : ");
        sayi1 = inp.nextInt();

        System.out.print("2.sayiyi giriniz :");
        sayi2 = inp.nextInt();

        System.out.print("1-toplama,2-cikartma,3-carpma,4-bolme : ");
        islem = inp.nextInt();

        switch(islem){

            case 1 : sonuc = sayi1 + sayi2;
                break;

            case 2 : if(sayi1<=sayi2){
                sonuc = sayi2 - sayi1;

            }
            else{
                sonuc = sayi1 - sayi2;
            }
                break;

            case 3 : sonuc = sayi1 * sayi2;
                break;

            case 4 : if(sayi1 == 0 || sayi2 == 0)
            {
                System.out.print("sifira bölüm olmaz");
            }
            else{
                sonuc = sayi1 / sayi2;
            }
                break;

        }

        System.out.print("isleminizin sonucu : " + sonuc);

    }
}