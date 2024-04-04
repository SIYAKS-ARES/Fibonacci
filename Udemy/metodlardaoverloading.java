package Udemy;

public class metodlardaoverloading {
    public static void skorhesapla(String isim, int puan){
        System.out.println (isim + " adlı oyuncunun " + puan + "'ı var.");
    }
    public static void skorhesapla( int puan){
        System.out.println("İsimsiz oyuncunun " + puan + "'ı var.");
    }
    public static void skorhesapla(String isim){
        System.out.println(isim + " adlı oyuncunun hiç puanı yok.");
    }
    public static void main(String[] args){
        skorhesapla("Said",1000);
        skorhesapla(1500);
        skorhesapla("Mehmet");
    }
}

