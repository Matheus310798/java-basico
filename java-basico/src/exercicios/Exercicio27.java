package exercicios;

import javax.swing.JOptionPane;

/**
 * Informar valor das vendas de camisetas.
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio27 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		int p, m, g, p1, m1, g1;
		
		// recebendo informação do usuário
		p = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de camisetas P"));
		m = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de camisetas M"));
		g = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de camisetas G"));
		
		
		// operação
		p1 = p * 10;
		m1 = m * 12;
		g1 = g * 15;
		
		
		// exibindo para o usuário
		JOptionPane.showMessageDialog(null, "Valor arrecadado: R$ " + (p1 + m1 + g1));

	}

}
