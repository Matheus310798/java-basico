package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber as dimensões do retângulo, calcular e escrever sua área
 * 
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio16 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// Definindo as variáveis
		double altura, base, res;

		// recebendo os dados do usuário
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da altura do retângulo: "));
		base = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da base do retângulo: "));

		// operação
		res = altura * base;
				
		// exibindo no console
		JOptionPane.showMessageDialog(null, "Altura: " + altura + "\n" + 
											"Base: " + base + "\n" +
											"Área do retângulo: " + res);

	}

}
