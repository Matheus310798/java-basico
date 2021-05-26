package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber escrever o custo da compra de maças
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio38 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		double maca;
		
		// recebendo a informação do usuário
		maca = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de maças compradas:"));
		
		// exibindo para o usuário
		if (maca >= 12) 
		{
		JOptionPane.showMessageDialog(null, "Valor da compra: R$ " + maca);	
		}
		
		else 
		{
		JOptionPane.showMessageDialog(null, "Valor da compra: R$ " + (maca * 1.3));	
		}

	}

}
