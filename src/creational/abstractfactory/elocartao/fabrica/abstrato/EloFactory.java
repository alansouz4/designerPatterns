package creational.abstractfactory.elocartao.fabrica.abstrato;

import creational.abstractfactory.elocartao.produto.familiaCartao.CartaoElo;
import creational.abstractfactory.elocartao.produto.familiaRemuneracao.Remuneracao;

public interface EloFactory {
    CartaoElo criarCartao();
    Remuneracao criarRemuneracao();
}
