package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dois valores não iguais e escrever em ordem crescente
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio42 {

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
		JOptionPane.showMessageDialog(null, "Ordem crescente: " + n2 + " - " + n1);	
		}
		
		else 
		{
		JOptionPane.showMessageDialog(null, "Ordem crescente: " + n1 + " - " + n2);	
		}

	}

}
