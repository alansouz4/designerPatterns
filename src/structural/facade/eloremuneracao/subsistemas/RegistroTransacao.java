package structural.facade.eloremuneracao.subsistemas;

public class RegistroTransacao {
    public void registrar(String tipoCartao, double valor) {
        System.out.println("Transação registrada: " + tipoCartao + " - R$" + valor);
    }
}

