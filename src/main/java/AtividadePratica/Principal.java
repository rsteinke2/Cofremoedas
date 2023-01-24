package AtividadePratica;

import java.util.Scanner;

/* ATIVIDADE PRÁTICA "COFRINHO"
 * DISCIPLINA PROGRAMAÇÃO ORIENTADA A OBJETO
 * UTILIZAÇÃO DE CONCEITOS DE HERANÇA E POLIFORMISMO

 */

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Declara var teclado para entrada de dados
        int opcao;
        Cofrinho cofrinho = new Cofrinho();        // Declara var cofrinho para o construtor
        System.out.println("");
        System.out.println("-------------------Cofrinho-------------------\n"); // Menu inicial / principal
        System.out.println("1-Adicionar Moeda");
        System.out.println("2-Remover Moeda");
        System.out.println("3-Listar Moedas");
        System.out.println("4-Calcular total convertido para Real");
        System.out.println("0-Encerrar");
        opcao=teclado.nextInt(); // Lê opção no teclado

        int tipoMoeda;
        double valorMoeda;
        Moeda moedas; // decl. var moeda para guardar na lista

        // laço de repetição do menu inicial
        while(opcao!=0) {

            switch(opcao) {

                case 1:
                    tipoMoeda=0;
                    while(tipoMoeda>3 || tipoMoeda<=0) {
                        System.out.println("Escolha a moeda:");
                        System.out.println("1-Real");
                        System.out.println("2-Dolar");
                        System.out.println("3-Euro");
                        tipoMoeda = teclado.nextInt();  // lê opção do teclado
                    }

                    moedas = null;
                    if(tipoMoeda==1) {
                        System.out.println("Moeda-Real:");
                        System.out.println("Digite o valor:");
                        valorMoeda = teclado.nextDouble(); // lê o valor
                        moedas = new Real(valorMoeda);  // define nova var moedas como padrão REAL
                    }
                    if (tipoMoeda==2)  {
                        System.out.println("Moeda-Dolar:");
                        System.out.println("Digite o valor:");
                        valorMoeda = teclado.nextDouble(); // lê o valor
                        moedas = new Dolar(valorMoeda);  // define nova var moedas como padrão DOLAR

                    }
                    if (tipoMoeda==3)  {
                        System.out.println("Moeda-Euro:");
                        System.out.println("Digite o valor:");
                        valorMoeda = teclado.nextDouble(); // lê o valor
                        moedas = new Euro(valorMoeda); // define nova var moedas como padrão EURO
                    }
                    cofrinho.add(moedas); // guarda na lista do cofrinho como o método add (adicionar)
                    break;

                case 2:
                    tipoMoeda=0;
                    while(tipoMoeda>3 || tipoMoeda<=0) {
                        System.out.println("Escolha a moeda:");
                        System.out.println("1-Real");
                        System.out.println("2-Dolar");
                        System.out.println("3-Euro");
                        tipoMoeda = teclado.nextInt();  // lê opção do teclado
                    }
                    moedas = null;
                    if(tipoMoeda==1) {
                        System.out.println("Moeda-Real:");
                        System.out.println("Digite o valor:");
                        valorMoeda = teclado.nextDouble(); // lê o valor
                        moedas = new Real(valorMoeda);  // define nova var moedas como padrão REAL
                    }
                    if (tipoMoeda==2)  {
                        System.out.println("Moeda-Dolar:");
                        System.out.println("Digite o valor:");
                        valorMoeda = teclado.nextDouble(); // lê o valor
                        moedas = new Dolar(valorMoeda);  // define nova var moedas como padrão DOLAR

                    }
                    if (tipoMoeda==3)  {
                        System.out.println("Moeda-Euro:");
                        System.out.println("Digite o valor:");
                        valorMoeda = teclado.nextDouble(); // lê o valor
                        moedas = new Euro(valorMoeda); // define nova var moedas como padrão EURO
                    }
                    cofrinho.remove(moedas); // remove da lista do cofrinho como o método remove (remover)
                    break;

                case 3:
                    cofrinho.list(); // lista as moedas da lista cofrinho (da memória)
                    break;
                case 4:
                    System.out.printf("O total do cofrinho em Reais é : R$%.2f\n", cofrinho.calcularTotalReal()); // mostra o resultado do total convertido em REAL
                    break;

                default:
                    System.out.println("Opção inválida! Escolha outra opção");

            }
            System.out.println("");
            System.out.println("-------------------Cofrinho-------------------\n"); // Menu inicial / repete para a opção inválida
            System.out.println("Cofrinho:");
            System.out.println("1-Adicionar Moeda");
            System.out.println("2-Remover Moeda");
            System.out.println("3-Listar Moedas");
            System.out.println("4-Calcular total convertido para Real");
            System.out.println("0-Encerrar");
            opcao=teclado.nextInt(); // Lê opção no teclado

        }
    }
}