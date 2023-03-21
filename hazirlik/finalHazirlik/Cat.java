package hazirlik.finalHazirlik;

import hazirlik.finalHazirlik.Animal;

public class Cat extends Animal {
    @Override
    public void makeSound(){
        System.out.println("meow make sound");
    }

    //@Override
    public void afeed(){
        System.out.println("you feed the cat");
    }
}
