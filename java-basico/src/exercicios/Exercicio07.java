package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber idade, altura e peso e exibir no console
 * 
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio07 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declarando variáveis
		int idade;
		double altura, peso;

		// recebendo os dados do usuário
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura:"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso"));

		// exibindo no console
		System.out.println("Sua idade é: " + idade + " anos" + "\n" + 
						   "Sua altura é: " + altura + " metros" + "\n" + 
						   "Seu peso é: " + peso + " Kg");

	}

}
