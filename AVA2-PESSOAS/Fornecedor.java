public class Fornecedor extends Pessoa {
    private String avaliacao;
    private String prazoEntrega;
    private String condicoesPagto;

    public Fornecedor(String nome, String documento, String endereco, String telefone, String email,
                      String avaliacao, String prazoEntrega, String condicoesPagto) {
        super(nome, documento, endereco, telefone, email);
        this.avaliacao = avaliacao;
        this.prazoEntrega = prazoEntrega;
        this.condicoesPagto = condicoesPagto;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Avaliação: " + avaliacao);
        System.out.println("Prazo de Entrega: " + prazoEntrega);
        System.out.println("Condições de Pagamento: " + condicoesPagto);
    }
}