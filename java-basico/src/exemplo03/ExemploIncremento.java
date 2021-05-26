package exemplo03;

/**
 * Programa para demonstar a utiliza��o de Incremento e Decremento de valores
 * @author mtomazs
 * @since 10/02/2021
 */
public class ExemploIncremento {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Definindo as vari�veis
		int numero;
		
		// atribuindo valores as vari�veis
		numero = 1;
		
		System.out.println(numero); // exibindo valor 1
		
		numero = numero + 1;
		
		System.out.println(numero); // exibindo valor 2
		
		numero++; // incremento
		
		System.out.println(numero); // exibindo valor 3
		
		System.out.println(numero++); // exibindo valor 3
		
		System.out.println(numero); // exibindo valor 4
		
		System.out.println(++numero); // exibindo valor 5
	}

}
