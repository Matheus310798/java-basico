package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler três valores e escrever a multiplicação dos dois menores.
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio51 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		int n1, n2, n3;
		
		// recebendo a informação do usuário
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° número:"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° número diferente do 1° informado:"));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3° número diferente do 1° e do 2° informado:"));
		
		// exibindo para o usuário
		if ((n1 > n2) && (n1 > n3)) 
		{
		JOptionPane.showMessageDialog(null, "A multiplicação dos 2 números menores é: " + (n2 * n3));
		}
		
		else if ((n2 > n3) && (n2 > n1)) 
		{
		JOptionPane.showMessageDialog(null, "A multiplicação dos 2 números menores é: " + (n1 * n3));
		} 
		
		else 
		{
			JOptionPane.showMessageDialog(null, "A multiplicação dos 2 números menores é: " + (n2 * n1));	
		}
		}
		
	}
