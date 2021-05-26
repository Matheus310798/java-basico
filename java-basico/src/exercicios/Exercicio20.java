package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber um valor em dólar e converter em reais
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio20 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		double real, dolar;
		
		// recebendo informação do usuário
		dolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em dólar a ser convertido:"));
		
		// operação
		real = dolar * 6.61;
		
		// exibindo para o usuário
		JOptionPane.showMessageDialog(null, "Valor convertido em reais: R$ " + real);

	}

}
