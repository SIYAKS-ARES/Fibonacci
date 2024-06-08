package Orneklerim;

import java.util.Scanner;

public class GecerNot {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen notunuzu giriniz: ");
        int not = scanner.nextInt();

        if (not>=90){
            System.out.print("Notunuz:AA");
        } else if (not>=85) {
            System.out.print("Notunuz:BA");
        } else if (not>=80) {
            System.out.print("Notunuz:BB");
        } else if (not>=75) {
            System.out.print("Notunuz:CB");
        } else if (not>=70) {
            System.out.print("Notunuz:CC");
        } else if (not>=65) {
            System.out.print("Notunuz:DC");
        } else if (not>=60) {
            System.out.print("Notunuz:DD");
        }
        else {
            System.out.print("Bu Dersten Kaldınız!!!");
        }
        scanner.close();
    }
}
