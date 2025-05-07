import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Cadastro de Cliente ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Documento (CPF/CNPJ): ");
        String documento = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Limite de Crédito: ");
        double limiteCredito = scanner.nextDouble();
        System.out.print("Saldo Devedor: ");
        double saldoDevedor = scanner.nextDouble();
        scanner.nextLine(); // consumir quebra de linha

        Cliente cliente = new Cliente(nome, documento, endereco, telefone, email, limiteCredito, saldoDevedor);

        System.out.println("\n--- Cadastro de Fornecedor ---");
        System.out.print("Nome: ");
        nome = scanner.nextLine();
        System.out.print("Documento (CNPJ): ");
        documento = scanner.nextLine();
        System.out.print("Endereço: ");
        endereco = scanner.nextLine();
        System.out.print("Telefone: ");
        telefone = scanner.nextLine();
        System.out.print("Email: ");
        email = scanner.nextLine();
        System.out.print("Avaliação: ");
        String avaliacao = scanner.nextLine();
        System.out.print("Prazo de Entrega: ");
        String prazoEntrega = scanner.nextLine();
        System.out.print("Condições de Pagamento: ");
        String condicoesPagto = scanner.nextLine();

        Fornecedor fornecedor = new Fornecedor(nome, documento, endereco, telefone, email, avaliacao, prazoEntrega, condicoesPagto);

        System.out.println("\n--- Cadastro de Vendedor ---");
        System.out.print("Nome: ");
        nome = scanner.nextLine();
        System.out.print("Documento (CPF): ");
        documento = scanner.nextLine();
        System.out.print("Endereço: ");
        endereco = scanner.nextLine();
        System.out.print("Telefone: ");
        telefone = scanner.nextLine();
        System.out.print("Email: ");
        email = scanner.nextLine();
        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();
        System.out.print("Data de Admissão: ");
        String dataAdmissao = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        System.out.print("Meta de Vendas: ");
        double metaVendas = scanner.nextDouble();
        System.out.print("Comissão (%): ");
        double comissao = scanner.nextDouble();
        scanner.nextLine(); // limpar buffer
        System.out.print("Região: ");
        String regiao = scanner.nextLine();

        Vendedor vendedor = new Vendedor(nome, documento, endereco, telefone, email,
                cargo, dataAdmissao, salario, metaVendas, comissao, regiao);

        System.out.println("\n--- Cadastro de Usuário de Acesso ---");
        System.out.print("Nome: ");
        nome = scanner.nextLine();
        System.out.print("Documento (CPF): ");
        documento = scanner.nextLine();
        System.out.print("Endereço: ");
        endereco = scanner.nextLine();
        System.out.print("Telefone: ");
        telefone = scanner.nextLine();
        System.out.print("Email: ");
        email = scanner.nextLine();
        System.out.print("Cargo: ");
        cargo = scanner.nextLine();
        System.out.print("Data de Admissão: ");
        dataAdmissao = scanner.nextLine();
        System.out.print("Salário: ");
        salario = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Nome de Usuário: ");
        String nomeUsuario = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        System.out.print("Permissões: ");
        String permissoes = scanner.nextLine();

        UsuarioAcesso usuario = new UsuarioAcesso(nome, documento, endereco, telefone, email,
                cargo, dataAdmissao, salario, nomeUsuario, senha, permissoes);

        // Exibir todos os dados
        System.out.println("\n--- Dados Cadastrados ---");
        System.out.println("\n[Cliente]");
        cliente.exibirDados();
        System.out.println("\n[Fornecedor]");
        fornecedor.exibirDados();
        System.out.println("\n[Vendedor]");
        vendedor.exibirDados();
        System.out.println("\n[Usuário de Acesso]");
        usuario.exibirDados();

        scanner.close();
    }
}