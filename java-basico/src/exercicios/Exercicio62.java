package exercicios;

import javax.swing.JOptionPane;

/**
 *  Programa para ler 3 notas e a m�dia dos exerc�cios do aluno, calcular e exibir o conceito do aluno de acordo com a tabela
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio62 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// definindo as vari�veis
		double n1, n2, n3, me, ma;
		
		// recebendo os dados do usu�rio
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 1� nota:"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 2� nota:"));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 3� nota:"));
		me = Double.parseDouble(JOptionPane.showInputDialog("M�dia dos exerc�cios:"));
		
		// c�lculo da m�dia do aluno
		ma = ((((n1 + n2) * 2) + (n3 * 3) + me) / 7);
		
		// exibindo para o usu�rio
		if (ma >= 9) 
		{
		JOptionPane.showMessageDialog(null, "Conceito A");	
		}
		
		else if ((ma >= 7.5) && (ma < 9)) 
		{
		JOptionPane.showMessageDialog(null, "Conceito B");	
		}
		
		else if ((ma >= 6) && (ma < 7.5))
		{
		JOptionPane.showMessageDialog(null, "Conceito C");	
		} 
		
		else 
		{
		JOptionPane.showMessageDialog(null, "Conceito D");	
		}
	}
}