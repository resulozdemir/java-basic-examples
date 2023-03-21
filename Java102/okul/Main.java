package Java102.okul;

import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        System.out.println("dosya ismi giriniz : ");
        String dosyaIsmi = inp.nextLine();

        File f1 = new File(dosyaIsmi);

        try {
            if(f1.createNewFile()){
                System.out.println("basarili bir sekilde olusturuldu");
            }
            else {
                System.out.println("dosya zaten var");
            }
        }
        catch (Exception e){
            System.out.println("dosya olusturma hatasi ile karsilasildi");
        }
        System.out.println("--------------------------");


        if(f1.exists()){
            try{
                FileWriter yaz = new FileWriter(f1,true);
                yaz.write("bu bir deneme yazisidir");
                yaz.close();
            }
            catch (Exception e){
                System.out.println("Yazma sirasinda bir hata olustu");
                e.printStackTrace();
            }

            System.out.println("---------------");

            try {
                Scanner oku = new Scanner(f1);
                while(oku.hasNextLine()){
                    String icerik = oku.nextLine(); //satir satir okur
                    System.out.println(icerik);
                }
                oku.close();
            }
            catch (Exception e){
                System.out.println("dosya okunurken hata ile karsilasildi");
                e.printStackTrace();
            }

            System.out.println("--------------------------");

            try {
                BufferedReader b1 = new BufferedReader(new FileReader(f1));
                String yazi;

                while((yazi = b1.readLine()) != null){
                    System.out.println(yazi);
                }
            }
            catch (Exception e){
                System.out.println("dosya okunurken hata ile karsilasildi");
                e.printStackTrace();
            }

            System.out.println("--------------------------");

            System.out.println("Dosyanın yolu : " + f1.getAbsolutePath());
            System.out.println("Dosya yazilabilir mi : " + f1.canWrite());
            System.out.println("Dosya okunabilir mi : " + f1.canRead());
            System.out.println("Dosyanin byte olarak uzunlugu : " + f1.length());
        }
    }
}
