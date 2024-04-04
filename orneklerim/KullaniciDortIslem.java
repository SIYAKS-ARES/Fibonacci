package Orneklerim;

import java.util.Scanner;

public class KullaniciDortIslem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1, num2, transactions;
        System.out.println("***************");
        System.out.println("1 - Toplama");
        System.out.println("2 - Cıkarma");
        System.out.println("3 - Carpma");
        System.out.println("4 - Bolme");
        System.out.println("***************");
        System.out.print("Birinci Sayıyı Giriniz: ");
        num1 = scanner.nextInt();
        System.out.print("İkinci Sayıyı Giriiniz: ");
        num2 = scanner.nextInt();
        System.out.print("İşlemi Giiriniz: ");
        transactions = scanner.nextInt();

        if (transactions==1){
            System.out.print("İşlem sonucunuz: " + (num1+num2));
        }
        else if (transactions==2) {
            System.out.print("İşlem sonucunuz: " + (num1-num2));
        } else if (transactions==3) {
            System.out.print("İşlem sonucunuz: " + (num1*num2));
        } else if (transactions==4) {
            System.out.print("İşlem sonucunuz: " + (num1/num2));
        }
        else{
            System.out.println("Tanımlanmamış İşlem!!!");
        }
    }

}
