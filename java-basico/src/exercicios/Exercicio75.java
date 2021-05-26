package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 notas e quantidade de alunos, ap�s isso calcular a m�dia das notas lidas
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio75 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// declarando as vari�veis
		int turma, nota; 
		double res;
		
		// iniciando
		res = 0;
		turma = 0;
		
		// usu�rio informando os valores
		do 
		{
			turma =Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de alunos "));
		} while (turma <= 0);
	
		for (int i = 1; i <= turma; i++) 
		{
			do {	
				nota = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor"));
			   } while ((nota < 0) || (nota > 10));
			res = res + nota;
		} 
		
		// exibindo a mensagem
		JOptionPane.showMessageDialog(null, "M�dia das notas: " + (res / turma));
	}
}
