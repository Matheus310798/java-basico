package exercicios;

import javax.swing.JOptionPane;

/**
 * Fornecer quantos quilos necessários dos itens para realizar X sanduíches
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio29 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		double san, queijo, presunto, hamb; 
		
		// recebendo informação do usuário
		san = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de sanduíches para ser preparados:"));
		
		// operação
		queijo = san * 100;
		presunto = san * 50;
		hamb = san * 100;
		
		
		// exibindo para o usuário
		JOptionPane.showMessageDialog(null, "Comprar: " + (queijo / 1000) + " Kg de queijo" + "\n" + 
											"Comprar: " + (presunto / 1000) + " Kg de presunto" + "\n" + 
											"Comprar: " + (hamb / 1000) + " Kg de carne");

	}

}
