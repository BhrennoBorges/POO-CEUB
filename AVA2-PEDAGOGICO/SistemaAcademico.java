// Arquivo 2: SistemaAcademico.java
import java.util.Scanner;

public class SistemaAcademico {
    private Educador usuarioAtivo;

    public void iniciarSessao(String nome, String registro) {
        usuarioAtivo = new Educador(nome, registro);
        System.out.println("\nAcesso realizado com sucesso!");
        System.out.println(usuarioAtivo);
        encerrarSessao();
    }

    private void encerrarSessao() {
        usuarioAtivo = null;
        System.out.println("\nSessão encerrada com segurança");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SistemaAcademico sistema = new SistemaAcademico();

        System.out.println("Bem-vindo ao Portal Educacional");
        System.out.print("Digite seu nome completo: ");
        String nome = input.nextLine();

        System.out.print("Informe seu registro institucional: ");
        String registro = input.nextLine();

        sistema.iniciarSessao(nome, registro);
        input.close();
    }
}