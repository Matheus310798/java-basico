package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber o ano atual e o ano de nascimento, e informar se pode votar ou n�o.
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio40 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		double anonas, anoat, res;
		
		// recebendo a informa��o do usu�rio
		anonas = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu ano de nascimento:"));
		anoat = Double.parseDouble(JOptionPane.showInputDialog("Informe o ano atual:"));
		
		// opera��o
		res = anoat - anonas;
		
		// exibindo para o usu�rio
		if (res >= 16) 
		{
		JOptionPane.showMessageDialog(null, "Pode votar este ano");	
		}
		
		else 
		{
		JOptionPane.showMessageDialog(null, "N�o pode votar este ano");	
		}

	}

}
