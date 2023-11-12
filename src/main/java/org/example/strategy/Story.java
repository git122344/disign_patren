package org.example.strategy;

import org.example.strategy.behavior.BakeCookBehavior;
import org.example.strategy.type.Mother;
import org.example.strategy.type.MyMother;

public class Story {
    public static void main(String[] argv){
        Mother mother = new MyMother();
        System.out.println("Mymom use saucepan");
        mother.cook();
        System.out.println("Mymom use oven");
        mother.setCookBehavior(new BakeCookBehavior());
        mother.cook();

    }
}
