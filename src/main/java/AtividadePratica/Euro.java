package AtividadePratica;

public class Euro extends Moeda{


    @Override // sobrescreve método da classe mãe abstrata
    public void info() { // método para impressão do tipo e valor
        System.out.println("Tipo de moeda: Euro | Valor = €" + this.mostrarValor());

    }

    @Override // sobrescreve método da classe mãe abstrata
    public double convert() { // Conversão para Euro de Real
        double totalEuro = valorMoeda * 5.51;
        return totalEuro;

    }

    public Euro(double valorMoeda) {
        super(valorMoeda);

    }

    double mostrarValor() {
        double total = valorMoeda;
        return total;

    }


}