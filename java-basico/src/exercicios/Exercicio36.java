package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber um n�mero e informar se � maior que 10 ou n�o
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio36 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		double n1;
		
		// recebendo a informa��o do usu�rio
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe um n�mero:"));
		
		// exibindo para o usu�rio
		if (n1 > 10) 
		{
		JOptionPane.showMessageDialog(null, "� MAIOR QUE 10 !");	
		}
		
		else 
		{
		JOptionPane.showMessageDialog(null, "N�O � MAIOR QUE 10 !");	
		}

	}

}
