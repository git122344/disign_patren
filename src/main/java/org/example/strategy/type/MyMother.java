package org.example.strategy.type;

import org.example.strategy.behavior.StewCookBehavior;

public class MyMother extends Mother{
    public MyMother(){
        super();
        setCookBehavior(new StewCookBehavior());
    }
}
