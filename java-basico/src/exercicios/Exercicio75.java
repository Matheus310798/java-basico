package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 notas e quantidade de alunos, após isso calcular a média das notas lidas
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio75 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// declarando as variáveis
		int turma, nota; 
		double res;
		
		// iniciando
		res = 0;
		turma = 0;
		
		// usuário informando os valores
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
		JOptionPane.showMessageDialog(null, "Média das notas: " + (res / turma));
	}
}
