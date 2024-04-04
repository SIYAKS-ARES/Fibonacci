package Udemy;

import java.util.Scanner;

public class forilefaiz {
    public static void main(String[] args){
        System.out.println("Welcome to Software Bank! Bank rate %6...");
        Scanner scanner = new Scanner(System.in);
        int principal, maturity;
        System.out.print("Please enter the amount you want to deposit :");
        principal = scanner.nextInt();
        System.out.print("Please enter how many years you want to deposit your money? ");
        maturity = scanner.nextInt();

        double total_money = principal;
        double bank_rate = 0.06f;

        for (int i = 1 ; i<=maturity ; i++ ){

            total_money += (total_money*bank_rate);
            System.out.println((float)total_money + " Total money at the end of the year " + i);
        }
    }
}
