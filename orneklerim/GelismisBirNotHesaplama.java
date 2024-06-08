package Orneklerim;

import java.util.Scanner;

public class GelismisBirNotHesaplama {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen vize1 notunuzu giriniz:");
        int vize1 = scanner.nextInt();
        System.out.print("Lütfen vize2 notunuzu giriniz:");
        int vize2 = scanner.nextInt();
        System.out.print("Lütfen final notunuz giriniz:");
        int finalnot = scanner.nextInt();
        if (vize1>101 || finalnot>101|| vize2>101){
            System.out.println("Notlarınız yüzün altında olmalı...");
            System.exit(0);
        }
        System.out.print("Okul ortalamanızı giriniz:");
        double ortalama = scanner.nextDouble();
        if (ortalama>4){
            System.out.println("Ortalamanız dördün altında olmalı...");
            System.exit(0);
        }
        double toplamnot = ((vize1+vize2)*0.3 + finalnot*0.4);
        System.out.println("Not ortalamanız:" + toplamnot);

        if (toplamnot >= 90){
            System.out.println("AA aldınız...");
        } else if (toplamnot>=85) {
            System.out.println("BA aldınız...");
        } else if (toplamnot>=80) {
            System.out.println("BB aldınız...");
        } else if (toplamnot>=75) {
            System.out.println("CB aldınız...");
        } else if (toplamnot>=70) {
            System.out.println("CC aldınız...");
        } else if (toplamnot>=65) {
            System.out.println("DC aldınız...");
        } else if (toplamnot>=60) {
            System.out.println("DD aldınız...");
            if (ortalama<2.50){
                System.out.println("DD aldınız ve not ortalamanız düşük. Bu dersi tekrar almayı düşünebilirsiniz...");
            }
        } else if (toplamnot>=55) {
            System.out.println("FD aldınız, DERSTEN KALDINIZ!!!");
        }
        else {
            System.out.println("FF aldınız, DERSTEN KALDINIZ!!!");
        }
        scanner.close();
    }
}
