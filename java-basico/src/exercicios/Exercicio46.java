package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para escrever o saldo da conta e dizer se esta positivo ou negativo.
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio46 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		double n2, n3, n4, sa;
		int n1;
		
		// recebendo a informa��o do usu�rio
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero da sua conta:"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo da conta:"));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe o d�bito:"));
		n4 = Double.parseDouble(JOptionPane.showInputDialog("Informe o cr�dito:"));
		
		// opera��o
		sa = ((n2 - n3) + n4);
		
		// exibindo para o usu�rio
		if (sa < 0) 
		{
		JOptionPane.showMessageDialog(null, "N�mero da conta: " + n1 + "\n" +
											"Saldo autal: R$ " + sa + "\n" +
											"Saldo negativo");	
		} 
		
		else 
		{
		JOptionPane.showMessageDialog(null, "N�mero da conta: " + n1 + "\n" +
											"Saldo atual: R$ " + sa + "\n" + 
											"Saldo positivo");	
		}
		
	}

}
