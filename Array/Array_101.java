package Array;

import java.util.Scanner;

public class Array_101 {

    public static void arrayi_bastir(int[] array){//Metod oluşturulur.

        for (int i = 0; i < array.length; i++){
            System.out.println("Element " + (i + 1) + ":" + array[i]);
        }

    }

    public static double ortalamabul(int [] array){ //Hesaplama metodu oluşturulur.
        int toplam = 0;
        for (int j : array) {
            toplam += j;
        }
        return ((double) toplam/array.length);
        }

    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);

        int [] b = {10,20,30,40,50};

        arrayi_bastir(b); //Metod çağırılır.

        System.out.println("Arrayinzin ortalaması: " + ortalamabul(b));//Metod hesaplama için burada çağırılır.

        /*int a = 5; tek değer saklanacağı zaman
        int [] a; // dizi olarak değer saklanacağı zaman
        double [] b;*/

        /*int [] a = new int[10]; //Bellekte on adet int değer için yer açıyor.
        a[5] = 10; //Diziye git ve beşinci index e 10 değerini ata.*/

        //Diğer bir kullanım şekli ise;

        /*int [] a = {1,2,3,4,5,6,7,8,9,10}; //Tek tek tanımlamak yerine tek bir satırda bu şekilde halledilebilir.
        System.out.println(a[0]); // a dizisinin 0 ıncı index ini ekrana yazdırır.*/

        /*int [] a = new int[5];

        int [] b = {10,20,30,40,50};

        System.out.println("Arrayimizin içinde " + b.length + "adet elaman bulunuyor.");
        //Bu şekilde arrayin içinde kaç adet eleman olduğunu görebiliriz, yani boyunu
        */


        /*for (int i = 0; i < 5 ; i++){ Diziye eklenecek değerleri kullanıcıdan almak için

            System.out.print("Lütfen diziye eklemek istediğniz tam sayıyı giriniz: ");

            a[i] = scanner.nextInt();

        }*/

        /*for (int i = 0; i < 5 ; i++){  Döngü ile değer atamak için...

            a[i] = i * 4 + 2;

        }

        for (int i = 0; i < 5 ; i++){

            System.out.println(a[i]);

        }*/

    }
}
