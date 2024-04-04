package AlgoSinavlari.DersleriIkinciDonem;

import java.util.Scanner;

public class YMH_112_2Ders2 { //Recursive fonksiyonlar, kendini çağıran/yinelemeli fonksiyonlar.
    public static int faktoriyel(int n){
        if (n == 1)
            return 1;
        else
            return (n*faktoriyel(n-1));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Faktöriyelini hesaplamak istediğiniz sayıyı giriniz: ");
        int sayi = scanner.nextInt();
        System.out.print(sayi + " sayısının faktöriyeli: " + faktoriyel(sayi));


        String msj = scanner.nextLine();

        char opsiyon = scanner.next().charAt(0);


    }
}
