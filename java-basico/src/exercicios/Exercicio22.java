package exercicios;

import javax.swing.JOptionPane;

/**
 * Receber os dados, calcular o salário final e exibir o resultado.
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio22 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		double cv, vtv, sal, com, n1, n2, sf;
		
		// recebendo informação do usuário
		cv = Double.parseDouble(JOptionPane.showInputDialog("Informe o número de carros vendidos:"));
		vtv = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total de vendas"));
		sal = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário-fixo:"));
		com = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da comissão fixa por carro:"));
		
		// operação
		n1 = com * cv;
		n2 = 0.05 * vtv;
		sf = n2 + n1 + sal;
		
		// exibindo para o usuário
		JOptionPane.showMessageDialog(null, "Seu salário final é: R$ " + sf);

	}

}
