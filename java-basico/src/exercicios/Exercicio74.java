package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores e escrever a média
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio74 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// declarando as variáveis
		int valores; 
		double res;
		
		// iniciando a variável
		res = 0;
		
		// usuário declarando 10 valores
		for (int i = 1; i < 11; i++) {
		valores = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor"));
		res = res + valores;
		}
		
		// exibindo a mensagem
		JOptionPane.showMessageDialog(null, "Média das notas: " + (res / 10));
	}
}
