package creational.factorymethods.transporte.fabrica.abstrato;

import creational.factorymethods.transporte.produto.TransporteInterface;

public abstract class Logistica {
    public abstract TransporteInterface criarTransporte();

    public void planejarEntrega() {
        TransporteInterface transporte = criarTransporte();
        transporte.entregar();
    }
}
