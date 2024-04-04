package Udemy;

import Constructor.Account;

public class Referanslar {

    public static void main(String[] args) {

        /*Account account1 = new Account("Mehmet Said Hüseyinoğlu", "example@gmail.coom", "05450000000");
        //account1 bir referans noktası oluyor. Ve account2 bu referansa atanıyor
        Account account2 = account1;

        if (account1 == account2) {
            System.out.println("Aynı objeyi gösteriyorlar...");
        }else {
            System.out.println("Aynı objeyi göstermiyorlar...");
        }*/

        new Account("Mehmet Said Hüseyinoğlu", "example@gmail.coom", "05450000000").bilgileriGoster();
        /*Çıktısı bir referans oluşturuyor. Java bir referansa atamadığımız için sorun çıkaarmıyor. İleride
        kullanılaıyor. Tek satırlık işlemlerde kullanılır.*/
    }
}
