package exercicios;

import javax.swing.JOptionPane;

/**
 * Receber os graus em FAHRENHEIT e escrever em graus CELSIUS.
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio23 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		double fa, cel1, cel2;
		
		// recebendo informa��o do usu�rio
		fa = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em graus FAHRENHEIT:"));
		
		
		// opera��o
		cel1 = fa - 32;
		cel2 = cel1 / 9;
		
		// exibindo para o usu�rio
		JOptionPane.showMessageDialog(null, "Temperatura em GRAUS CELSIUS �: " + (cel2 * 5));

	}

}
