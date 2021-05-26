package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar entrada de dados fornecido pelo usu�rio
 * 
 * @author mtomazs
 * @since 05/02/2021
 */
public class EntradaDados {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declarando vari�vel
		String nome;

		// atribuir valor a vari�vel nome informado pelo usu�rio
		nome = JOptionPane.showInputDialog("Digite o seu nome");

		// exibindo no console
		System.out.println("Seu nome �: " + nome);

	}

}
