package Orneklerim;

import java.util.Scanner;

public class ForIleFaktoriyel {
    public static void main(String[] args){
        // for döngüsü ile faktöriyel hesaplama...
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen faktöriyelini bulmak istediğiniz sayıyı giriniz:");

        int n = scanner.nextInt();
        int faktoriyel = 1;
        for (int i = 1; i<=n ; i++){
            faktoriyel *= i ;
        }
        System.out.print(n + " sayısının faktöriyeli:" + faktoriyel);

    }
}
