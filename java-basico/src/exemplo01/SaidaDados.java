package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar exibi��o de dados para o usu�rio
 * 
 * @author mtomazs
 * @since 05/02/2021
 */
public class SaidaDados {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declarando vari�veis
		double num1, num2, res;

		// atribuindo valores para as vari�veis
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1� n�mero:"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2� n�mero:"));

		// efetuando a opera��o
		res = num1 * num2;

		// exibindo o resultado para o usu�rio
		JOptionPane.showMessageDialog(null, "Primeiro valor digitado: " + num1 + "\n" + 
											"Segundo valor digitado: " + num2 + "\n" + 
											"Resultado: " + res); 

	}

}
