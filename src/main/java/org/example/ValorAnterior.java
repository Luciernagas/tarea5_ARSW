package org.example;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class ValorAnterior {
    private double valoranterior = 0;
    public ValorAnterior(){
    }

    public double getValorAnterior(){
        return valoranterior;
    }

    public void setValorAnterior(double newvalue){
        valoranterior = newvalue;
    }
}
