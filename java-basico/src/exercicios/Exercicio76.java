package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 números e escrever a soma
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio76 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// declarando as variáveis
		int valores, res; 
		
		// iniciando
		res = 0;
		
		// usuário declarando 10 valores
		for (int i = 1; i < 11; i++) {
		valores = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor"));
		res = res + valores;
		}
		
		// exibindo a mensagem
		JOptionPane.showMessageDialog(null, "Soma dos números digitados: " + res);
	}
}
