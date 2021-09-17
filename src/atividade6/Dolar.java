package atividade6;

public class Dolar {
    public double valor;
    public double compra;

    public double total() {
        double juros = (valor * compra / 100) * 6;
        return compra * valor + juros;
    }
}
