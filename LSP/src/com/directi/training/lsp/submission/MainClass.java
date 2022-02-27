package com.directi.training.lsp.submission;

public class MainClass {
    public static void main(String[] args) {
        // electronic duck
        ElectronicDuck electronicDuck = new ElectronicDuck();

        try {
            // electronic duck on
            electronicDuck.turnOn();
            electronicDuck.quack();
            electronicDuck.swim();

            // electronic duck off
            electronicDuck.turnOff();
            electronicDuck.quack();
            electronicDuck.swim();

        } catch (DuckException exception){
            exception.printStackTrace();
        }

        // animal duck
        AnimalDuck animalDuck = new AnimalDuck();
        animalDuck.quack();
        animalDuck.swim();
    }
}
