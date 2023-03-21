package hazirlik.butHazirlik;
//CONSTRUCTOR METODUNDA ALINACAK VERI OLMADIGI ICINN CONSTRUCTORLAR OLMADANDA OLUR

public class Ogrenci extends Insan implements IYasam{
    private int ogrenciNumarasi;
    private int sinif;

    public Ogrenci() {
        Insan.meslek = "Ogrenci";
    }

    public int getOgrenciNumarasi() {
        return ogrenciNumarasi;
    }

    public void setOgrenciNumarasi(int ogrenciNumarasi) {
        this.ogrenciNumarasi = ogrenciNumarasi;
    }

    public int getSinif() {
        return sinif;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    public void suIc(){

    }

    public void yemekYe(){

    }

    public void uyu(){

    }
}
