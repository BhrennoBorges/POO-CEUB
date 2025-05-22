// Arquivo 1: Educador.java
public class Educador {
    private final String identificacao;
    private final String credencial;

    public Educador(String identificacao, String credencial) {
        this.identificacao = identificacao;
        this.credencial = credencial;
    }

    public String obterCredenciais() {
        return "Nome: " + identificacao + "\nRegistro Acadêmico: " + credencial;
    }
}