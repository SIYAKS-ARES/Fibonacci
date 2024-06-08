package AlgoSinavlari.Final2022_2023;
public class Soru5ASCIIKarakterSeti {
    public static void main(String[] args) {
        char c1 = 'A', c2 = 'K';
        int d1 = (int) c2, d2 = (int) c1;
        System.out.printf("::%4c::->::%-4c::\n", c1, c2);
        System.out.println(c2 + "-->" + d2);
        d2--;
        --d2;
        System.out.println("(" + c1 + ">" + c2 + ")" + (char) d2);
        System.out.println((char) d1 + ":" + c1--);
        c1--;
        c1--;
        System.out.printf("%6c-->", --c1);
    }
}
