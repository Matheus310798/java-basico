package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler as inform��es do usu�rio e indicar se ele est� apto ou n�o a se aposentar, de acordo com as indica��es.
 * @author mtomazs
 * @since 09/02/2021
 */
public class Exercicio63 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		int co, an, ae, res1, res2;
		
		// recebendo as informa��es do usu�rio
		co = Integer.parseInt(JOptionPane.showInputDialog("N�mero do empregado:"));
		an = Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento completo:"));
		ae = Integer.parseInt(JOptionPane.showInputDialog("Ano que ingressou na empresa:"));
		
		// opera��o 
		res1 = 2021 - ae;
		res2 = 2021 - an;
		
		// exibindo para o usu�rio
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
		JOptionPane.showMessageDialog(null, "N�o requerer");	
		}
	}
}