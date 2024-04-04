package Orneklerim;

import java.util.Scanner;
                /*Eksik ve hatalı...
                Aralıkları kapsamıyor...
                Aralıkları kapsaması için if else ile yapılmalı...*/
public class GecerNotSwitchCase {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Notunuzu Giriniz: ");
        int not = scanner.nextInt();
        switch (not) {
            case 90 -> System.out.print("Notunuz: AA");
            case 85 -> System.out.print("Notunuz: BA");
            case 80 -> System.out.print("Notunuz: BB");
            case 75 -> System.out.print("Notunuz: CB");
            case 70 -> System.out.print("Notunuz: CC");
            case 65 -> System.out.print("Notunuz: DC");
            case 60 -> System.out.print("Notunuz: DD");
            default -> System.out.print("HATA!!! 90, 85, 80, 75, 70, 65 ya da 60'a basınız.");
        }
    }
}
