package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber 2 notas do aluno, realizar a média e exibir se está aprovado ou não
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio39 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		double n1, n2, res;
		
		// recebendo a informação do usuário
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 1º nota do aluno:"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 2º nota do aluno:"));
		
		// Cálculo da média
		res = ((n1 + n2) / 2);
		
		// exibindo para o usuário
		if (res >= 6) 
		{
		JOptionPane.showMessageDialog(null, "APROVADO !" + "\n" + 
											"Média: " + res);	
		}
		
		else 
		{
		JOptionPane.showMessageDialog(null, "REPROVADO !" + "\n" +
											"Média: " + res);	
		}

	}

}
