import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SistemasDePedido {
    public static void main(String[] args) {
        // Criando um cliente
        Cliente cliente = new Cliente("João Silva", "Rua A, 123", "São Paulo", "SP", "01234-567", "1234-5678", "123.456.789-00");
        
        // Criando um vendedor
        Vendedor vendedor = new Vendedor("Maria Oliveira", "001", "Rua B, 456", "São Paulo", "SP", "98765-432");
        
        // Criando produtos
        Produto produto1 = new Produto("Produto 1", 10.0, 2); // 2 unidades
        Produto produto2 = new Produto("Produto 2", 20.0, 1); // 1 unidade
        
        // Criando um pedido
        Pedido pedido = new Pedido(cliente, vendedor, new Date());
        
        // Adicionando produtos ao pedido
        pedido.adicionarProduto(produto1);
        pedido.adicionarProduto(produto2);
        
        // Calculando o total do pedido
        double total = pedido.getTotal();
        
        // Exibindo informações
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Vendedor: " + vendedor.getNomeCompleto());
        System.out.println("Total do Pedido: R$ " + total);
    }
}