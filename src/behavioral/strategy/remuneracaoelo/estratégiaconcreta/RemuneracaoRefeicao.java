package behavioral.strategy.remuneracaoelo.estratégiaconcreta;

import behavioral.strategy.remuneracaoelo.EstrategiaRemuneracaoStrategy;

public class RemuneracaoRefeicao implements EstrategiaRemuneracaoStrategy {
    public void processar(double valor) {
        System.out.println("Benefício de R$" + valor + " creditado no cartão Refeição (restaurantes/lanchonetes).");
    }
}

