package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dois valores e exibir o resultado da exponencia��o
 * 
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio13 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// Definindo as vari�veis
		int n1, n2;

		// Atribuindo valores a vari�veis
		n1 = 5;
		n2 = 2;

		// exibindo no console
		JOptionPane.showMessageDialog(null, "Primeiro valor: " + n1 + "\n" + 
											"Segundo valor : " + n2 + "\n" +
											"O resultado da exponencia��o �: " + Math.pow(n1, n2));

	}

}
