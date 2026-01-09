package creational.factorymethods.eloremuneracao.implConcretas;

import creational.factorymethods.eloremuneracao.produto.CartaoElo;

public class EloRefeicao implements CartaoElo {

    @Override
    public void validarUso() {
        System.out.println("Cartão Elo Refeição validado para compras gerais.");
    }

    @Override
    public void creditar(double valor) {
        System.out.println("Crédito de R$" + valor + " disponível para uso geral.");
    }
}
