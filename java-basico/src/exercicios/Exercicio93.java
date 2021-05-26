package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 20 números e exibir em ordem inversa
 * 
 * @author mtomazs
 * @since 11/02/2021
 */
public class Exercicio93 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando variável
		int vetor[];

		// iniciando o vetor e definindo tamanho
		vetor = new int[20];

		// recebendo do usuário as informações e armazenando no vetor
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		}

		// exibindo em ordem inversa
		for (int i = 19; i < vetor.length; i--) {
			System.out.println(vetor[i]);
		}
	}
}