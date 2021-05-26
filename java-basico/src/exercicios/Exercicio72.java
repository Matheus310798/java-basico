package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 n�meros e informar quantos s�o negativos
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio72 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// declarando as vari�veis
		int valor, neg;
		
		// iniciando a vari�vel
		neg = 0;
		
		// usu�rio declarando 10 valores
		for (int i = 1; i < 11; i++) {
		valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor"));
			if (valor < 0) 
			{
			neg++;	
			}
		}
		// exibindo a mensagem
		JOptionPane.showMessageDialog(null, "N�meros negativos digitados: " + neg);
	}
}
