package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dois valores e exibir o resultado da divisão
 * 
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio12 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// Definindo as variáveis
		double n1, n2, res;

		// recebendo os dados do usuário
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1º número: "));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2º número: "));

		// operação
		res = n1 / n2;
				
		// exibindo no console
		JOptionPane.showMessageDialog(null, "Primeiro valor digitado: " + n1 + "\n" + 
											"Segundo valor digitado: " + n2 + "\n" +
											"O resultado da divisão é: " + res);

	}

}
