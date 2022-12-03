package Java101.MayinTarlasi;
import javax.crypto.spec.PSource;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Oyunu Başlatmak için lütfen satır ve sütun sayısı giriniz.\nSatır:");
        int row=s.nextInt();
        System.out.print("Sütun:");
        int col=s.nextInt();
        MineSweeper m = new MineSweeper(row,col);
        m.run();
    }

}
