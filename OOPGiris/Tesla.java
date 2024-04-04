package OOPGiris;

public class Tesla {
    public static void main(String[] args){

        Araba tesla = new Araba();

          /*tesla.renk = "Beyaz";
            tesla.kapilar = 4;
            tesla.motor = "611 HP";
            tesla.tekerlekler = 4;
            tesla.model = "Tesla Model S";
            -> Bu yazılan kodlar sadece public olanlarda geçerli, private olanları almak için aşağıdaki yöntem
            kullanılır.
            */
            tesla.setModel("Tesla Model S");
            System.out.println("Arabanın modeli: " + tesla.getModel());
            tesla.setKapilar(4);
            System.out.println("Arabanın kapı sayısı: " + tesla.getKapilar());
            tesla.setMotor("611 HP");
            System.out.println("Arabanın motor hacmi: " + tesla.getMotor());
            tesla.setRenk("Beyaz");
            System.out.println("Arabanın rengi: " + tesla.getRenk());
            tesla.setTekerlekler(4);
            System.out.println("Arabanın tekerlek sayısı: " + tesla.getTekerlekler());
        }

    }