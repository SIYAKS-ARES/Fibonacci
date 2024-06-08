package AlgoSinavlari;
import java.util.Scanner;
public class FibonacciDiziler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int boy = scanner.nextInt();
        int [] fibonacci = new int[boy];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for(int i = 2; i < boy; i++){
            fibonacci [i] = fibonacci[i-1] + fibonacci[i-2];
        }
        for (int j = 0; j < boy; j++){
            System.out.print(fibonacci[j] + " ");
        }
        scanner.close();
    }
}
