package org.example.strategy.behavior;

public class StewCookBehavior implements CookBehavior {
    @Override
    public void cook() {
        System.out.println("Stew something in a saucepan");
    }
}
