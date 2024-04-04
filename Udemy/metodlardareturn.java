package Udemy;

public class metodlardareturn {

    public static int multiplicationbytwo(int a){
        return a * 2;
    }
    public static int plusbytwo(int b){
        return b + 2;
    }
    public static int multiplicationbyfour(int c){
        return c *  4;
    }
    public static void main(String[] args){
        System.out.print("Result: " + multiplicationbytwo(plusbytwo(multiplicationbyfour(3))));
    }
}
