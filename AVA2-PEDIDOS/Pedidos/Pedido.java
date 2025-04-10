import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private Vendedor vendedor;
    private List<Produto> produtos;
    private Date date;

    public Pedido(Cliente cliente, Vendedor vendedor, Date date) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.produtos = new ArrayList<>();
        this.date = date;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double getTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco() * produto.getQuantidade();
        }
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }
}
