package creational.factorymethods.cartaobandeira.fabrica.concreto;

import creational.factorymethods.cartaobandeira.produto.CartaoCreditoInterface;
import creational.factorymethods.cartaobandeira.fabrica.abstrato.CartaoFactory;
import creational.factorymethods.cartaobandeira.implconcreta.Amex;

public class AmexFactory extends CartaoFactory {
    @Override
    public CartaoCreditoInterface criarCartao() {
        return new Amex();
    }
}
