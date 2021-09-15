package produtos;

public class Produtos {
    public String nome;
    public double valor;
    public int quantidade;

    public double valorTotalEmEstoque() {
        return valor * quantidade;
    }


    public void adicionarProduto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void retirarProduto(int quantidade) {
        this.quantidade -= quantidade;
    }

    ;
}
