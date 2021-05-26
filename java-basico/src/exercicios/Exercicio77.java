package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 números e somar todos inferior do 40
 * 
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio77 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando as variáveis
		int valor, res;

		// iniciando a variável
		valor = 0;
		res = 0;

		// usuário declarando 10 valores
		for (int i = 1; i < 11; i++) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor"));
			if (valor < 40) {
				res = res + valor;
			}
		}
		// exibindo a mensagem
		JOptionPane.showMessageDialog(null, "Soma dos números inferiores a 40: " + res);
	}
}
