import java.util.List;

public class SomaPedido {
    private List<Produto> produtos;

    public SomaPedido(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco() * produto.getQuantidade();
        }
        return total;
    }
}