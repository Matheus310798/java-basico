package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o nome de 2 times e o n�mero de gols por cada time, exibir o vencedor ou o empate.
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio55 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		String a, b;
		int c, d;
		
		// recebendo a informa��o do usu�rio
		a = JOptionPane.showInputDialog("Nome do Time 1:");
		b = JOptionPane.showInputDialog("Nome do Time 2:");
		c = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos gols do " + a));
		d = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos gols do " + b));
		
		// exibindo para o usu�rio
		if (c > d) 
		{
		JOptionPane.showMessageDialog(null, "Time vencedor: " + a);	
		}
		
		else if (d > c) 
		{
			JOptionPane.showMessageDialog(null, "Time vencedor: " + b);	
		}
		
		else 
		{
		JOptionPane.showMessageDialog(null, "EMPATE");	
		}
		}
	}
