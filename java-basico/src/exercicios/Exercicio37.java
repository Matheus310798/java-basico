package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber um n�mero e informar se � positivo ou negativo
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio37 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		double n1;
		
		// recebendo a informa��o do usu�rio
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe um n�mero:"));
		
		// exibindo para o usu�rio
		if (n1 >= 0) 
		{
		JOptionPane.showMessageDialog(null, "N�mero POSITIVO !");	
		}
		
		else 
		{
		JOptionPane.showMessageDialog(null, "N�mero NEGATIVO !");	
		}

	}

}
