package creational.factorymethods.eloremuneracao.fabrica.abstrato;

import creational.factorymethods.eloremuneracao.produto.CartaoElo;

public abstract class EloFactory {

    public abstract CartaoElo criarCartao();

    public void processarRemuneracao(double valor) {
        CartaoElo cartaoElo = criarCartao();
        cartaoElo.validarUso();
        cartaoElo.creditar(valor);
    }
}
