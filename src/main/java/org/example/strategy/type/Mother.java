package org.example.strategy.type;

import lombok.Data;
import lombok.Setter;
import org.example.strategy.behavior.CookBehavior;

@Setter
public abstract class Mother {
    CookBehavior cookBehavior;
    public void cook(){
        cookBehavior.cook();
    }
}
