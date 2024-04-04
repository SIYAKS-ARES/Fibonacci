package Denemeler;

import java.util.Scanner;

public class deneme {
  public static void main(String[] args){
   /* Scanner scanner = new Scanner(System.in);
    System.out.print("Bir dosya tam adı yazınız: ");
    String dsyad = scanner.nextLine();
    int Noki = dsyad.lastIndexOf(".");
    //System.out.println(Noki);

    String s="Main.java";
    System.out.println(s.substring(0,Noki));
    System.out.println(s.substring(Noki + 1));*/



        char c1 = 'A', c2 = 'K';
        int d1 = (int)c2, d2 = (int)c1;
        System.out.printf("::%4c::->::%-4c::\n",c1,c2);
        System.out.println(c2 + "-->" + d2);
        d2--;
        --d2;
        System.out.println("(" + c1 + ">" + c2 + ")" + (char)d2);
        System.out.println((char)d1 + ":" + c1-- );
        c1--;
        c1--;
        System.out.printf("%6d-->", --c1);

    }
}

