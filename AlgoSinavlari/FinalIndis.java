package AlgoSinavlari;
public class FinalIndis {
    public static void main(String[] args) {
        int m = 5, n = 4;
        System.out.print("!!!!");
        for (int i = 1; i <= n; i++) {
            System.out.print("!!!" + i);
        }
        System.out.println();
        for (int i = 1; i <= n + 1; i++) {
            System.out.print("----");
        }
        System.out.println();
            for (int i = 1; i <= m; i++) {
                System.out.print(i + ">**");
                for (int j = 1; j <= n; j++){
                    System.out.printf("-%d0%d", i, j);
                }
                System.out.println();
            }
    }
}
