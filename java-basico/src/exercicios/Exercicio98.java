package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler dois vetores e escrever a quantidade de vezes que possuem
 * os mesmos números nas mesmas posições
 * 
 * @author mtomazs
 * @since 12/02/2021
 */
public class Exercicio98 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// Definindo as variáveis
		int v1[];
		int v2[];
		int vi[];
		int contador = 0;

		// iniciando e definindo tamanho dos vetores
		v1 = new int[15];
		v2 = new int[15];
		vi = new int[15];

		// recebendo os valores do usuário
		for (int i = 0; i < v1.length; i++) {
			v1[i] = Integer.parseInt(JOptionPane.showInputDialog("informe os valores do vetor 1"));
		}
		for (int i = 0; i < v2.length; i++) {
			v2[i] = Integer.parseInt(JOptionPane.showInputDialog("informe os valores do vetor 2"));
		}
		for (int i = 0; i < vi.length; i++) {
			if (v1[i] == v2[i]) {
				contador++;
			}
		}

		// exibindo os dados
		JOptionPane.showMessageDialog(null, "Quantidade de vezes: " + contador);
	}
}