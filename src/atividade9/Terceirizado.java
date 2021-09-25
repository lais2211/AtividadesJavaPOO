package atividade9;

public class Terceirizado extends Empregado {

    private Double extra;

    public Terceirizado() {
        super();
    }

    public Terceirizado(String nome, Integer horas, Double valorHora,Double extra) {
        super(nome, horas, valorHora);
        this.extra = extra;
    }

    @Override
    public Double pagamento() {

        return super.pagamento() + extra * 1.1;

        }

}
