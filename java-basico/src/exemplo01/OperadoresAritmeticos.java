package exemplo01;

/**
 * Programa para demonstrar operações aritméticas
 * 
 * @author mtomazs
 * @since 05/02/2021
 *
 */
public class OperadoresAritmeticos {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando variáveis
		int adicao;
		int subtracao;
		int multiplicacao;
		double divisao;
		int modulo;

		// exemplo das contas
		adicao = 10 + 5;
		subtracao = 10 - 5;
		multiplicacao = 24 * 3;
		divisao = 25 / 6;
		modulo = 10 % 3;

		// exibindo no console
		System.out.println("10 + 5 = " + adicao);
		System.out.println("10 - 5 = " + subtracao);
		System.out.println("24 * 3 = " + multiplicacao);
		System.out.println("25 / 6 = " + divisao);
		System.out.println("10 % 3 = " + modulo);

	}

}
