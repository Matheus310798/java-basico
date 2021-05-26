package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dois valores e exibir o resultado da exponenciação
 * 
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio13 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// Definindo as variáveis
		int n1, n2;

		// Atribuindo valores a variáveis
		n1 = 5;
		n2 = 2;

		// exibindo no console
		JOptionPane.showMessageDialog(null, "Primeiro valor: " + n1 + "\n" + 
											"Segundo valor : " + n2 + "\n" +
											"O resultado da exponenciação é: " + Math.pow(n1, n2));

	}

}
