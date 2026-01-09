package creational.factorymethods.transporte;

import creational.factorymethods.transporte.fabrica.abstrato.Logistica;
import creational.factorymethods.transporte.fabrica.concreto.LogisticaMaritima;
import creational.factorymethods.transporte.fabrica.concreto.LogisticaRodoviaria;

// Superclasse
public class TransporteMain {
    static void main() {
        Logistica logistica1 = new LogisticaRodoviaria();
        logistica1.planejarEntrega(); // Entrega feita por caminhão.

        Logistica logistica2 = new LogisticaMaritima();
        logistica2.planejarEntrega(); // Entrega feita por navio.

    }
}
