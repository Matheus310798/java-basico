package exercicios;

import javax.swing.JOptionPane;

/**
 * Receber os graus em FAHRENHEIT e escrever em graus CELSIUS.
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio23 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		double fa, cel1, cel2;
		
		// recebendo informação do usuário
		fa = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em graus FAHRENHEIT:"));
		
		
		// operação
		cel1 = fa - 32;
		cel2 = cel1 / 9;
		
		// exibindo para o usuário
		JOptionPane.showMessageDialog(null, "Temperatura em GRAUS CELSIUS é: " + (cel2 * 5));

	}

}
