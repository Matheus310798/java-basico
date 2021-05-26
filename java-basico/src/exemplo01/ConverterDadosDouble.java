package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar conversão de dados do tipo string para double
 * 
 * @author mtomazs
 * @since 05/02/2021
 */
public class ConverterDadosDouble {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declarando variáveis
		double valor1, valor2, resultado;

		// atribuindo valores para a variável informado pelo usuário
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1° valor:"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2º valor"));

		// efetuando a operação
		resultado = valor1 / valor2;

		// exibindo o resultado no console
		System.out.println("A divisão é: " + resultado);

	}

}
