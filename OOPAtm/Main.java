package OOPAtm;

public class Main {

    public static void main(String[] args) {

        OOPAtm atm = new OOPAtm();

        Hesap hesap = new Hesap("SIYAKSARES","12345",5000.0);
        atm.calistirma(hesap);

        Hesap hesap2 = new Hesap("MEDDIAS","4721",7000.0);
        atm.calistirma(hesap2);

    }
}
