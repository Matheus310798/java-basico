package exercicios;

import javax.swing.JOptionPane;

/**
 * Calcular X litros de agu� e de suco de acordo com a quantidade de litros do refresco.
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio34 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		double ref;
		
		// recebendo informa��o do usu�rio
		ref = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade em litros para preparar o refresco:"));
		
		// exibindo para o usu�rio
		JOptionPane.showMessageDialog(null, "Necess�rio: " + (ref * 0.8) + " litros de �gua" + "\n" + 
											"Necess�rio: " + (ref * 0.2) + " litros de suco de maracuj�");

	}

}
