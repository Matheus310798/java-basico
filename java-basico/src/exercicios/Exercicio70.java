package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular e imprimir a tabuada do 8 de 1 a 10.
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio70 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// declarando vari�vel para exibi��o
		String res;
		int ta;
		
		// atribuindo a vari�vel no cabe�alho
		res = "Tabuada do 8\n ";
		
		// la�os de repeti��o
			for (int i = 1; i < 11; i++) {
				// calculando o valor
				ta = 8 * i;
				res += "8 x " + i + " = " + ta + "\n";
	}
		// exibindo o resultado
		JOptionPane.showMessageDialog(null, res);
	}
}