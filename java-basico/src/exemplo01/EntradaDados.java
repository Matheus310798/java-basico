package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar entrada de dados fornecido pelo usuário
 * 
 * @author mtomazs
 * @since 05/02/2021
 */
public class EntradaDados {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declarando variável
		String nome;

		// atribuir valor a variável nome informado pelo usuário
		nome = JOptionPane.showInputDialog("Digite o seu nome");

		// exibindo no console
		System.out.println("Seu nome é: " + nome);

	}

}
