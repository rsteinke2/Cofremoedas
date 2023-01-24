package AtividadePratica;

public class Dolar extends Moeda {


    @Override // sobrescreve método da classe mãe abstrata
    public void info() { // método para impressão do tipo e valor
        System.out.println("Tipo de moeda: Dólar | Valor = $" + this.mostrarValor());

    }

    @Override // sobrescreve método da classe mãe abstrata
    public double convert() { // Conversão para Dolar de Real
        double totalDolar = valorMoeda * 5.24;
        return totalDolar;

    }

    public Dolar(double valorMoeda) {
        super(valorMoeda);

    }

    double mostrarValor() {
        double total = valorMoeda;
        return total;

    }

}