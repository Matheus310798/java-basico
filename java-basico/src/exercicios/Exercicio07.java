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
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declarando vari�veis
		int idade;
		double altura, peso;

		// recebendo os dados do usu�rio
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura:"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso"));

		// exibindo no console
		System.out.println("Sua idade �: " + idade + " anos" + "\n" + 
						   "Sua altura �: " + altura + " metros" + "\n" + 
						   "Seu peso �: " + peso + " Kg");

	}

}
