package atividade12;

public class PessoaJuridica extends Contribuentes {

    private Integer funcionarios;

    public PessoaJuridica (){}

    public PessoaJuridica(String nome, Double renda, Integer funcionarios) {
        super(nome, renda);
        this.funcionarios = funcionarios;
    }

    public Integer getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Integer funcionarios) {
        this.funcionarios = funcionarios;
    }


    @Override
    public String imposto() {
        if (funcionarios<=10){
            Double valor = (getRenda()/100)*16;
            return  "O valor de imposto pago por " + getNome() + " será de: R$" + valor;
        }
        else{
            Double valor = (getRenda()/100)*14;
            return  "O valor de imposto pago por " + getNome() + " será de: R$" + valor;
            }
        }
}
