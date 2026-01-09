package creational.factorymethods.transporte.implconcreta;

import creational.factorymethods.transporte.produto.TransporteInterface;

import static java.lang.IO.println;

public class Navio implements TransporteInterface {
    @Override
    public void entregar() {
        println("Entrega feita por navio.");
    }
}
