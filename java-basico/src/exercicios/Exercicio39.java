package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber 2 notas do aluno, realizar a m�dia e exibir se est� aprovado ou n�o
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio39 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		double n1, n2, res;
		
		// recebendo a informa��o do usu�rio
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 1� nota do aluno:"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 2� nota do aluno:"));
		
		// C�lculo da m�dia
		res = ((n1 + n2) / 2);
		
		// exibindo para o usu�rio
		if (res >= 6) 
		{
		JOptionPane.showMessageDialog(null, "APROVADO !" + "\n" + 
											"M�dia: " + res);	
		}
		
		else 
		{
		JOptionPane.showMessageDialog(null, "REPROVADO !" + "\n" +
											"M�dia: " + res);	
		}

	}

}
