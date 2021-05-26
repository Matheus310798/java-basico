package exercicios;

import javax.swing.JOptionPane;

/**
 * Usuário indicar o número de moedas de cada valor e exibir o total economizado
 * @author mtomazs
 * @since 05/02/2021
 */
public class Exercicio33 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as variáveis
		double v1, v2, v3, v4, v5, v6, v11, v12, v13, v14, v15, vt;
		
		// recebendo informação do usuário
		v1 = Double.parseDouble(JOptionPane.showInputDialog("Moedas de 1 centavo:"));
		v2 = Double.parseDouble(JOptionPane.showInputDialog("Moedas de 5 centavos:"));
		v3 = Double.parseDouble(JOptionPane.showInputDialog("Moedas de 10 centavos:"));
		v4 = Double.parseDouble(JOptionPane.showInputDialog("Moedas de 25 centavos:"));
		v5 = Double.parseDouble(JOptionPane.showInputDialog("Moedas de 50 centavos:"));
		v6 = Double.parseDouble(JOptionPane.showInputDialog("Moedas de 1 real:"));
		
		// operação
		v11 = v1 * 0.01;
		v12 = v2 * 0.05;
		v13 = v3 * 0.10;
		v14 = v4 * 0.25;
		v15 = v5 * 0.50;
		vt = (v6 + v15 + v14 + v13 + v12 + v11);
		
		// exibindo para o usuário
		JOptionPane.showMessageDialog(null, "Valor total economizado: R$ " + vt);

	}

}
