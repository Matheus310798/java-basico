package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um valor de 1 a 10 calcular e imprimir a tabuada do 1 a 10.
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio71 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// declarando vari�vel
		int tabuada, calculo;
		String resultado;
	
		
		// iniciando a variav�l
		tabuada = 0;
		
		// recebendo o valor do usu�rio entre 1 e 10
		while ((tabuada <= 0) || (tabuada > 10)) {
			tabuada = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero"));
		}
		
		// valorizando o cabe�alho
		resultado = "Tabuada do " + tabuada + "\n";
		
		// la�o de repeti��o
		for (int i = 1; i < 11; i++) {
			calculo = tabuada * i;
			resultado += tabuada + " x " + i + " = " + calculo + "\n";
		}
		// exibindo para o usu�rio
		JOptionPane.showMessageDialog(null, resultado);
	
	}
}