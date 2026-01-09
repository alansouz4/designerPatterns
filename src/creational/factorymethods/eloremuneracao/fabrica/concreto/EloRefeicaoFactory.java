package creational.factorymethods.eloremuneracao.fabrica.concreto;

import creational.factorymethods.eloremuneracao.fabrica.abstrato.EloFactory;
import creational.factorymethods.eloremuneracao.implConcretas.EloRefeicao;
import creational.factorymethods.eloremuneracao.produto.CartaoElo;

public class EloRefeicaoFactory extends EloFactory {

    @Override
    public CartaoElo criarCartao() {
        return new EloRefeicao();
    }
}
