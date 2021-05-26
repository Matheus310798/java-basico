package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber nome, celular e cidade e exibir no console
 * 
 * @author mtomazs
 * @since 05/02/2021
 *
 */
public class Exercicio06 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declarando variáveis
		String nome, celular, cidade;

		// recebendo os dados do usuário
		nome = JOptionPane.showInputDialog("Digite o seu nome:");
		celular = JOptionPane.showInputDialog("Informe seu celular:");
		cidade = JOptionPane.showInputDialog("Informe sua cidade:");

		// exibindo no console
		System.out.println("Seu nome é: " + nome + "\n" + 
						   "Seu celular é: " + celular + "\n" + 
						   "Sua cidade é: " + cidade);
				
	}

}
