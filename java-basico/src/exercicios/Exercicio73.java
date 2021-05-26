package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 n�meros e informar quantos est�o no intervalor entre 10 e 20 e quantos foras
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio73 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// declarando as vari�veis
		int valor, est, nes;
		
		// iniciando a vari�vel
		est = 0;
		nes = 0;
		
		// usu�rio declarando 10 valores
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
		JOptionPane.showMessageDialog(null, "N�meros entre 10 e 20: " + est + "\n" + 
											"N�meros fora do intervalo entre 10 e 20: " + nes);
	}
}
