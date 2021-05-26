package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler uma quantidade e a seguir ler a quantidade de n�meros,
 * escrever o maior e a m�dia dos n�meros lidos
 * 
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio82 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando as vari�veis
		int qt = 0;
		double n1, maior, media = 0;

		// recebendo a informa��o do usu�rio para armazenar os dados
		do {
			qt = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
		} while (qt <= 0);
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o n�mero"));
		maior = n1;
		media += n1;

		// ap�s armazenar os valores do maior e media, c�digo para entrar no looping
		for (int i = 1; i < qt; i++) {
			n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o n�mero"));
			if (n1 > maior) {
				maior = n1;
			}
			media += n1;
		}
		// exibindo os valor para o usu�rios
		JOptionPane.showMessageDialog(null, "Maior n�mero: " + maior + "\n" + "M�dia dos n�meros: " + (media / qt));
	}

}
