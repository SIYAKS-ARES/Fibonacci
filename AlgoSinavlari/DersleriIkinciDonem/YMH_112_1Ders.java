package AlgoSinavlari.DersleriIkinciDonem;

public class YMH_112_1Ders {

    public static void main(String[] args){
        /*int top = 0;
        for(int i = 2; i <=10; i += 2){
            top += i;
        }
        System.out.println("1'den 10'a kadar çift olan sayıların toplamı:" + top);

        Bu şekilde bunun gibi onlarca işlem olan code gruplarında syntax'ı düzgün ama yanlış sonuç üreten programlardan
        kurtulmak için meetodlara ihtiyaç duyarız.

        */

        System.out.println("1'den 10'a kadar olan sayıların toplamı:" + top(1,10));


    }

    public static int top(int i, int k){
        /*
         1-)Bu metotta olduğu gibi tek bir code grubuna toplayabiliriz. Ve yukarıdaki gibi çağırırız.
         2-)Metodu yazarken parantez içinde belirtilen her değişkenin türü ayrı ayrı verilmelidir.
         3-)Programa her yerden ulaşılabilmesi için "public" yapılır
         4-)Her hangi bir nesne üretilmeden yapmak için "static" yapılır
         5-)Staticten sonra yazan "int" de geri dönüş türünü belirtir
         6-)Metot isimleri ilk kelime küçük harfle başlayacak, Türkçe karakter içermeyecek ve sonraki kelime büyük harfle
         başlayacak şekilde oluşturulur
         */
        int sonuc = 0;
        for (int l = i; l <= k; l++ )//Döngü tek satır olduğu için süslü parantezlere gerek yok.
            sonuc += l;
        return sonuc;
    }
}


