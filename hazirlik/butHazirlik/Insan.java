package hazirlik.butHazirlik;

public class Insan {
    private String ad;
    private String soyad;
    protected static String meslek;

    public void setAd(String ad){
        this.ad = ad;
    }

    public String getAd(){
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getMeslek() {
        return meslek;
    }

    public void ses(){
        System.out.println("Insan");
    }

}
