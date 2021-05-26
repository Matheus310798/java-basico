package exercicios;

import javax.swing.JOptionPane;

/**
 * Calcular X litros de aguá e de suco de acordo com a quantidade de litros do refresco.
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio34 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		double ref;
		
		// recebendo informação do usuário
		ref = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade em litros para preparar o refresco:"));
		
		// exibindo para o usuário
		JOptionPane.showMessageDialog(null, "Necessário: " + (ref * 0.8) + " litros de Água" + "\n" + 
											"Necessário: " + (ref * 0.2) + " litros de suco de maracujá");

	}

}
