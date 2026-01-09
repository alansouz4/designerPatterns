package creational.abstractfactory.elocartao.fabrica.concreto;

import creational.abstractfactory.elocartao.fabrica.abstrato.EloFactory;
import creational.abstractfactory.elocartao.produto.familiaCartao.CartaoElo;
import creational.abstractfactory.elocartao.produto.familiaCartao.EloAlimentacao;
import creational.abstractfactory.elocartao.produto.familiaRemuneracao.Remuneracao;
import creational.abstractfactory.elocartao.produto.familiaRemuneracao.RemuneracaoAlimentacao;

public class EloAlimentacaoFactory implements EloFactory {
    @Override
    public CartaoElo criarCartao() {
        return new EloAlimentacao();
    }

    @Override
    public Remuneracao criarRemuneracao() {
        return new RemuneracaoAlimentacao();
    }
}
