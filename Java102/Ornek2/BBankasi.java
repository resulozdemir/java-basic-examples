package Java102.Ornek2;

public class BBankasi implements IBanka{
    private String bankaAdi;
    private String teminalId;
    private  String password;

    public BBankasi(String bankaAdi, String teminalId, String password) {
        this.bankaAdi = bankaAdi;
        this.teminalId = teminalId;
        this.password = password;
    }
    @Override
    public boolean connect(String ipAddress){
        System.out.println("Kullanıcı ip : " +ipAddress);
        System.out.println("Makina ip : " +  this.hostIpAddress);
        System.out.println(this.bankaAdi + " Baglanıldı !");
        return true;
    }
    @Override
    public boolean peyment(double price,String cardNumber,String expiryDate,String cvc){
        //Banla odeme islemleri
        System.out.println("Bankadan cevap bekleniyor");
        System.out.println("Islem asarili oldu !");
        return true;
    }

    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getTeminalId() {
        return teminalId;
    }

    public void setTeminalId(String teminalId) {
        this.teminalId = teminalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
