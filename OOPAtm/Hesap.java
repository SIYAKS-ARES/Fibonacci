package OOPAtm;

public class Hesap {
    private String kullanici_adi;
    private String parola;
    private double bakiye;

    public Hesap(String kullanici_adi, String parola, double bakiye) {
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
    public void paraYatir(int miktar){
        bakiye+= miktar;
        System.out.println("Yeni bakiyeniz: " + bakiye);
    }
    public void paraCek(int cekilen_miktar){
        if(cekilen_miktar > 1500){
            System.out.println("Bir günde binbeşyüz TL'den fazla para çekemezsinz!");
        }else if (cekilen_miktar > bakiye){
            System.out.println("Yetersiz bakiye! Bakiyeniz: " + bakiye);
        }else {
            bakiye -= cekilen_miktar;
            System.out.println("Yeni bakiyeniz: " + bakiye);
        }
    }
}
