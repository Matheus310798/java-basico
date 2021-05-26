package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um valor maior que 0 e escrever os números inteiros entre ele e 1
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio69 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// declarando variável
		int n;
		
		// recebendo a informação do usuário
		n = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor:"));	

		// exibindo para o usuário
		for (int i = 1; i <= n; i++) {
			System.out.println("Número: " + i);
		}
	}
}