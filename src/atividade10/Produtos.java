package atividade10;

public class Produtos {

    private String nome;
    private Double preço;

    public Produtos () {}

    public Produtos (String nome,Double preço) {

        this.nome = nome;
        this.preço = preço;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }

    public String etiqueta () {

        return "O nome do produto é: " + getNome() + ", seu valor é de: R$" + getPreço();

    }



}
