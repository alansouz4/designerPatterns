package creational.abstractfactory.elocartao;


import creational.abstractfactory.elocartao.fabrica.abstrato.EloFactory;
import creational.abstractfactory.elocartao.fabrica.concreto.EloAlimentacaoFactory;
import creational.abstractfactory.elocartao.fabrica.concreto.EloRefeicaoFactory;
import creational.abstractfactory.elocartao.produto.familiaCartao.CartaoElo;
import creational.abstractfactory.elocartao.produto.familiaRemuneracao.Remuneracao;

public class CartaoEloMain {
    static void main() {
        EloFactory refeicaoFactory = new EloRefeicaoFactory();
        CartaoElo eloRefeicao = refeicaoFactory.criarCartao();
        Remuneracao remuneracaoRefeicao = refeicaoFactory.criarRemuneracao();

        eloRefeicao.validarUso();
        remuneracaoRefeicao.creditar(1589.00);


        EloFactory alimentacao = new EloAlimentacaoFactory();
        CartaoElo alimentacaoFactory = alimentacao.criarCartao();
        Remuneracao remuneracaoAlimentacao = alimentacao.criarRemuneracao();

        alimentacaoFactory.validarUso();
        remuneracaoAlimentacao.creditar(950.00);
    }
}
