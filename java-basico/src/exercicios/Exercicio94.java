package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 2 vetores com o seu tamanho informado pelo usuário, e somar
 * com as mesmas posições
 * 
 * @author mtomazs
 * @since 11/02/2021
 */
public class Exercicio94 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando vetores e variável N
		double vetorA[];
		double vetorB[];
		double vetorsoma[];
		int N;

		// recebendo o tamanho dos vetores
		N = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho dos vetores"));

		// iniciando os vetores
		vetorA = new double[N];
		vetorB = new double[N];
		vetorsoma = new double[N];

		// recebendo os dados do vetorA
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe os valores do vetorA"));
		}
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe os valor do vetorB"));
		}

		// soma dos vetores
		for (int i = 0; i < vetorsoma.length; i++) {
			vetorsoma[i] = vetorA[i] + vetorB[i];
		}

		// exibindo o resultado
		for (int i = 0; i < vetorsoma.length; i++) {
			System.out.println("Soma dos vetores: " + vetorA[i] + " + " + vetorB[i] + " = " + vetorsoma[i]);
		}
	}
}