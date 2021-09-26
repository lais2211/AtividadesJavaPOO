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
    public Double area() {
        return 3.14*raio ;
    }
}
