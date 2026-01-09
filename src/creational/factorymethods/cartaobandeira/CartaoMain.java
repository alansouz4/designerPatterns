package creational.factorymethods.cartaobandeira;

import creational.factorymethods.cartaobandeira.fabrica.abstrato.CartaoFactory;
import creational.factorymethods.cartaobandeira.fabrica.concreto.AmexFactory;
import creational.factorymethods.cartaobandeira.fabrica.concreto.MastercardFactory;
import creational.factorymethods.cartaobandeira.fabrica.concreto.VisaFactory;

public class CartaoMain {
    static void main() {
        CartaoFactory factoryVisa = new VisaFactory();
        factoryVisa.executarTransacao(250.00);

        CartaoFactory factoryMastercard = new MastercardFactory();
        factoryMastercard.executarTransacao(1500.00);

        CartaoFactory factoryAmex = new AmexFactory();
        factoryAmex.executarTransacao(550.00);
    }
}
