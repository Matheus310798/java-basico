package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber as dimens�es do ret�ngulo, calcular e escrever sua �rea
 * 
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio16 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// Definindo as vari�veis
		double altura, base, res;

		// recebendo os dados do usu�rio
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da altura do ret�ngulo: "));
		base = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da base do ret�ngulo: "));

		// opera��o
		res = altura * base;
				
		// exibindo no console
		JOptionPane.showMessageDialog(null, "Altura: " + altura + "\n" + 
											"Base: " + base + "\n" +
											"�rea do ret�ngulo: " + res);

	}

}
