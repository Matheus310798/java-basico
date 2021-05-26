package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 2 valores, o segundo diferente de 0 e realizar a divisão
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio64 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// declarando variáveis
		double n1, n2;
		
		// recebendo a informação do usuário
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1° valor:"));
		
		// atribuindo valor da variável n2
		n2 = 0;
		
		// recebendo a informação do usuário onde o 2° valor tem que ser diferente de 0
		while (n2==0) 
		{
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2° valor:"));	
		}
		
		// exibindo a mensagem
		JOptionPane.showMessageDialog(null, "A divisão é: " + (n1 / n2));
	}

}
