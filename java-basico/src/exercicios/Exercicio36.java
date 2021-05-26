package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber um número e informar se é maior que 10 ou não
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio36 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		double n1;
		
		// recebendo a informação do usuário
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe um número:"));
		
		// exibindo para o usuário
		if (n1 > 10) 
		{
		JOptionPane.showMessageDialog(null, "É MAIOR QUE 10 !");	
		}
		
		else 
		{
		JOptionPane.showMessageDialog(null, "NÃO É MAIOR QUE 10 !");	
		}

	}

}
