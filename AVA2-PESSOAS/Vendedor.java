public class Vendedor extends Empregado {
    private double metaVendas;
    private double comissao;
    private String regiao;

    public Vendedor(String nome, String documento, String endereco, String telefone, String email,
                    String cargo, String dataAdmissao, double salario,
                    double metaVendas, double comissao, String regiao) {
        super(nome, documento, endereco, telefone, email, cargo, dataAdmissao, salario);
        this.metaVendas = metaVendas;
        this.comissao = comissao;
        this.regiao = regiao;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Meta de Vendas: R$ " + metaVendas);
        System.out.println("Comissão: " + comissao + "%");
        System.out.println("Região: " + regiao);
    }
}