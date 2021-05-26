package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dois valores e escrever se são iguais, ou qual o maior
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio56 {

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
		JOptionPane.showMessageDialog(null, "Primeiro é maior");	
		}
		
		else if (n2 > n1) 
		{
		JOptionPane.showMessageDialog(null, "Segundo é maior");	
		}
		
		else 
		{
		JOptionPane.showMessageDialog(null, "Números iguais");	
		}
	}

}
