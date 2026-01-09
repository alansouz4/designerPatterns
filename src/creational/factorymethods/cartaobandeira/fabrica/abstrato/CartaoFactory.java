package creational.factorymethods.cartaobandeira.fabrica.abstrato;

import creational.factorymethods.cartaobandeira.produto.CartaoCreditoInterface;

public abstract class CartaoFactory {
    public abstract CartaoCreditoInterface criarCartao();

    public void executarTransacao(double valor) {
        CartaoCreditoInterface cartao = criarCartao();
        cartao.validar();
        cartao.processarPagamento(valor);
    }

}
