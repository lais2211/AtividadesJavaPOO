package atividade10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutosUsados extends Produtos{

    private Date data;
    SimpleDateFormat dataFormato = new SimpleDateFormat ("dd/MM/yyy");

    public ProdutosUsados() {}

    public ProdutosUsados(String nome, Double preço, Date data) {
        super(nome, preço);
        this.data = data;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String etiqueta () {

        return "O nome do produto é: " + getNome() + ", seu valor é de: R$" + getPreço()+ ", sua data de fabricação:"+ getData();}

    }
