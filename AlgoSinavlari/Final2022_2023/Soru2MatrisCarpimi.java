package AlgoSinavlari.Final2022_2023;

public class Soru2MatrisCarpimi {
    public static void main(String[] args) {
        double[][] a = {{1,2,3,4,5},{50,30,20,40,10},{170,240,320,430,550}};
        double[][] b = {{10,20},{30,40},{50,60},{70,80},{90,100}};
        double[][] c = new double[a.length][b[0].length];
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < b[0].length; j++){
                c[i][j] = 0;
                for (int k = 0; k < a[0].length; k++){
                    c[i][j] += a[i][k] * b[k][j];
                    System.out.printf("%10.1f", c[i][j]);
                }
                System.out.println();
            }
        }
    }
}
