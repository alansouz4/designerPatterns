package behavioral.strategy.remuneracaoelo;

import behavioral.strategy.remuneracaoelo.contexto.SistemaRemuneracao;
import behavioral.strategy.remuneracaoelo.estratégiaconcreta.RemuneracaoAlimentacao;
import behavioral.strategy.remuneracaoelo.estratégiaconcreta.RemuneracaoRefeicao;

public class StrategyMain {
    static void main() {
        SistemaRemuneracao sistema = new SistemaRemuneracao();

        // Estratégia de refeição
        sistema.setEstrategia(new RemuneracaoRefeicao());
        sistema.executar(600.00);

        // Estratégia de alimentação
        sistema.setEstrategia(new RemuneracaoAlimentacao());
        sistema.executar(800.00);
    }
}
