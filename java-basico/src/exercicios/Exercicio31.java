package exercicios;

import javax.swing.JOptionPane;

/**
 * Algoritmo para calcular o gasto total da granja.
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio31 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		double fran;
		
		// recebendo informação do usuário
		fran = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de frangos a serem marcados:"));
		
		// exibindo para o usuário
		JOptionPane.showMessageDialog(null, "Gasto total para marcação de todos os frangos: R$ " + fran * 11);

	}

}
