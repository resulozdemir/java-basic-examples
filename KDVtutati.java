import java.util.Scanner;

public class KDVtutati {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        int kdvSiz,kdvLi,KDV;

        System.out.print("Fiyati girin : ");
        kdvSiz = inp.nextInt();

        if(kdvSiz < 1000){
            KDV = kdvSiz * 18 / 100;
            kdvLi = KDV + kdvSiz;
            System.out.println("KDV li fiyat : " + kdvLi);
            System.out.println("KDV siz fiyat : " + kdvSiz);
            System.out.println("KDV : " + KDV);
        }
        else {
            KDV = kdvSiz * 8 / 100 ;
            kdvLi = KDV + kdvSiz;
            System.out.println("KDV li fiyat : " + kdvLi);
            System.out.println("KDV siz fiyat : " + kdvSiz);
            System.out.println("KDV : " + KDV);
        }

    }
}

