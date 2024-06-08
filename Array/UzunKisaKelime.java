package Array;
import java.util.Scanner;

public class UzunKisaKelime {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int fark;

        System.out.print("Dizinin uzunluğunu giriniz: ");
        int n = scanner.nextInt();

        String dizi[] = new String[n];

        for (int a = 0; a < n; a++) {
            dizi[a] = scanner.next();
        }

        int kisaKelimeHarf = dizi[0].length();
        int uzunKelimeHarf = dizi[0].length();

        for (int i = 0; i < n; i++) {
            if (kisaKelimeHarf >= dizi[i].length()) {
                kisaKelimeHarf = dizi[i].length();
            }
            if (uzunKelimeHarf <= dizi[i].length()) {
                uzunKelimeHarf = dizi[i].length();
            }
        }

        fark = uzunKelimeHarf - kisaKelimeHarf;
        System.out.println(fark);

        scanner.close();

        /*
         * System.out.println("Lütfen dizinin eleman sayısını giriniz: ");
         * int kullaniciGirisi=scanner.nextInt();
         * String[] dizi=new String[kullaniciGirisi];
         * System.out.println("Şimdi ise dizinin elemanlarını giriniz.");
         * String kisaKelime = scanner.nextLine();
         * String uzunKelime = scanner.nextLine();
         * for (int i=0;i<kullaniciGirisi;i++){
         * if (uzunKelime.length()<dizi[0].length()){
         * uzunKelime=dizi[i];
         * }
         * if (kisaKelime.length()>dizi[0].length()){
         * kisaKelime=dizi[i];
         * }
         * System.out.println(uzunKelime+" uzun kelime."
         * +kisaKelime+" kısa kelime.Uzun kelime ile kısa kelime arasındaki harf farkı: "
         * + ( uzunKelime.length() - kisaKelime.length() ));
         */
    }



}
