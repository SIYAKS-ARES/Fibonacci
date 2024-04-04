package AlgoSinavlari;
import java.util.Scanner;
public class TestMesajYazdir {
    public static void mesajyazdir (int sayac, String teks, String opt){
        for (int i = 0; i < sayac; i++ ){
            System.out.print(teks+opt);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mesajınızı giriniz: ");
        String mesaj = scanner.nextLine();
        System.out.print("Mesajınız kaç defa yazdırılsın: ");
        int n = scanner.nextInt();
        mesajyazdir(n,mesaj, " \n");
    }
}
