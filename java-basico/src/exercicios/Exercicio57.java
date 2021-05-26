package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dois valores e escrever se são iguais, ou qual o maior
 * 
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio57 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		String c;
		double n1, a1, a2, g1, g2;
		
		// recebendo os dados do usuário
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de litros vendidos:"));
		c = JOptionPane.showInputDialog("Digite A - Álcool ou G - Gasolina:");

		// operação álcool
		a1 = n1 * 0.03;
		a2 = n1 * 0.05;
		
		// operação gasolina
		g1 = n1 * 0.04;
		g2 = n1 * 0.06;
				
		// exibindo os dados para o usuário
		switch (c) {
		case "A": {
			if (n1 <= 20) 
			{
			JOptionPane.showMessageDialog(null, "Valor da conta: R$ " + ((n1 * 2.9) - a1));	
			break;
			}
			
			else 
			{
			JOptionPane.showMessageDialog(null, "Valor da conta: R$ " + ((n1 * 2.9) - a2));
			break;
			}
		}
		
		case "G": {
			if (n1 <= 20) 
			{
			JOptionPane.showMessageDialog(null, "Valor da conta: R$ " + ((n1 * 3.3) - g1));	
			break;
			}
			
			else 
			{
			JOptionPane.showMessageDialog(null, "Valor da conta: R$ " + ((n1 * 3.3) - g2));	
			break;
			}
		}
		
		case "a": {
			if (n1 <= 20) 
			{
			JOptionPane.showMessageDialog(null, "Valor da conta: R$ " + ((n1 * 2.9) - a1));	
			break;
			}
			
			else 
			{
			JOptionPane.showMessageDialog(null, "Valor da conta: R$ " + ((n1 * 2.9) - a2));
			break;
			}
		}
		
		case "g": {
			if (n1 <= 20) 
			{
			JOptionPane.showMessageDialog(null, "Valor da conta: R$ " + ((n1 * 3.3) - g1));	
			break;
			}
			
			else 
			{
			JOptionPane.showMessageDialog(null, "Valor da conta: R$ " + ((n1 * 3.3) - g2));	
			break;
			}
		}
		default:
		JOptionPane.showMessageDialog(null, "Letra inválida");
	}
	}
}