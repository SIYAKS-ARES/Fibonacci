package AlgoSinavlari.Final2022_2023;
import java.util.Scanner;
public class Soru3DosyaAdiUzantisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir dosya tam adı yazınız: ");
        String dsyad = scanner.nextLine();
        int Noki = dsyad.lastIndexOf(".");
        String sdsyad = dsyad.substring(0, Noki);
        String dsyuza = dsyad.substring(Noki + 1);
        System.out.println("Dosya adı: " + sdsyad);
        System.out.println("Dosya uzantısı: " + dsyuza);
    }
}
