package Java102.Ornek1;

public abstract class Akademisyen extends Calisan {

    private String bolum;
    private String unvan;
    public Akademisyen(String adSoyad,String telefon,String eposta,String bolum,String unvan){
        super(adSoyad,telefon,eposta);
        this.bolum=bolum;
        this.unvan=unvan;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public abstract void derseGir(String dersSaati);

    @Override      //override metot bu sekilde belirtilmeli ki daha sonradan rahatca alabilabilsin
    public void giris(){
        System.out.println(this.getAdSoyad() + " akademisyen A kapisindan giris yapti !");
    }
}
