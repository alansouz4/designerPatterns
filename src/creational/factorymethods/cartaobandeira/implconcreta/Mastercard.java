package creational.factorymethods.cartaobandeira.implconcreta;

import creational.factorymethods.cartaobandeira.produto.CartaoCreditoInterface;

public class Mastercard implements CartaoCreditoInterface {

    @Override
    public void validar() {
        System.out.println("Validando cartão MasterCard...");
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " processado com MasterCard.");
    }
}
