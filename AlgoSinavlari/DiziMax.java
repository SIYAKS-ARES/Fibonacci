package AlgoSinavlari;

import java.util.Scanner;

public class DiziMax {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi boyutunu giriniz: ");
        int n = scanner.nextInt();
        int dizi[] = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            System.out.print("Dizi elamlarını giriniz: ");
            int a = scanner.nextInt();
            dizi[i] = a;
            if (a > max) {
                max = a;
            }
        }
        scanner.close();
        System.out.print("En büyük eleman: " + max);
    }

}

