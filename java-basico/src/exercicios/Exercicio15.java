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
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// Definindo as variáveis
		int n1, res;

		// recebendo os dados do usuário
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o número: "));
		
		// operação
		res = n1 - 1;

		// exibindo no console
		JOptionPane.showMessageDialog(null, "Número digitado: " + n1 + "\n" + 
											"Seu antecessor é: " + res);

	}

}
