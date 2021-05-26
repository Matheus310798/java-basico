package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber 2 hor�rios e escrever quanto tempo durou o jogo
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio43 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		double n1, n2;
		
		// recebendo a informa��o do usu�rio
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a hora do in�cio do jogo:"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o hor�rio do t�rmino do jogo:"));
		
		// exibindo para o usu�rio
		if (n1 == n2) 
		{
		JOptionPane.showMessageDialog(null, "O jogo durou 24 horas");	
		} 
		
		else if (n1 > n2) 
		{
		JOptionPane.showMessageDialog(null, "O jogo durou " + ((24 - n1) + n2) + " horas");	
		} 
		
		else 
		{
		JOptionPane.showMessageDialog(null, "O jogo durou " + (n2 - n1) + " horas");	
		}

	}

}
