import java.util.Scanner;

public class usluSayi {

    public static void main(String[] args) {
        int n,k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Tabani giriniz: ");
        n = sc.nextInt();
        System.out.print("Ussu giriniz : ");
        k = sc.nextInt();
        int total = 1;

        for (int i=1;i<=k;i++){
            total *=n;
        }
        System.out.println("Cevap : "+total);
    }
}
