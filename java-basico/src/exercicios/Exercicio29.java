package exercicios;

import javax.swing.JOptionPane;

/**
 * Fornecer quantos quilos necess�rios dos itens para realizar X sandu�ches
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio29 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		double san, queijo, presunto, hamb; 
		
		// recebendo informa��o do usu�rio
		san = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de sandu�ches para ser preparados:"));
		
		// opera��o
		queijo = san * 100;
		presunto = san * 50;
		hamb = san * 100;
		
		
		// exibindo para o usu�rio
		JOptionPane.showMessageDialog(null, "Comprar: " + (queijo / 1000) + " Kg de queijo" + "\n" + 
											"Comprar: " + (presunto / 1000) + " Kg de presunto" + "\n" + 
											"Comprar: " + (hamb / 1000) + " Kg de carne");

	}

}
