package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 2 notas e imprimir a m�dia, as notas s� devem ser aceitas entra 0 e 10
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio65 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// declarando vari�veis
		double n1, n2;
		
		// atribuindo valor na vari�vel n1
		n1 = 11;
		
		// recebendo a informa��o do usu�rio
		while ((n1 < 0) || (n1 > 10)) 
		{
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 1� nota:"));	
		}
		
		// atribuindo valor na vari�vel n2
		n2 = 11;
		
		// recebendo a informa��o do usu�rio onde o 2� valor tem que ser diferente de 0
		while ((n2 < 0) || (n2 > 10)) 
		{
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 2� nota:"));	
		}
		
		// exibindo a mensagem
		JOptionPane.showMessageDialog(null, "M�dia do aluno: " + ((n1 + n2) / 2));
	}

}
