package Udemy;

import java.util.Scanner;

public class metods {

    public static void faktoriel(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number:");
        int num = scanner.nextInt();
        int faktoriel = 1;
        while (num>0){

            faktoriel *= num;
            num--;
        }

        System.out.print("Faktoriel of number:" + faktoriel);

    }
    public static void main(String[] args){
    faktoriel();
    }
}
