package AlgoSinavlari;
import java.util.Scanner;
public class TasKagitMakas {
        public static void main(String[] args) {
                int prg = (int) (Math.random() * 3);
                Scanner scanner = new Scanner(System.in);
                String tkm = """
                                Taş için 0'a
                                Kağıt için 1'e
                                Makas için 2'ye basınız.""";
                System.out.println("********************************");
                System.out.println(tkm);
                System.out.println("********************************");
                int kullanici = scanner.nextInt();
                if ((prg == 0 && kullanici == 1) || (prg == 1 && kullanici == 2) || (prg == 2 && kullanici == 0)) {
                        System.out.println("Kazandınız!!!");
                } else if ((prg == 1 && kullanici == 0) || (prg == 2 && kullanici == 1)
                                || (prg == 0 && kullanici == 2)) {
                        System.out.println("Kaybettiniz...");
                } else if ((prg == 1 && kullanici == 1) || (prg == 2 && kullanici == 2)
                                || (prg == 0 && kullanici == 0)) {
                        System.out.println("Berabere.");
                } else {
                        System.out.println("Hatalı seçim yaptınız!");
                }
                scanner.close();
        }
}