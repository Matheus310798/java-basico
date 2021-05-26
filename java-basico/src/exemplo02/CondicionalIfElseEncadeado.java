package exemplo02;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar o uso do IF Else encadeado
 * 
 * @author mtomazs
 * @since 08/02/2021
 *
 */
public class CondicionalIfElseEncadeado {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declarando vari�veis
		double imc, altura, peso;

		// capturando os dados do usu�rio
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));

		// calculando o imc
		imc = peso / (Math.pow(altura, 2));

		// mostrando para o usu�rio
		if (imc < 18.5) {
			JOptionPane.showMessageDialog(null, "Abaixo do peso !");
		} else if ((imc >= 18.5) && (imc <= 24.9)) {
			JOptionPane.showMessageDialog(null, "Peso Ideal !");
		} else if ((imc >= 25) && (imc <= 29.9)) {
			JOptionPane.showMessageDialog(null, "Acima do peso ! ");
		} else if ((imc >= 30) && (imc <= 34.9)) {
			JOptionPane.showMessageDialog(null, "Obesidade N�vel 1");
		} else {
			JOptionPane.showMessageDialog(null, "Obesidade M�rbida !");
		}

	}

}
