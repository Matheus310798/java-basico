package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber a senha e o código, e escrever se o acesso tá liberado
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio60 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		int n1, n2;
		
		// recebendo os dados do usuário
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o código:"));
		
		// verificação do código
		if (n1 == 1234) 
		{
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a senha:")); // verificação da senha caso o código esteja correto
		
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
		JOptionPane.showMessageDialog(null, "Usuário inválido"); // mensagem caso o código esteje incorreto
		}
	}
}