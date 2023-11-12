package org.example.strategy.behavior;

public class BakeCookBehavior implements CookBehavior{
    @Override
    public void cook() {
        System.out.println("Bake something in a oven");
    }
}
