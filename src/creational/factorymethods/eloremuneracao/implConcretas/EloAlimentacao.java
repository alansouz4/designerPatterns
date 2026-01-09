package creational.factorymethods.eloremuneracao.implConcretas;

import creational.factorymethods.eloremuneracao.produto.CartaoElo;

public class EloAlimentacao implements CartaoElo {

    @Override
    public void validarUso() {
        System.out.println("Cartão Elo Alimentação validado para compras gerais.");
    }

    @Override
    public void creditar(double valor) {
        System.out.println("Crédito de R$" + valor + " disponível para uso geral.");
    }
}
