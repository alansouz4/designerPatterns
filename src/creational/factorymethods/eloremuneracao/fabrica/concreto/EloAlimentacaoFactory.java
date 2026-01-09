package creational.factorymethods.eloremuneracao.fabrica.concreto;

import creational.factorymethods.eloremuneracao.fabrica.abstrato.EloFactory;
import creational.factorymethods.eloremuneracao.implConcretas.EloAlimentacao;
import creational.factorymethods.eloremuneracao.produto.CartaoElo;

public class EloAlimentacaoFactory extends EloFactory {
    @Override
    public CartaoElo criarCartao() {
        return new EloAlimentacao();
    }
}
