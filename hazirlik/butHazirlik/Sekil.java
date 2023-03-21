package hazirlik.butHazirlik;

public abstract class Sekil {
    private String sekilIsmi;
    private String sekilRengi;

    abstract double alan();
    abstract double cevre();

    public Sekil(String sekilIsmi, String sekilRengi) {
        this.sekilIsmi = sekilIsmi;
        this.sekilRengi = sekilRengi;
    }

    public String getSekilIsmi() {
        return sekilIsmi;
    }

    public void setSekilIsmi(String sekilIsmi) {
        this.sekilIsmi = sekilIsmi;
    }

    public String getSekilRengi() {
        return sekilRengi;
    }

    public void setSekilRengi(String sekilRengi) {
        this.sekilRengi = sekilRengi;
    }
}
