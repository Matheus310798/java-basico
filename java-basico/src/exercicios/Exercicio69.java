package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um valor maior que 0 e escrever os n�meros inteiros entre ele e 1
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio69 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// declarando vari�vel
		int n;
		
		// recebendo a informa��o do usu�rio
		n = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor:"));	

		// exibindo para o usu�rio
		for (int i = 1; i <= n; i++) {
			System.out.println("N�mero: " + i);
		}
	}
}