package exercicios;

import javax.swing.JOptionPane;

/**
 * Ler temperatura em CELSIUS e exibir em FAHRENHEIT.
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio30 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		double cel, fah, fah1;
		
		// recebendo informa��o do usu�rio
		cel = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em graus CELSIUS:"));
		
		
		// opera��o
		fah = cel * 1.8;
		fah1 = fah + 32;
		
		// exibindo para o usu�rio
		JOptionPane.showMessageDialog(null, "Temperatura em GRAUS FAHRENHEIT �: " + fah1);

	}

}
