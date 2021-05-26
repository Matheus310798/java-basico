package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber o ano atual e o ano de nascimento, e informar se pode votar ou não.
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio40 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		double anonas, anoat, res;
		
		// recebendo a informação do usuário
		anonas = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu ano de nascimento:"));
		anoat = Double.parseDouble(JOptionPane.showInputDialog("Informe o ano atual:"));
		
		// operação
		res = anoat - anonas;
		
		// exibindo para o usuário
		if (res >= 16) 
		{
		JOptionPane.showMessageDialog(null, "Pode votar este ano");	
		}
		
		else 
		{
		JOptionPane.showMessageDialog(null, "Não pode votar este ano");	
		}

	}

}
