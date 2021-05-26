package exemplo02;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar o uso do IF Else
 * 
 * @author mtomazs
 * @since 08/02/2021
 *
 */
public class CondicionalIfElse {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declarando variáveis
		double imc, altura, peso;

		// capturando os dados do usuário
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));

		// calculando o imc
		imc = peso / (Math.pow(altura, 2));

		// mostrando para o usuário
		if (imc < 18.5) {
			JOptionPane.showMessageDialog(null, "Abaixo do peso !");
		} else {
			JOptionPane.showMessageDialog(null, "Peso ideal !");
		}

	}

}
