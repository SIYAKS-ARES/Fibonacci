package Orneklerim;
import java.util.Scanner;
public class WhileDongusuIleBasitAtmProgrami_Switch_ {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            double bakiye = 5000.0;
            int sayac = 3;
            int a = 3;

            System.out.println("\n");
            System.out.println("Welcome to Software Bank!\n");
            System.out.println("Please place your card in the card holder and write okay...");

            while (true) {
                String durum1 = scanner.nextLine();

                if (durum1.equals("okay")) {
                    String pass = "12345";
                    System.out.print("Please enter your password:");

                    while (true) {

                        String userpass = scanner.nextLine();

                        if (userpass.equals(pass)) {
                            System.out.println("The Entry Is Successful!");
                            break;
                        } else {

                            System.err.println("Giriş Başarısız!\n" + "Kalan deneme hakkınız:" + --sayac);

                            if (sayac <= 0) {
                                System.err.println("Sistemden Çıkılıyor!");
                                System.exit(0);

                            }
                        }
                        System.err.print("Please enter your password:");
                    }
                    break;
                } else {

                    if (a > 1) {
                        System.err.println("Lütfen doğru yazdığınızdan emin olunuz!");
                        System.err.println("Kalan deneme hakkınız:" + --a);

                    } else {
                        System.out.println("Kartınızı hazneden alınız ve işlemleri tekrarlayınız.");
                        System.exit(0);
                    }
                }
            }

            String islemer = """
                    1. İşlem : Bakiye öğrenme
                    2. İşlem : Para çekme
                    3. İşlem : Para yatırma
                    Çıkış için 4'a basınız.""";
            System.out.println("*************************");
            System.out.println(islemer);
            System.out.println("*************************");
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz:");

            while (true) {

                String islem = scanner.nextLine();

                switch (islem) {

                    case "4" -> {
                        System.out.println("Çıkış yapılıyor...");
                        System.out.println("Bizi tercih ettiğiniz için teşekkür eder, iyi günler dileriz...");
                        System.exit(0);

                    }
                    case "1" -> System.out.print("Bakiyeniz = " + bakiye +
                            "\nLütfen yapmak istediğiniz işlemi seçiniz:");

                    case "2" -> {
                        System.out.println("Bakiyeniz = " + bakiye);
                        System.out.print("Lütfen çekmek istediğiniz tutarı giriniz:");
                        int cekilecektutar = scanner.nextInt();
                        scanner.nextLine();
                        if (bakiye - cekilecektutar < 0) {
                            System.out.println("Yetersiz bakiye!\nBakiyeniz:" + bakiye);
                            System.out.print("Dilerseniz %1.5 faiz ile kredi seçenekleri mevcuttur.\n" +
                                    "Lütfen yapmak istediğiniz işlemi seçiniz:");
                        } else {
                            bakiye -= cekilecektutar;
                            System.out.println("Kalan bakiye = " + (bakiye) + "\n");
                            System.out.println("Önce Kartınızı alınız, ardından para bölmesinden " + cekilecektutar +
                                    " TL miktarındaki nakit paranızı alınız...");
                            System.exit(0);
                        }

                    }
                    case "3" -> {
                        System.out.print("Lütfen yatırmak istediğiniz tutarı giriniz:");
                        int yatirilacaktutar = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Parayı hazneye koyunuz, ardından bekleyiniz...");
                        bakiye += yatirilacaktutar;
                        System.out.print("Yeni bakiyeniz " + (bakiye) + " olmuştur.\n" +
                                "Lütfen yapmak istediğiniz işlemi seçiniz:");

                    }
                    default ->
                        System.err.print("Yanlış seçim!\n" + "Lütfen yukarıdaki işlemlerden bir tanesini seçiniz: ");
                }
            }
        }
    }
}
