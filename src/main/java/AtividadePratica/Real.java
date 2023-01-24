package AtividadePratica;

public class Real extends Moeda{

    @Override // sobrescreve método da classe mãe abstrata
    public void info() { // método para impressão do tipo e valor
        System.out.println("Tipo de moeda: Real | Valor = R$" + this.mostrarValor());

    }

    @Override // sobrescreve método da classe mãe abstrata
    public double convert() { //para real (não há cálculo) somente retorna valor
        return valorMoeda;

    }

    public Real(double valorMoeda) { // herdado da classe acima
        super(valorMoeda);

    }

    double mostrarValor() {
        double total = valorMoeda;
        return total;

    }


}