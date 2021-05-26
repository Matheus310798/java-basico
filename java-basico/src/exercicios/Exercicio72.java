package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 números e informar quantos são negativos
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio72 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// declarando as variáveis
		int valor, neg;
		
		// iniciando a variável
		neg = 0;
		
		// usuário declarando 10 valores
		for (int i = 1; i < 11; i++) {
		valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor"));
			if (valor < 0) 
			{
			neg++;	
			}
		}
		// exibindo a mensagem
		JOptionPane.showMessageDialog(null, "Números negativos digitados: " + neg);
	}
}
