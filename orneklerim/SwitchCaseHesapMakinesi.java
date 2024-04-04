package Orneklerim;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SwitchCaseHesapMakinesi {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("*********************");
        String islemler = "1 - Toplama işlemi\n"
                          +"2 - Çıkarma işlemi\n"
                          +"3 - Çarpma işlemi\n"
                          +"4 - Bölme işlemi";
        System.out.println(islemler);
        System.out.println("*********************");
        System.out.print("Lütfen ilk sayıyı giriniz:");
        int num1 = scanner.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz:");
        int num2 = scanner.nextInt();
        System.out.print("Yapmak istediğiniz işlemin numarasını giriniz:");
        int islem = scanner.nextInt();


        switch (islem){
            case 1 -> System.out.println("İşleminizin sonucu:" + (num1+num2));
            case 2 -> System.out.println("İşleminizin sonucu:" + (num1-num2));
            case 3 -> System.out.println("İşleminizin sonucu:" + (num1*num2));
            case 4 -> System.out.println("İşleminizin sonucu:" + ((double)num1/num2));
            default -> System.out.println("Lütfen geçerli bir işlem numarası giriniz!!!");
        }
    }
}
