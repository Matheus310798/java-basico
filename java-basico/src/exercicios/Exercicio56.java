package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dois valores e escrever se s�o iguais, ou qual o maior
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio56 {

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
		JOptionPane.showMessageDialog(null, "Primeiro � maior");	
		}
		
		else if (n2 > n1) 
		{
		JOptionPane.showMessageDialog(null, "Segundo � maior");	
		}
		
		else 
		{
		JOptionPane.showMessageDialog(null, "N�meros iguais");	
		}
	}

}
