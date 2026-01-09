package creational.abstractfactory.elocartao.produto.familiaRemuneracao;

public class RemuneracaoAlimentacao implements Remuneracao{
    @Override
    public void creditar(double valor) {
        System.out.println("Benefício de R$" + valor + " creditado no cartão Alimentação.");
    }

}
