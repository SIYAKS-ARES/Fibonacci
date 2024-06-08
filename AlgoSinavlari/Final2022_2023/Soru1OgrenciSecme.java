package AlgoSinavlari.Final2022_2023;
import java.util.*;
public class Soru1OgrenciSecme {
    public static void main(String[] args) {
        List<Integer> ogrenci_numarasi = new ArrayList<>();
        for (int i = 2023100; i <= 2023399; i++) {
            ogrenci_numarasi.add(i);
        }
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter n: ");
            int n = scanner.nextInt();
            Collections.shuffle(ogrenci_numarasi);
            List<Integer> list = new ArrayList<>();
            for (int k = 0; k < n; k++) {
                list.add(ogrenci_numarasi.get(k));
            }
            System.out.println(list);
        } finally {
            scanner.close();
        }
    }
}
