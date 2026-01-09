package creational.factorymethods.eloremuneracao;

import creational.factorymethods.eloremuneracao.fabrica.abstrato.EloFactory;
import creational.factorymethods.eloremuneracao.fabrica.concreto.EloAlimentacaoFactory;
import creational.factorymethods.eloremuneracao.fabrica.concreto.EloRefeicaoFactory;

public class EloMain {
    static void main() {
        EloFactory factoryCredito = new EloCreditoFactory();
        factoryCredito.processarRemuneracao(854.00);

        EloFactory factoryAlimentacao = new EloAlimentacaoFactory();
        factoryAlimentacao.processarRemuneracao(950.00);

        EloFactory factoryRefeicao = new EloRefeicaoFactory();
        factoryRefeicao.processarRemuneracao(1270.00);
    }
}
