package AlgoSinavlari;

import java.util.Scanner;

public class DiziMax {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi boyutunu giriniz: ");
        int n = scanner.nextInt();
        int dizi[] = new int[n];
        int max = dizi[0];
        for (int i = 0; i < n; i++) {
            System.out.print("Dizi elamlarını giriniz: ");
            int a = scanner.nextInt();
            dizi[i] = a;
        }
        for (int i = 0; i < n; i++) {
            if (max < dizi[i]) {
                max = dizi[i];
            }
        }
        System.out.print("En büyük eleman: " + max);
    }

}

