package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler tr�s valores e escrever em ordem decrescente.
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio53 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		int n1, n2, n3;
		
		// recebendo a informa��o do usu�rio
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1� n�mero:"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2� n�mero diferente do 1� informado:"));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3� n�mero diferente do 1� e do 2� informado:"));
		
		// exibindo para o usu�rio
		if ((n1 > n2) && (n1 > n3) && (n2 > n3)) 
		{
		JOptionPane.showMessageDialog(null, n1 + " - " + n2 + " - " + n3);
		}
		
		else if ((n2 > n1) && (n2 > n3) && (n1 > n3))
		{
		JOptionPane.showMessageDialog(null, n2 + " - " + n1 + " - " + n3);
		}
		
		else if ((n3 > n1) && (n3 > n2) && (n1 > n2))
		{
		JOptionPane.showMessageDialog(null, n3 + " - " + n1 + " - " + n2);
		}
		
		else if ((n1 > n2) && (n1 > n3) && (n2 < n3))
		{
		JOptionPane.showMessageDialog(null, n1 + " - " + n3 + " - " + n2);
		}
		
		else if ((n2 > n1) && (n2 > n3) && (n1 < n3))
		{
		JOptionPane.showMessageDialog(null, n2 + " - " + n3 + " - " + n1);
		}
		
		else if ((n3 > n1) && (n3 > n2) && (n1 < n2))
		{
		JOptionPane.showMessageDialog(null, n3 + " - " + n2 + " - " + n1);
		}
		}
		
	}
