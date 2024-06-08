package Orneklerim;
import java.util.Scanner;
public class saglam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bakiye = 5000.0;
        int sayac = 3;
        int a = 3;

        System.out.println("Lütfen kartınızı kart haznesine yerleştiriniz ve tamam yazınız...");

        while (true) {
            String durum1 = scanner.nextLine();

            if (durum1.equals("tamam")) {
                System.out.println("Lütfen şifrenizi giriniz...");
                String pass = "12345";

                while (sayac <= 3) {
                    System.err.print("Şifrenizi giriniz: ");
                    String userpass = scanner.nextLine();


                    if (userpass.equals(pass)) {
                        System.out.println("Giriş Başarılı!");
                        break;
                    } else {

                        System.err.println("Giriş Başarısız, tekrar deneyiniz!");
                        System.err.println("Kalan deneme hakkınız:"+--sayac);

                        if (sayac <= 0) {
                            System.exit(0);

                        }
                    }
                }
                break;
            }
            else {
                if (a>1) {
                    System.err.println("Lütfen doğru yazdığınızdan emin olunuz!");
                    System.err.println("Kalan deneme hakkınız:" + --a);

                }
                else {
                    System.out.println("Kartınızı hazneden alın ve işlemleri tekrarlayın.");
                    System.exit(0);}
            }

        }



        while (true) {
            String islemer = """
                    1. İşlem : Bakiye öğrenme
                    2. İşlem : Para çekme
                    3. İşlem : Para yatırma
                    Çıkış için 4'a basınız.""";
            System.out.println("*************************");
            System.out.println(islemer);
            System.out.println("*************************");
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz:");
            String islem = scanner.nextLine();


            if (islem.equals("4")) {
                System.out.println("Bizi tercih ettiğiniz için teşekkürler, iyi günler dileriz...");
                break;
            } else if (islem.equals("1")) {
                System.out.println("Bakiyeniz = " + bakiye);
            } else if (islem.equals("2")) {
                System.out.print("Lütfen çekmek istediğiniz tutarı giriniz:");
                int cekilecektutar = scanner.nextInt();
                bakiye -= cekilecektutar;
                System.out.println("Kalan bakiye = " + (bakiye) + "\n");
                System.out.println("Önce Kartınızı alınız, ardından para bölmesinden " + cekilecektutar + " TL miktarındaki nakit paranızı alınız...");
                break;
            } else if (islem.equals("3")){
                System.out.print("Lütfen yatırmak istediğiniz tutarı giriniz:");
                int yatirilacaktutar = scanner.nextInt();
                bakiye += yatirilacaktutar;
                System.out.println("Parayı hazneye koyunuz, ardından bekleyiniz...");
                System.out.println("Yeni bakiyeniz " + (bakiye) + " olmuştur.");
            }
            else System.err.println("Yanlış seçim! Lütfen aşağıdaki işlemlerden bir tanesini seçiniz");

        }
        scanner.close();
    }
}
