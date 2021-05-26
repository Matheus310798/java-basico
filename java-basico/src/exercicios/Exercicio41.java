package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dois valores não iguais e escrever o maior deles
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio41 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		double n1, n2;
		
		// recebendo a informação do usuário
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1º número:"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2º número:"));
		
		// exibindo para o usuário
		if (n1 > n2) 
		{
		JOptionPane.showMessageDialog(null, "Número maior: " + n1);	
		}
		
		else 
		{
		JOptionPane.showMessageDialog(null, "Número maior: " + n2);	
		}

	}

}
