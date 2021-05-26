package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores e escrever a m�dia
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio74 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// declarando as vari�veis
		int valores; 
		double res;
		
		// iniciando a vari�vel
		res = 0;
		
		// usu�rio declarando 10 valores
		for (int i = 1; i < 11; i++) {
		valores = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor"));
		res = res + valores;
		}
		
		// exibindo a mensagem
		JOptionPane.showMessageDialog(null, "M�dia das notas: " + (res / 10));
	}
}
