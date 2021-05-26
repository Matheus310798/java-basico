package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 n�meros e escrever a soma
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio76 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// declarando as vari�veis
		int valores, res; 
		
		// iniciando
		res = 0;
		
		// usu�rio declarando 10 valores
		for (int i = 1; i < 11; i++) {
		valores = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor"));
		res = res + valores;
		}
		
		// exibindo a mensagem
		JOptionPane.showMessageDialog(null, "Soma dos n�meros digitados: " + res);
	}
}
