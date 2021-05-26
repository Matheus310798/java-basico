package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler e armazenar em um vetor a temperatura da semana e exibir o
 * que pede
 * 
 * @author mtomazs
 * @since 12/02/2021
 */
public class Exercicio100 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando vari�veis
		double temp[];
		double menor = 1000;
		double maior = -1000;
		double soma = 0;
		double media;
		int contador = 0;

		// iniciando a vari�vel e definindo tamanho
		temp = new double[7];

		// recebendo as temperaturas da vari�vel temp
		for (int i = 0; i < temp.length; i++) {
			temp[i] = Double
					.parseDouble(JOptionPane.showInputDialog("Informe a temperatura do " + (i + 1) + "� dia da semana"));

			if (temp[i] < menor) {
				menor = temp[i];
			}
			if (temp[i] > maior) {
				maior = temp[i];
			}
		}

		// calculando a soma das temperaturas
		for (int i = 0; i < temp.length; i++) {
			soma += temp[i];
		}

		// m�dia
		media = soma / 7;

		// calculando dias com a temperatura inferior a m�dia semanal
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] < media) {
				contador++;
			}
		}

		// exibindo para o usu�rio
		System.out.println("Menor temperatura da semana: " + menor);
		System.out.println("Maior temperatura da semana: " + maior);
		System.out.println("Temperatura m�dia da semana: " + media);
		System.out.println("N�mero de dias da semana que a temperatura foi inferior a m�dia da semana :" + contador);
	}
}