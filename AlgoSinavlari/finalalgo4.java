package AlgoSinavlari;

public class finalalgo4 {
    public static void main(String[] args) {
System.out.println(Hesap.kareAl(5));
System.out.println(Hesap.kupAl(5));
System.out.println(Hesap.karekokAl(64));
System.out.println(Hesap.karekokAl(Hesap.hesapKatsayi));
Hesap hesap1 = new Hesap();
Hesap hesap2 = new Hesap();
Hesap hesap3 = new Hesap();
Hesap hesap4 = new Hesap();
System.out.println(Hesap.karekokAl(Hesap.hesapKatsayi));
System.out.println(Hesap.karekokAl(hesap1.hesapKatsayi));
System.out.println(Hesap.karekokAl(hesap4.hesapKatsayi));
   }
}
class Hesap {

 public static int hesapKatsayi = 9;
     Hesap() {
     hesapKatsayi= 49;
 }
public static int kareAl(int sayi1) {
 return sayi1 * sayi1; }

public static int kupAl(int sayi2) {
 return sayi2 * sayi2 * sayi2; }

public static double karekokAl(int sayi3) {
 return Math.sqrt(sayi3); }

}

