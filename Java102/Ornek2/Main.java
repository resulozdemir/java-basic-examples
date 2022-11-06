package Java102.Ornek2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //birden fazla interface implament edebilirken birden fazla abstract sınıf extend edemessin

        Scanner input = new Scanner(System.in);

        System.out.println("Tutar giriniz : ");
        double price = input.nextDouble();

        System.out.println("Kart no giriniz : ");
        String cardNumber = input.nextLine();

        System.out.println("Son kullanım tarihi giriniz : ");
        String expiryDate = input.nextLine();

        System.out.println("Guvenlik kodunu giriniz : ");
        String cvc = input.nextLine();

        System.out.println("1. A Bankası");
        System.out.println("2. B Bankası");
        System.out.println("3. C Bankası");
        System.out.println("4. D Bankası");
        System.out.println("Banka seciniz : ");
        int selectBank = input.nextInt();

        switch (selectBank){
            case 1 :
                ABankasi aPos = new ABankasi("A Bankası" , "153543543","13153135");
                aPos.connect("127.1.1.1");
                aPos.peyment(price,cardNumber,expiryDate,cvc);

                break;
            case 2:
                BBankasi bPos = new BBankasi("A Bankası" , "153543543","13153135");
                bPos.connect("127.1.1.1");
                bPos.peyment(price,cardNumber,expiryDate,cvc);
                break;




            default:
               System.out.println("Gecerli banla giriniz !");

        }

    }




}
