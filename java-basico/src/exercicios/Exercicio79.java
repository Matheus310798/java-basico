package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular e escrever a m�dia aritm�tica dos n�meros inteiros
 * entre 14 e 100 incluindo eles.
 * 
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio79 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando vari�veis
		double media, contador;

		// iniciando as vari�veis
		media = 0;
		contador = 0;

		// la�os de repeti��o
		for (int i = 15; i <= 100; i++) {
			media += i;
			contador++;
		}
		// exibindo para o usu�rio
		JOptionPane.showMessageDialog(null, "M�dia � igual: " + (media / contador));
	}

}
