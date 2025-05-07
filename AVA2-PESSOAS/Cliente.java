public class Cliente extends Pessoa {
    private double limiteCredito;
    private double saldoDevedor;

    public Cliente(String nome, String documento, String endereco, String telefone, String email,
                   double limiteCredito, double saldoDevedor) {
        super(nome, documento, endereco, telefone, email);
        this.limiteCredito = limiteCredito;
        this.saldoDevedor = saldoDevedor;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Limite de Crédito: R$ " + limiteCredito);
        System.out.println("Saldo Devedor: R$ " + saldoDevedor);
    }
}