package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber a senha e o c�digo, e escrever se o acesso t� liberado
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio60 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		int n1, n2;
		
		// recebendo os dados do usu�rio
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o c�digo:"));
		
		// verifica��o do c�digo
		if (n1 == 1234) 
		{
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a senha:")); // verifica��o da senha caso o c�digo esteja correto
		
		if (n2 == 9999) {
		JOptionPane.showMessageDialog(null, "Acesso permitido"); // mensagem de acesso caso a senha esteja correta
		}
		
		else 
		{
		JOptionPane.showMessageDialog(null, "Senha incorreta");	// mensagem de senha incorreta
		}
		} 
		
		else 
		{
		JOptionPane.showMessageDialog(null, "Usu�rio inv�lido"); // mensagem caso o c�digo esteje incorreto
		}
	}
}