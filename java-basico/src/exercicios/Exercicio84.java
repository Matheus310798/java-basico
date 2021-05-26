package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para o sal�rio e os filhos, para a contagem quando for informado
 * n�mero negativo e realizar a exibi��o de acordo com o enunciado.
 * 
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio84 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando vari�veis
		double sal, medsal = 0, maior = 0, menor = 0;
		int filhos = 0, contador = 0;

		// recebendo a informa��o do usu�rio
		sal = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio:"));

		if (sal >= 0) // c�digo para que seja armazenado dados antes de entrar no looping
		{
			filhos += Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de filhos:"));
			medsal += sal;
			maior = sal;
			if (sal < 150) {
				menor++;
			}
			contador++;
			while (sal >= 0) // c�digo para entrar no looping e realizar a captura de dados
			{
				sal = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio:"));
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

		// exibindo para o usu�rio
		if (contador != 0) // controlador para que nada seja exibido caso n�o informe nenhum dado dos
							// moradores
		{
			JOptionPane.showMessageDialog(null, "M�dia do sal�rios: R$ " + (medsal / contador));
		} else {
			JOptionPane.showMessageDialog(null, "Opera��o finalizada");
		}
		JOptionPane.showMessageDialog(null, "M�dia do numero de filhos: " + (filhos / contador));
		JOptionPane.showMessageDialog(null, "Maior sal�rio: R$ " + maior);
		JOptionPane.showMessageDialog(null,
				"Percentual de pessoas com sal�rio menor que R$ 150,00: " + (menor / contador) * 100 + " %");
	}

}
