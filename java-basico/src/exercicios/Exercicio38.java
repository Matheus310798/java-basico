package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber escrever o custo da compra de ma�as
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio38 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		double maca;
		
		// recebendo a informa��o do usu�rio
		maca = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de ma�as compradas:"));
		
		// exibindo para o usu�rio
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
