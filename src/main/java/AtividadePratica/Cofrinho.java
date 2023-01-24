package AtividadePratica;

import java.util.ArrayList;

public class Cofrinho {
    ArrayList<AtividadePratica.Moeda> listarMoedas = new ArrayList<Moeda>(); // define a variável listaMoedas para um ARRAY de lista

    public void add(Moeda m) { // método adiciona moedas na lista
        listarMoedas.add(m);
    }
    public void remove(Moeda m) { // método remove moedas da lista
        listarMoedas.remove(m);
    }
    public void list() { // método lista as moedas cada tipo e valor
        for (Moeda m: listarMoedas) {
            m.info();
        }
    }

    public double calcularTotalReal() {
        if(this.listarMoedas.isEmpty()) { // confere se lista está vazia
            return 0;
        }

        double total=0;

        for(Moeda m: this.listarMoedas) {
            total+=m.convert(); // incrementa somando os valores (já convertidos) da lista de moedas
        }
        return total;
    }

}
