package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um vetor de 10 n�meros, ler um qualquer, calcular e
 * escreves quantas vezes aparece no vetor
 * 
 * @author mtomazs
 * @since 12/02/2021
 */
public class Exercicio99 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando vari�veis e vetor
		int vetor[];
		int n;
		int contador = 0;

		// iniciando e definindo tamanho do vetor
		vetor = new int[10];

		// recebendo os dados do usu�rio
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe os n�meros"));
		}

		// recebendo outro n�mero
		n = Integer.parseInt(
				JOptionPane.showInputDialog("Informe o n�mero para verificar quantas vezes aparece no vetor"));

		// varrendo o vetor e indicando quantas vezes
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == n) {
				contador++;
			}
		}

		// exibindo no console
		JOptionPane.showMessageDialog(null, "O n�mero aparece: " + contador + " vezes.");
	}
}