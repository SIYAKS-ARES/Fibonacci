import java.util.Scanner;
public class TestMesaj {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Mesajiniz: ");
        String msj = klavye.nextLine();
        System.out.print("Kac kez yazdirilsin: ");
        int n = klavye.nextInt();
        System.out.print("Alt alta yazsin mi (E/H): ");
        char secme = scanner.next().charAt(0);
        if (tercih == 'E' || tercih == 'e')
            mesaj Yazdir (msj, n, " \n");
        else
            mesaj Yazdir (msj, n, " \t");
    }

    public static void mesajYazdir(String text, int basla, String secme) {

        for (int indeks = basla; indeks > 0; indeks--)
            System.out.print((basla - indeks + 1) + "-" + text + secme);
    }
}