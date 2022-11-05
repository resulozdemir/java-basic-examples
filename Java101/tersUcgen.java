package Java101;

import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {
//kullanıcı tarafından girilen basamak değeriyle ters üçgen oluşturuluyor.
        int i,number,j,k;
        Scanner input = new Scanner(System.in);

        System.out.println("Number of Digits: ");
        number = input.nextInt();

        for(i=number;i>=1;i--){
            for(j=number-i;j>=1;j--){
                System.out.print(" ");
            }
            for(k=(2*i-1);k>=1;k--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}