package Java101;
import java.util.Scanner;

public class MatrisinTranspozu {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int satir,sutun,deger,gecici;

        System.out.print("Matrisin satirini giriniz : ");
        satir = inp.nextInt();

        System.out.print("Matrisin sutununu giriniz : ");
        sutun = inp.nextInt();

        int[][] matris = new int[satir][sutun];
        int[][] tmatris = new int[satir][sutun];

        for(int i=0 ; i < satir ; i++){
            for(int j=0 ; j < sutun ; j++){
                System.out.print((i+1) + " " + (j+1) + ". Degerini giriniz : ");
                deger = inp.nextInt();
                matris[i][j]=deger;
            }
        }

        for(int i=0; i<sutun; i++){
            for(int j=0; j<satir; j++){
                tmatris[i][j] = matris[j][i];
                System.out.print(tmatris[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
