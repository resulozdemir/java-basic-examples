package hazirlik.finalHazirlik;

import hazirlik.finalHazirlik.Car;

import java.util.Scanner;

public class Engine extends Car {
    private int horsePower;
    private boolean highFlowAirFilter;
    private boolean highFlowExhaust;
    private boolean customSoftware;

    public Engine(String brand, String model, int horsePower) {
        super(brand, model, horsePower);
    }


    public void start()
    {
        System.out.println("Engine started with " + this.horsePower);
    }

    protected void modify(boolean highFlowAirFilter,boolean highFlowExhaust,boolean customSoftware){
        this.highFlowAirFilter = highFlowAirFilter;
        this.highFlowExhaust = highFlowExhaust;
        this.customSoftware = customSoftware;

        this.horsePower += 140;

    }

    protected void modify(boolean customSoftware){
        this.customSoftware = customSoftware;

        this.horsePower += 70;

    }

    protected void modify(boolean highFlowAirFilter,boolean customSoftware){
        this.highFlowAirFilter = highFlowAirFilter;
        this.customSoftware = customSoftware;

        this.horsePower += 120;

    }


    protected void addHorsePower(int wantToAddHorsePower){
        Scanner inp = new Scanner(System.in);
        String answer;
        if(wantToAddHorsePower <= 80){
            System.out.println("You should do your car custom software");
            System.out.println("Do you want add ?");
            answer = inp.nextLine();
            if(answer.equals("Y") ||  answer.equals("y")){
                modify(true);
            }

            else {
                System.out.println("Okay");
            }
        }
        else if(wantToAddHorsePower <= 130){
            System.out.println("You should do your car custom software and high flow air filter");
            System.out.println("Do you want add ?");
            answer = inp.nextLine();
            if(answer.equals("Y") ||  answer.equals("y")){
                modify(true,true);
            }
            else {
                System.out.println("Okay");
            }
        }
        else if(wantToAddHorsePower <= 150){
            System.out.println("You should do your car custom software and high flow air filter");
            System.out.println("Do  you want add ?");
            answer = inp.nextLine();
            if(answer.equals("Y") ||  answer.equals("y")){
                modify(true,true,true);
            }
            else {
                System.out.println("Okay");
            }
        }
    }


    public void info() {
        System.out.println("Your engine condition is good");
    }

}
