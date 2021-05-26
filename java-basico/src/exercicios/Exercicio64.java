package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 2 valores, o segundo diferente de 0 e realizar a divis�o
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio64 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// declarando vari�veis
		double n1, n2;
		
		// recebendo a informa��o do usu�rio
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1� valor:"));
		
		// atribuindo valor da vari�vel n2
		n2 = 0;
		
		// recebendo a informa��o do usu�rio onde o 2� valor tem que ser diferente de 0
		while (n2==0) 
		{
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2� valor:"));	
		}
		
		// exibindo a mensagem
		JOptionPane.showMessageDialog(null, "A divis�o �: " + (n1 / n2));
	}

}
