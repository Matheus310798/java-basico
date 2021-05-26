package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber um número e informar se é positivo ou negativo
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio37 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		double n1;
		
		// recebendo a informação do usuário
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe um número:"));
		
		// exibindo para o usuário
		if (n1 >= 0) 
		{
		JOptionPane.showMessageDialog(null, "Número POSITIVO !");	
		}
		
		else 
		{
		JOptionPane.showMessageDialog(null, "Número NEGATIVO !");	
		}

	}

}
