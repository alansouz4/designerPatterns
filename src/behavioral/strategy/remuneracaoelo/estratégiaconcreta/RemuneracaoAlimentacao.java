package behavioral.strategy.remuneracaoelo.estratégiaconcreta;

import behavioral.strategy.remuneracaoelo.EstrategiaRemuneracaoStrategy;

public class RemuneracaoAlimentacao implements EstrategiaRemuneracaoStrategy {
    public void processar(double valor) {
        System.out.println("Benefício de R$" + valor + " creditado no cartão Alimentação (supermercados/mercearias).");
    }
}

