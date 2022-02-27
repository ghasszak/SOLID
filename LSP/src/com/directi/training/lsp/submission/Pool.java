package com.directi.training.lsp.submission;

public class Pool {
    public void run()
    {
        Duck donaldDuck = new AnimalDuck();
        Duck electricDuck = new ElectronicDuck();
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(Duck... ducks)
    {
        for (Duck duck : ducks) {
            try {
                duck.quack();
            }catch (DuckException exception){
                exception.printStackTrace();
            }
        }
    }

    private void swim(Duck... ducks)
    {
        for (Duck duck : ducks) {
            try {
                duck.swim();
            }catch (DuckException exception){
                exception.printStackTrace();
            }
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
