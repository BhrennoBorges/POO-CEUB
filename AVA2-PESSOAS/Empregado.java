public class Empregado extends Pessoa {
    private String cargo;
    private String dataAdmissao;
    private double salario;

    public Empregado(String nome, String documento, String endereco, String telefone, String email,
                     String cargo, String dataAdmissao, double salario) {
        super(nome, documento, endereco, telefone, email);
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cargo: " + cargo);
        System.out.println("Data de Admissão: " + dataAdmissao);
        System.out.println("Salário: R$ " + salario);
    }
}