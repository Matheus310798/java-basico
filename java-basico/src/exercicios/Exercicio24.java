package exercicios;

import javax.swing.JOptionPane;

/**
 * Receber as notas do aluno, efetuar a operação com os pesos e exibir o resultado.
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio24 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		double n1, n2, n3, nota1, nota2, nota3, notaf;
		
		// recebendo informação do usuário
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 1º nota"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 2º nota"));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 3º nota"));
		
		
		// operação
		nota1 = n1 * 2;
		nota2 = n2 * 3;
		nota3 = n3 * 5;
		notaf = nota1 + nota2 + nota3;
		
		
		// exibindo para o usuário
		JOptionPane.showMessageDialog(null, "Média final: " + (notaf / 10));

	}

}
