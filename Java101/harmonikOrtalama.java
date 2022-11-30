package Java101;

public class harmonikOrtalama {
    public static void main(String[] args) {

        int[] dizi = {1,2,3,4,5};
        double toplam = 0,ortalama;

        for(double eleman : dizi) {
            toplam += 1/eleman;
        }

        ortalama = dizi.length / toplam;

        System.out.println("Harmoik ortalama : " + ortalama);


    }
}
