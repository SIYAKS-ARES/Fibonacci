package Denemeler;
import java.util.*;


public class fadil {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


        String intData;
        System.out.println("Enter Integer value:");
        intData = sc.nextLine();
        String s= ((Object)intData).getClass().getSimpleName();

        if(s.equals("Integer")){

            System.out.println("Doğru");
        }
        else {
            System.out.println("yanlış");
        }

    }}
