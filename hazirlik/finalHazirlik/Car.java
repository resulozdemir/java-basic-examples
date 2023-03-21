package hazirlik.finalHazirlik;

public class Car {
    private String brand;
    private String model;
    private Engine engine;

    public Car(String brand,String model,int horsePower){
        this.brand = brand;
        this.model = model;
    }


    public void start(){
        engine.start();
    }

    public void modify(int wantToAddHorsePower){
        engine.addHorsePower(wantToAddHorsePower);
    }

    public void info(){
        System.out.println("Your car condition is good");
    }
}
