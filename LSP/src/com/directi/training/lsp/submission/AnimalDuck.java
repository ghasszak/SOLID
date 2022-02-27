package com.directi.training.lsp.submission;

public class AnimalDuck implements Duck{
    @Override
    public void quack() throws DuckException {
        System.out.println("Quack...");
    }

    @Override
    public void swim() throws DuckException {
        System.out.println("Swim...");
    }
}
