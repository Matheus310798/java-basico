package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dois valores n�o iguais e escrever em ordem crescente
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio42 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		double n1, n2;
		
		// recebendo a informa��o do usu�rio
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1� n�mero:"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2� n�mero:"));
		
		// exibindo para o usu�rio
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
