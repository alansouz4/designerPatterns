package creational.factorymethods.transporte.fabrica.concreto;

import creational.factorymethods.transporte.produto.TransporteInterface;
import creational.factorymethods.transporte.fabrica.abstrato.Logistica;
import creational.factorymethods.transporte.implconcreta.Caminhao;

// subclasse
public class LogisticaRodoviaria extends Logistica {
    @Override
    public TransporteInterface criarTransporte() {
        return new Caminhao();
    }
}
