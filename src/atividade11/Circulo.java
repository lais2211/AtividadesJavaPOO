package atividade11;

public class Circulo extends Forma {

    private Double raio;

    public Circulo (){
        super ();
    }

    public Circulo(Cores cor, Double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public String area() {
        Double valor =  3.14*raio ;
        return "A area do circulo é de: " + valor + ", e sua cor é de: "+ getCor();
    }
}
