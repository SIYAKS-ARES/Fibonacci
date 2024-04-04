package OOPGiris;

public class Araba {

    private String renk;
    private String model;
    private String motor;
    private int kapilar;
    private int tekerlekler;

    public void setModel(String model) {
        /*Eğer String model kısmında model yerine başka bir String kullanılsaydı "this."
        kulluanılmasına gerek kalmazdı*/
        this.model = model;
    }

    public String getModel( ){
         return this.model;
         /* Ayrıca sağ tık ile yazdığınız set ve get metodları dosya adına sağ tıklayaarak->refactor->encapsulate fields
         ile diğerlerine de eklenebilir.*//* Ayrıca sağ tık ile yazdığınız set ve get metodları dosya adına sağ tıklayaarak->refactor->encapsulate fields
         ile diğerlerine de eklenebilir.*/
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getKapilar() {
        return kapilar;
    }

    public void setKapilar(int kapilar) {
       if (kapilar < 0){
           System.out.println("Kapı sayısı sıfırdan küçük olamaz!");
       }else {
           this.kapilar = kapilar;
       }
    }
    public void setTekerlekler(int tekerlekler) {
        if (tekerlekler < 0){
           System.out.println("Tekerlek sayısı sıfırdan küçük olamaz!");
       }else {
           this.tekerlekler = tekerlekler;
       }    }
    public int getTekerlekler() {
        return tekerlekler;
    }


}
