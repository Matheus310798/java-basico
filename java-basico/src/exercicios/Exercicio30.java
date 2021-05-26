package exercicios;

import javax.swing.JOptionPane;

/**
 * Ler temperatura em CELSIUS e exibir em FAHRENHEIT.
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio30 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		double cel, fah, fah1;
		
		// recebendo informação do usuário
		cel = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em graus CELSIUS:"));
		
		
		// operação
		fah = cel * 1.8;
		fah1 = fah + 32;
		
		// exibindo para o usuário
		JOptionPane.showMessageDialog(null, "Temperatura em GRAUS FAHRENHEIT é: " + fah1);

	}

}
