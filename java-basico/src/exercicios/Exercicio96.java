package exercicios;

import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 números e escrever em ordem crescente, ler mais um e
 * continuar na ordem crescente acrescentando ele.
 * 
 * @author mtomazs
 * @since 12/02/2021
 */
public class Exercicio96 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// definindo o vetor
		int vetor[];

		// iniciando e definindo o tamanho do vetor
		vetor = new int[11];

		// recebendo os números do usuário
		for (int i = 0; i < 10; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe os números"));
			vetor[10] = 0;
		}

		// colocando em ordem crescente
		Arrays.sort(vetor);
		
		// pedindo outro número
		vetor[10] = Integer.parseInt(JOptionPane.showInputDialog("Informe um novo valor"));
		
		// colocando em ordem crescente
		Arrays.sort(vetor);

		// exibindo noo console os números em ordem parcialmente
		System.out.println("Ordem crescente:");
		for (int j = 0; j < vetor.length; j++) {
			System.out.println(vetor[j]);
		}

	}

}
