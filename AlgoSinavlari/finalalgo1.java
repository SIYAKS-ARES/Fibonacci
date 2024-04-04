package AlgoSinavlari;

import java.io.*;

public class finalalgo1 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        File dosyacik = new File("sinif_listesi.txt");
        if (dosyacik.exists()) {
            System.out.println("Dosya mevcut");
            System.exit(1);
        }
        PrintWriter cikan = new PrintWriter(dosyacik);
        cikan.print("Yaman Akbulut Algoritma ");
        cikan.println(85);
        cikan.print("Diger Kisi Algoritma ");
        cikan.println(90);
        cikan.close();
    }
}






