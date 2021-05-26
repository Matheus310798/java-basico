package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para escrever o valor do menor elemento e sua respectiva posição
 * 
 * @author Matheus Tomaz da Silva
 * @since 11/02/2021
 */
public class Exercicio91 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando um vetor String
		int numero[];
		int menor = 1000000;

		// inicializar e definir o tamanho do vetor
		numero = new int[20];

		// recebendo do usuario os nomes e armazenando em um vetor
		for (int i = 0; i < numero.length; i++) {
			do {
				numero[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
			} while (numero[i] < 0);

			if (numero[i] < menor) {
				menor = numero[i];
			}
		}

		// exibindo o para o usuário
		for (int i = 0; i < numero.length; i++) {
			if (numero[i] == (menor)) {
				System.out.println("Achei o " + menor + " na posição: " + i);
			}
		}
	}
}
