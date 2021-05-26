package exercicios;

import javax.swing.JOptionPane;

/**
 * Algoritmo para calcular o gasto total da granja.
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio31 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		double fran;
		
		// recebendo informa��o do usu�rio
		fran = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de frangos a serem marcados:"));
		
		// exibindo para o usu�rio
		JOptionPane.showMessageDialog(null, "Gasto total para marca��o de todos os frangos: R$ " + fran * 11);

	}

}
