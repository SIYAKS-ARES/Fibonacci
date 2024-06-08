package AlgoSinavlari;
import java.util.Scanner;
public class KucuktenBuyuge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin eleman sayısını giriniz: ");
        int n = scanner.nextInt();
        int gecici;
        int dizi[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Dizinin elemanlarını giriniz: ");
            int a = scanner.nextInt();
            dizi[i] = a;
        }
        for (int i = 0; i < (n - 1); i++) {
            for (int j = (i + 1); j < n; j++) {
                if (dizi[j] < dizi[i]) {
                    gecici = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = gecici;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(dizi[i] + " ");
        }
        scanner.close();
    }
}
