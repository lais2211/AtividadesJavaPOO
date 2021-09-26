package atividade10;

public class ProdutosImportados extends Produtos {

    private Double taxa;

    public ProdutosImportados () {
        super ();
    }

    public ProdutosImportados(String nome, Double preço, Double taxa) {
        super(nome, preço);
        this.taxa = taxa;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    @Override
    public String etiqueta () {

        return "O nome do produto é: " + getNome() + ", seu valor é de: R$" + getPreço()+ ", o valor da taxa é de: R$"+ getTaxa();

    }

}
