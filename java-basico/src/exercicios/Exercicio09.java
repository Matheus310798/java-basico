package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dois valores e exibir o resultado da soma
 * 
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio09 {

	/*
	 * M?todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// Definindo as vari?veis
		double n1, n2, res;

		// recebendo os dados do usu?rio
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1? n?mero: "));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2? n?mero: "));

		// opera??o
		res = n1 + n2;
				
		// exibindo no console
		JOptionPane.showMessageDialog(null, "Primeiro valor digitado: " + n1 + "\n" + 
											"Segundo valor digitado: " + n2 + "\n" +
											"O resultado da soma ?: " + res);

	}

}
