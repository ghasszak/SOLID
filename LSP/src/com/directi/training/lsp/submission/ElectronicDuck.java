package com.directi.training.lsp.submission;

public class ElectronicDuck implements Duck{
    private boolean _on = false;

    @Override
    public void quack() throws DuckException
    {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            throw new DuckException("Can't quack when off");
        }
    }

    @Override
    public void swim() throws DuckException
    {
        if (_on) {
            System.out.println("Electronic duck swim");
        } else {
            throw new DuckException("Can't swim when off");
        }
    }

    public void turnOn()
    {
        _on = true;
    }

    public void turnOff()
    {
        _on = false;
    }
}
