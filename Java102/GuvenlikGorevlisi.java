package Java102;

public class GuvenlikGorevlisi extends Memur{
    private String bolge;

    public GuvenlikGorevlisi(String adSoyad, String telefon, String eposta, String departman, String mesai, String bolge) {
        super(adSoyad, telefon, eposta, departman, mesai);
        this.bolge = bolge;
    }
    public void nobet(){
        System.out.println(this.getAdSoyad() + " nobete basladi !");
    }
}
