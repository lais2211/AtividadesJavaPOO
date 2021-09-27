package atividade11;

public class Retangulo extends Forma{

    private Double largura;
    private Double altura;

    public Retangulo (){

        super ();

    }

    public Retangulo(Cores cor, Double largura,Double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public String area() {
        Double valor= largura*altura;
        return "A area do retangulo é de: " + valor + ", e sua cor é de: "+ getCor();
    }


}
