package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para escrever o saldo da conta e dizer se esta positivo ou negativo.
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio46 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		double n2, n3, n4, sa;
		int n1;
		
		// recebendo a informação do usuário
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da sua conta:"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo da conta:"));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe o débito:"));
		n4 = Double.parseDouble(JOptionPane.showInputDialog("Informe o crédito:"));
		
		// operação
		sa = ((n2 - n3) + n4);
		
		// exibindo para o usuário
		if (sa < 0) 
		{
		JOptionPane.showMessageDialog(null, "Número da conta: " + n1 + "\n" +
											"Saldo autal: R$ " + sa + "\n" +
											"Saldo negativo");	
		} 
		
		else 
		{
		JOptionPane.showMessageDialog(null, "Número da conta: " + n1 + "\n" +
											"Saldo atual: R$ " + sa + "\n" + 
											"Saldo positivo");	
		}
		
	}

}
