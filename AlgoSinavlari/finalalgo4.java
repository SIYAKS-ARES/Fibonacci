package AlgoSinavlari;

public class finalalgo4 {
    public static void main(String[] args) {
        System.out.println(Hesap.kareAl(5));
        System.out.println(Hesap.kupAl(5));
        System.out.println(Hesap.karekokAl(64));
        System.out.println(Hesap.karekokAl(Hesap.hesapKatsayi));
        System.out.println(Hesap.karekokAl(Hesap.hesapKatsayi));
        System.out.println(Hesap.karekokAl(Hesap.hesapKatsayi));
        System.out.println(Hesap.karekokAl(Hesap.hesapKatsayi));

        int n = 10; // Number of Fibonacci numbers to generate
        System.out.println("First " + n + " Fibonacci numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

class Hesap {
    static int hesapKatsayi = 9;

    Hesap() {
        hesapKatsayi = 49; // This line is redundant and can be removed
    }

    public static int kareAl(int sayi1) {
        return sayi1 * sayi1;
    }

    public static int kupAl(int sayi2) {
        return sayi2 * sayi2 * sayi2;
    }

    public static double karekokAl(int sayi3) {
        return Math.sqrt(sayi3);
    }
}
