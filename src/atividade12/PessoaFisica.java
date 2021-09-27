package atividade12;

public class PessoaFisica extends Contribuentes{

    private Double saude;

    public PessoaFisica () {}

    public PessoaFisica(String nome, Double renda, Double saude) {
        super(nome, renda);
        this.saude = saude;
    }

    public Double getSaude() {
        return saude;
    }

    public void setSaude(Double saude) {
        this.saude = saude;
    }


    @Override
    public String imposto() {
        if (getRenda()<20000){
            Double valor = (getRenda()/100)*15;
            Double gastosSaude = (getSaude()/100)*50;
            Double valorTotal = valor - gastosSaude;
            return  "O valor de imposto pago por " + getNome() + " será de: R$" + valorTotal;
            }
        else {
            Double valor = (getRenda()/100)*25;
            Double gastosSaude = (getSaude()/100)*50;
            Double valorTotal = valor - gastosSaude;
            return  "O valor de imposto pago por " + getNome() + " será de: R$" + valorTotal;
            }

        }
}
