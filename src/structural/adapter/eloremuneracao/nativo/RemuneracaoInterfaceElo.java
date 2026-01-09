package structural.adapter.eloremuneracao.nativo;

import structural.adapter.eloremuneracao.RemuneracaoInterface;

public class RemuneracaoInterfaceElo implements RemuneracaoInterface {
    public void creditar(double valor) {
        System.out.println("Valor de R$" + valor + " creditado via Elo.");
    }
}

