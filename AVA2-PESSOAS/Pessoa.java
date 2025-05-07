public class Pessoa {
    private String nome;
    private String documento;
    private String endereco;
    private String telefone;
    private String email;

    public Pessoa(String nome, String documento, String endereco, String telefone, String email) {
        this.nome = nome;
        this.documento = documento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Documento: " + documento);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
    }
}
