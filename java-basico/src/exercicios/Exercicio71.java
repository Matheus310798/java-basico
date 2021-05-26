package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um valor de 1 a 10 calcular e imprimir a tabuada do 1 a 10.
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio71 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// declarando variável
		int tabuada, calculo;
		String resultado;
	
		
		// iniciando a variavél
		tabuada = 0;
		
		// recebendo o valor do usuário entre 1 e 10
		while ((tabuada <= 0) || (tabuada > 10)) {
			tabuada = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
		}
		
		// valorizando o cabeçalho
		resultado = "Tabuada do " + tabuada + "\n";
		
		// laço de repetição
		for (int i = 1; i < 11; i++) {
			calculo = tabuada * i;
			resultado += tabuada + " x " + i + " = " + calculo + "\n";
		}
		// exibindo para o usuário
		JOptionPane.showMessageDialog(null, resultado);
	
	}
}