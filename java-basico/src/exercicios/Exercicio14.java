package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dois valores e exibir o resultado do m�dulo
 * 
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio14 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// Definindo as vari�veis
		double n1, n2, res;

		// Atribuindo valores
		n1 = 5;
		n2 = 2;

		// opera��o
		res = n1 % n2;
				
		// exibindo no console
		JOptionPane.showMessageDialog(null, "Primeiro valor: " + n1 + "\n" + 
											"Segundo valor: " + n2 + "\n" +
											"O resultado do m�dulo �: " + res);

	}

}
