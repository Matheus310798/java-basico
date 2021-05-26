package exercicios;

/**
 * Programa para imprimir a tabuada do 1 ao 10 de 1 a 10.
 * 
 * @author mtomazs
 * @since 10/02/2021
 */
public class Exercicio85 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando variável para exibição
		String res;
		int ta, ma;

		// atribuindo a variável no cabeçalho
		res = "Tabuada do 1 ao 10\n ";

		// laços de repetição
		for (int i = 1; i < 11; i++) {
			// calculando o valor
			for (ma = 1; ma < 11; ma++) {
				ta = ma * i;
				res += +ma + " x " + i + " = " + ta + "\n";
			}
		}
		// exibindo o resultado
		System.out.println(res);
		;
	}
}