package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler as informções do usuário e indicar se ele está apto ou não a se aposentar, de acordo com as indicações.
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio63 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		int co, an, ae, res1, res2;
		
		// recebendo as informações do usuário
		co = Integer.parseInt(JOptionPane.showInputDialog("Número do empregado:"));
		an = Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento completo:"));
		ae = Integer.parseInt(JOptionPane.showInputDialog("Ano que ingressou na empresa:"));
		
		// operação 
		res1 = 2021 - ae;
		res2 = 2021 - an;
		
		// exibindo para o usuário
		if ((res2 >= 65) || (res1 >= 30)) 
		{
		JOptionPane.showMessageDialog(null, "Requer aposentadoria");	
		}
		
		else if ((res2 >= 60) && (res1 >= 25))
		{
		JOptionPane.showMessageDialog(null, "Requer aposentadoria");
		}
		
		else 
		{
		JOptionPane.showMessageDialog(null, "Não requerer");	
		}
	}
}