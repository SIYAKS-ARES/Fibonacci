package AlgoSinavlari;
import java.util.Scanner;

public class DaireninAlaniveDaireninCevresi {
public static void main(String[]args) {
    final double pi = 3.141593;
    Scanner scanner = new Scanner(System.in);
    String Islem = """
                   Dairenin alan hesabı için 1'e
                   Dairenin çevre hesabı için 2'ye basınız.""";
    System.out.println("****************************************");
    System.out.println(Islem);
    System.out.println("****************************************");
    System.out.print("Lütfen yapmak istediğiniz işlemin numarasını giriniz: ");
    String secim = scanner.nextLine();
    if(secim.equals("1")) {
        System.out.print("Lütfen alanını hesaplamak istediğiniz dairenin yarıçapını yazınız:");
        double yaricap = scanner.nextDouble();

        if (yaricap < 0) {
            System.out.println("Yanlış giriş, yarıçap sıfırdan küçük olamaz!!!");
        } else {
            System.out.print("Dairenizin alanı:" + (pi * yaricap * yaricap));
        }
    }
    else if(secim.equals("2")) {
        System.out.print("Lütfen çevresini hesaplamak istediğiniz dairenin yarıçapını yazınız:");
        double yaricap = scanner.nextDouble();
        if (yaricap < 0) {
            System.out.println("Yanlış giriş, yarıçap sıfırdan küçük olamaz!!!");
        } else {
            System.out.print("Dairenizin çevre uzunluğu:" + (2 * pi * yaricap));
        }
    }
    else {
        System.out.println("Yanlış girdiniz, lütfen tekrar deneyiniz.");
    }
}
}
