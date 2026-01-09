package structural.facade.eloremuneracao;

import structural.facade.eloremuneracao.facade.SistemaRemuneracaoFacade;

public class EloRemuneracaoFacadeMain {
    static void main() {
        SistemaRemuneracaoFacade facade = new SistemaRemuneracaoFacade();
        facade.remunerarCliente("Alimentação", 950.00);
        facade.remunerarCliente("Refeição", 1850.00);
    }
}
