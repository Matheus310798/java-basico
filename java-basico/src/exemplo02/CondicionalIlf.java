package exemplo02;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar o comando IF
 * @author mtomazs
 * @since 08/02/2021
 */
public class CondicionalIlf {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// declarando vari�veis
		double imc, altura, peso;
		
		// capturando informa��es do usu�rio
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));
		
		//calculando o IMC do usu�rio
		imc = peso / (Math.pow(altura, 2));
		
		// exibir o resultado do IMC
		if (imc < 18.5) {
			JOptionPane.showMessageDialog(null, "Abaixo do peso !");
		}
		
		if ((imc >= 18.5) && (imc <= 24.9)) {
			JOptionPane.showMessageDialog(null, "Peso ideal !");
		}
	}

}
