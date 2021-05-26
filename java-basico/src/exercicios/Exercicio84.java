package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para o salário e os filhos, para a contagem quando for informado
 * número negativo e realizar a exibição de acordo com o enunciado.
 * 
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio84 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando variáveis
		double sal, medsal = 0, maior = 0, menor = 0;
		int filhos = 0, contador = 0;

		// recebendo a informação do usuário
		sal = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário:"));

		if (sal >= 0) // código para que seja armazenado dados antes de entrar no looping
		{
			filhos += Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de filhos:"));
			medsal += sal;
			maior = sal;
			if (sal < 150) {
				menor++;
			}
			contador++;
			while (sal >= 0) // código para entrar no looping e realizar a captura de dados
			{
				sal = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário:"));
				if (sal >= 0) {
					filhos += Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de filhos:"));
					medsal += sal;
					if (sal > maior) {
						maior = sal;
					}
					if (sal < 150) {
						menor++;
					}
					contador++;
				}
			}
		}

		// exibindo para o usuário
		if (contador != 0) // controlador para que nada seja exibido caso não informe nenhum dado dos
							// moradores
		{
			JOptionPane.showMessageDialog(null, "Média do salários: R$ " + (medsal / contador));
		} else {
			JOptionPane.showMessageDialog(null, "Operação finalizada");
		}
		JOptionPane.showMessageDialog(null, "Média do numero de filhos: " + (filhos / contador));
		JOptionPane.showMessageDialog(null, "Maior salário: R$ " + maior);
		JOptionPane.showMessageDialog(null,
				"Percentual de pessoas com salário menor que R$ 150,00: " + (menor / contador) * 100 + " %");
	}

}
