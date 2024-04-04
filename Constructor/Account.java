package Constructor;

public class Account {
    private String hesapNo;
    private String isim;
    private String email;
    private String sifre;
    private String telefonNo;
    private double bakiye;

    public Account(){

        /*this.hesapNo = "Bilgi yok";
        this.isim = "Bilgi yok";
        this.email = "Bilgi yok";
        this.sifre = "Bilgi yok";
        this.telefonNo = "Bilgi yok";
        this.bakiye = 0.0;*/

        //Bu şekilde default değer atanır. Kısa yolu bu şekildedir.

        this("Bilgi yok","Bilgi yok","Bilgi yok","Bilgi yok","Bilgi yok",0.0);

        //System.out.println("Kendi yazdığımız Constructor...");


    }
    public Account(String isim, String email, String telefonNo){
        /*this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;
        this.hesapNo = "Bilgi yok";
        this.sifre = "Bilgi yok";
        this.bakiye = 0.0;*/
        //Tekrar kısa yolu kullanırsak...

        this("Bilgi yok",isim,email,"Bilgi yok",telefonNo,0.0);
        //Bu yöntem kullanılırken aşağıdaki fonksiyonun sırası dikkate alınmalıdır.


    }
    public Account(String hesapNo, String isim, String email, String sifre, String telefonNo, double bakiye){
        this.hesapNo = hesapNo;
        this.isim = isim;
        this.email = email;
        this.sifre = sifre;
        this.telefonNo = telefonNo;
        this.bakiye = bakiye;
    }

    public void paraYatir(double miktar){
        bakiye+= miktar;
        System.out.print("Yeni bakiyeniz: " + bakiye);
    }
    public void paraCek(double cekilen_miktar){
        if(cekilen_miktar > 1500){
            System.out.println("Bir günde binbeşyüz TL'den fazla para çekemezsinz!");
        }else if (cekilen_miktar > bakiye){
            System.out.println("Yetersiz bakiye! Bakiyeniz: " + bakiye);
        }else {
            bakiye += cekilen_miktar;
            System.out.print("Yeni bakiyeniz: " + bakiye);
        }
    }
    public void bilgileriGoster(){
        System.out.println("Hesap no: " + this.hesapNo);
        System.out.println("İsim : " + this.isim);
        System.out.println("E-mail: " + this.email);
        System.out.println("Şifre: " + this.sifre);
        System.out.println("Telefon no: " + this.telefonNo);
        System.out.println("Bakiye: " + this.bakiye);
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
}
