package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber 2 horários e escrever quanto tempo durou o jogo
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio43 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		double n1, n2;
		
		// recebendo a informação do usuário
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a hora do início do jogo:"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o horário do término do jogo:"));
		
		// exibindo para o usuário
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
