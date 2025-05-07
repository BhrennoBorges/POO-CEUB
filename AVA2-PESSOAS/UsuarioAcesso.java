public class UsuarioAcesso extends Empregado {
    private String nomeUsuario;
    private String senha;
    private String permissoes;

    public UsuarioAcesso(String nome, String documento, String endereco, String telefone, String email,
                         String cargo, String dataAdmissao, double salario,
                         String nomeUsuario, String senha, String permissoes) {
        super(nome, documento, endereco, telefone, email, cargo, dataAdmissao, salario);
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.permissoes = permissoes;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Usuário de Acesso: " + nomeUsuario);
        System.out.println("Permissões: " + permissoes);
    }
}