public class Cliente {
    private String nome;
    private String rua;
    private String cidade;
    private String estado;
    private String codigoPostal;
    private String telefone;
    private String cpf; // Adicionado CPF

    public Cliente(String nome, String rua, String cidade, String estado, String codigoPostal, String telefone, String cpf) {
        this.nome = nome;
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
        this.telefone = telefone;
        this.cpf = cpf; // Inicializando CPF
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return rua + ", " + cidade + ", " + estado + ", " + codigoPostal;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf; // Método para obter CPF
    }
}