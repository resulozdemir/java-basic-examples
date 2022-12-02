package Java101;
import java.util.Arrays;
import java.util.Random;

public class DizideTekrarEdenSayilariBulma {
    public static void main(String[] args) {
        Random r = new Random();

        int[] dizi = new int[10];
        int[] control = new int[dizi.length];

        for (int i = 0; i < dizi.length; i++)
            dizi[i]=r.nextInt(20);
        System.out.println(Arrays.toString(dizi));
        int c,kontrol=0;

        for (int i = 0; i < dizi.length; i++)
        {
            c = 1;
            for (int j = 0; j < dizi.length; j++)
                if (dizi[i] == dizi[j] && i != j)
                    c++;
            if (varMi(dizi[i], control) && dizi[i]%2==0)
            {
                System.out.println(dizi[i] + " sayısı " + c + " kere tekrar edildi.");
                control[kontrol++] = dizi[i];
            }
        }
    }
    static boolean varMi(int value, int[] control)
    {
        for(int i : control)
            if (i == value)
                return false;
        return true;
    }

}
