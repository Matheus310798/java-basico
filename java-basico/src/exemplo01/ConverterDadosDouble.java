package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar convers�o de dados do tipo string para double
 * 
 * @author mtomazs
 * @since 05/02/2021
 */
public class ConverterDadosDouble {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declarando vari�veis
		double valor1, valor2, resultado;

		// atribuindo valores para a vari�vel informado pelo usu�rio
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1� valor:"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2� valor"));

		// efetuando a opera��o
		resultado = valor1 / valor2;

		// exibindo o resultado no console
		System.out.println("A divis�o �: " + resultado);

	}

}
