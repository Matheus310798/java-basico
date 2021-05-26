package exercicios;

import javax.swing.JOptionPane;

/**
 * Usu�rio indicar o n�mero de moedas de cada valor e exibir o total economizado
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio35 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		double an, at, af;
		
		// recebendo informa��o do usu�rio
		an = Double.parseDouble(JOptionPane.showInputDialog("Digite o ano do seu nascimento:"));
		at = Double.parseDouble(JOptionPane.showInputDialog("Digite o ano atual:"));
		
		// opera��o
		af = at - an;
		
		// exibindo para o usu�rio
		JOptionPane.showMessageDialog(null, "Sua idade em anos �: " + af + " anos" + "\n" + 
											"Sua idade em meses �: " + (af * 12) + " meses" + "\n" +
											"Sua idade em dias �: " + (af * 360) + " dias" + "\n" +
											"Sua idade em semanas �: " + ((af * 360) / 7) + " dias");
		

	}

}
