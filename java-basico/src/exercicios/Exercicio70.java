package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular e imprimir a tabuada do 8 de 1 a 10.
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio70 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// declarando variável para exibição
		String res;
		int ta;
		
		// atribuindo a variável no cabeçalho
		res = "Tabuada do 8\n ";
		
		// laços de repetição
			for (int i = 1; i < 11; i++) {
				// calculando o valor
				ta = 8 * i;
				res += "8 x " + i + " = " + ta + "\n";
	}
		// exibindo o resultado
		JOptionPane.showMessageDialog(null, res);
	}
}