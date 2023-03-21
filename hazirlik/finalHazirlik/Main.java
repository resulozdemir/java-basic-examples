package hazirlik.finalHazirlik;


public class Main {
    public static void main(String[] args) {

        Car[] c1 = new Car[3];

        for(int i=0;i<3;i++){
            c1[i] = new Car("bmw","sa",48);
        }

        Car c2 = new Engine("bmw","340",374);       //sadece carin özellikleri kullanılabiliyor


    }
}


