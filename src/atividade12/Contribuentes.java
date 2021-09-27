package atividade12;

public abstract class Contribuentes {

    private String nome;
    private Double renda;

    public Contribuentes () {}

    public Contribuentes (String nome,Double renda) {

        this.nome = nome;
        this.renda = renda;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }

    public abstract String imposto ();

}
