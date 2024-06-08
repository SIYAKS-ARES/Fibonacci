package AlgoSinavlari;

import java.util.Scanner;

public class AlgoritmaSlayt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Vize notunuzu giriniz:");
        int vize = scanner.nextInt();
        System.out.print("Lütfen Final notunuzu giriniz:");
        int finalnotu = scanner.nextInt();
        if (finalnotu < 50) {
            System.out.println("Final notu 50'nin altında olduğu için bu dersi geçemediniz!");
        } else {
            double ortalama = vize * 0.4 + finalnotu * 0.6;
            if (ortalama > 50) {
                System.out.println("Başarılı bir öğrencisiniz, tebrikler!");
            } else {
                System.out.println(
                        "Başarısız bir öğrencisiniz, daha verimli çalışmak için danışmanın yanına gidebilirsiniz!");
            }
        }
        scanner.close();
    }
}