package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar convers�o de tipos de dados
 * 
 * @author mtomazs
 * @since 05/02/2021
 */
public class ConverterDadosInt {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		
		// Declarando vari�veis
		int valor1;
		int valor2;
		int resultado;
		
		// recebendo os valores do usu�rio
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 1� valor"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 2� valor"));
		
		// calculando o resultado da soma
		resultado = valor1 + valor2;
				
		// exibindo o resultado a soma
		System.out.println("O resultado �: " + resultado);

	}

}
