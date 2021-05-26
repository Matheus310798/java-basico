package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 números e informar quantos estão no intervalor entre 10 e 20 e quantos foras
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio73 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// declarando as variáveis
		int valor, est, nes;
		
		// iniciando a variável
		est = 0;
		nes = 0;
		
		// usuário declarando 10 valores
		for (int i = 1; i < 11; i++) {
		valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor"));
			if ((valor <= 20) && (valor >= 10 )) 
			{
			est++;	
			}
			else 
			{
			nes++;	
			}
		}
		// exibindo a mensagem
		JOptionPane.showMessageDialog(null, "Números entre 10 e 20: " + est + "\n" + 
											"Números fora do intervalo entre 10 e 20: " + nes);
	}
}
