package creational.abstractfactory.elocartao.fabrica.concreto;

import creational.abstractfactory.elocartao.fabrica.abstrato.EloFactory;
import creational.abstractfactory.elocartao.produto.familiaCartao.CartaoElo;
import creational.abstractfactory.elocartao.produto.familiaCartao.EloRefeicao;
import creational.abstractfactory.elocartao.produto.familiaRemuneracao.Remuneracao;
import creational.abstractfactory.elocartao.produto.familiaRemuneracao.RemuneracaoRefeicao;

public class EloRefeicaoFactory implements EloFactory {
    @Override
    public CartaoElo criarCartao() {
        return new EloRefeicao();
    }

    @Override
    public Remuneracao criarRemuneracao() {
        return new RemuneracaoRefeicao();
    }
}
