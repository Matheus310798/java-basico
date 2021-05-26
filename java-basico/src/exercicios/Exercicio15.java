package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber um valor e exibir na tela seu antecessor
 * 
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio15 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// Definindo as vari�veis
		int n1, res;

		// recebendo os dados do usu�rio
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero: "));
		
		// opera��o
		res = n1 - 1;

		// exibindo no console
		JOptionPane.showMessageDialog(null, "N�mero digitado: " + n1 + "\n" + 
											"Seu antecessor �: " + res);

	}

}
