package exercicios;

import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 números e escrever em ordem crescente
 * 
 * @author mtomazs
 * @since 12/02/2021
 */
public class Exercicio95 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// definindo o vetor
		int vetor[];

		// iniciando e definindo o tamanho do vetor
		vetor = new int[10];

		// recebendo os números do usuário
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe os números"));
		}

		// colocando em ordem crescente
		Arrays.sort(vetor);

		// exibindo no console
		System.out.println("Ordem crescente:");
		for (int j = 0; j < vetor.length; j++) {
			System.out.println(vetor[j]);
		}
	}

}
