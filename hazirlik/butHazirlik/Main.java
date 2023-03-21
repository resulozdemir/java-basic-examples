package hazirlik.butHazirlik;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        /*int a = 15,b = 11,c = 0;
        //11 //00001011 -> 1 bit
        //15 //00001111 -> 1 bit

        c = a & b;      //a ve b (bit olarak)
        System.out.println(c);      //11

        c = a | b;      //a veya b (bit olarak)
        System.out.println(c);      //15

        c = a ^ b;      //a xor b (iki input aynı ise 1 döndürür)
        System.out.println(c);      //4

        c = ~a;         //1 e tümler tüm 0 ları
        System.out.println(c);

        c = a << 1;     //2 ile çarpma
        System.out.println(c);

        c = a >> 1;     //2 ile bölme
        System.out.println(c);

        System.gc();*/

        //instance sınıf değişkenlerine denir

        /*---------------------------------------------------------*/

        /*
        int a,b,c;
        Scanner inp = new Scanner(System.in);

        System.out.print("a : ");
        a = inp.nextInt();

        System.out.print("b : ");
        b = inp.nextInt();

        try{
            c = a / b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);

        }*/

        /*---------------------------------------------------------*/

        /*
        String r = "resul",e = "ekrem", o = "ozdemir";

        String sonuc = r.concat(e + o);
        System.out.println(sonuc);

        if (r.isEmpty())
            System.out.println(r);
        else
            System.out.println(e);*/

        /*//SADECE INSANA AIT OZELLIKLERE ERISILEBİLİR
        Insan i1 = new Ogretmen();
        i1.ses();*/
/*
        int[] dizi = {4,15,19,25,45,72,99};
        int a = AramaAlgoritmalari.lineerSearch(99,dizi);
        if(a>=0){
            System.out.println(a);
        }
        a = AramaAlgoritmalari.binarySearch(25,dizi);
        System.out.println(a);

*/
 /*   File dosya = new File("but.txt");

    try{
        if(dosya.createNewFile()){
            System.out.println("dosya basari ile olusturuldu");
        }
        else {
            System.out.println("dosya olusturulamadi");
        }
    }
    catch (Exception e){
        System.out.println("dosya ollustururken hata ile karsilasildi");
    }

    if(dosya.exists()){
        try {
            BufferedReader br = new BufferedReader(new FileReader(dosya));
            String icerik;

            while((icerik=br.readLine()) != null){      //BURASI ONEMLI
                System.out.println(icerik);
            }

            br.close();
        }
        catch (Exception e){
            System.out.println(e);
        }

        try {
            Scanner oku = new Scanner(dosya);

            while(oku.hasNextLine()){
                String veri = oku.nextLine();
                System.out.println(veri);
            }

            oku.close();
        }
        catch (Exception e){
            System.out.println(e);
        }

        try{
            FileWriter fl = new FileWriter(dosya,true); //TRUE OLURSA DEVAMINA YAZAR
            fl.write("sdadasda");
            fl.close();

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
*/

        //BOS SATIRLAR OKUNMAK ISTENMIYORSA BUFFERED READER
        //DOSYADAN OKUNUP BIR ARRAYE ATILACAKSA SCANNER DAHA MANTIKLI
        //BINARY SEARCH ALGORITMASINI KULLANABILMEN ICIN ARRAYIN SIRALANMIS OLMASI GEREKİYIR
        //ABSTRACT CLASSLARDAN VE INTERFACELERDEN NESNE OLUSTURULABILIR AMA SADECE ANIMAL A1 = NEW CAT(); SEKLINDE
        //ABSTRACT CLASSLARDA TANIMLAMA YAPARKEN ABSTRACT YAZILIR AMA SUB CLASSLARDA METOT OVERRIDE EDİLİRKEN ABSTRACT YAZILMAZ

    }
}
