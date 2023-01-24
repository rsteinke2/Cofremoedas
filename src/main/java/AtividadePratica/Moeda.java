package AtividadePratica;

import java.util.Objects;

public abstract class Moeda {
    double valorMoeda;

    public Moeda(double valorMoeda) {
        super();
        this.valorMoeda = valorMoeda;
    }
    public abstract void info();
    public abstract double convert();

    @Override
    public int hashCode() {
        return Objects.hash(valorMoeda);
    }

    @Override
    public boolean equals(Object obj) { // verifica de o objeto tem o mesmo tipo de dado
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Moeda other = (Moeda) obj;
        return Double.doubleToLongBits(valorMoeda) == Double.doubleToLongBits(other.valorMoeda);
    }
}
