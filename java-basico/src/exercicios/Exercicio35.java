package exercicios;

import javax.swing.JOptionPane;

/**
 * Usuário indicar o número de moedas de cada valor e exibir o total economizado
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio35 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		double an, at, af;
		
		// recebendo informação do usuário
		an = Double.parseDouble(JOptionPane.showInputDialog("Digite o ano do seu nascimento:"));
		at = Double.parseDouble(JOptionPane.showInputDialog("Digite o ano atual:"));
		
		// operação
		af = at - an;
		
		// exibindo para o usuário
		JOptionPane.showMessageDialog(null, "Sua idade em anos é: " + af + " anos" + "\n" + 
											"Sua idade em meses é: " + (af * 12) + " meses" + "\n" +
											"Sua idade em dias é: " + (af * 360) + " dias" + "\n" +
											"Sua idade em semanas é: " + ((af * 360) / 7) + " dias");
		

	}

}
