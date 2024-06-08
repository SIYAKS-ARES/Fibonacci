package IdmanProgrami;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("İdman programına hoş geldiniz...");

            String idmanlar = """
                    Burpee,
                    Pushup,
                    Situp,
                    Squad.""";

            System.out.println("********************************");
            System.out.print(idmanlar);
            System.out.println("********************************");

            System.out.println("Bir idman oluşturunuz...");

            System.out.print("Burpee sayısı: ");
            int burpee_sayisi = scanner.nextInt();

            System.out.print("Pushup sayısı: ");
            int pushup_sayisi = scanner.nextInt();

            System.out.print("Situp sayısı: ");
            int situp_sayisi = scanner.nextInt();

            System.out.print("Squad sayısı: ");
            int squad_sayisi = scanner.nextInt();

            scanner.nextLine();

            Idman idman = new Idman(burpee_sayisi, pushup_sayisi, situp_sayisi, squad_sayisi);

            System.out.println("İdmanınız başlıyor...");

            while (idman.IdmanBittiMi() == false) {
                System.out.print("Hareket türünü giriniz(Burpee, Pushup, Situp, Squad): ");
                String tur = scanner.nextLine();
                System.out.print("Adet sayısı giriniz: ");
                int adet = scanner.nextInt();
                scanner.nextLine();
                idman.hareketYap(tur, adet);
            }
            System.out.println("İdmanınızı tamamladığınız için tebrik ederiz,\n" +
                    "Program kapatılıyor...");
        } finally {
            scanner.close();
        }
    }
}