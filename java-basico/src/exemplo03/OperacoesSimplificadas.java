package exemplo03;

/**
 * Programa para demontrar cálculos aritméticos simplificados
 * @author mtomazs
 * @since 10/02/2021
 */
public class OperacoesSimplificadas {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// definindo variáveis
		int i;
		
		// inicializando a variavel com valor 10
		i = 10;
		
		// operação de adição
		i = i + 2;
		System.out.println(i); // exibindo valor 12
		
		// operação de adição simplificada
		i += 2;
		System.out.println(i); // exibindo valor 14
		
		// operação de subtração
		i = i - 2;
		System.out.println(i); // exibindo valor 12
				
		// operação de subtração simplificada
		i -= 2;
		System.out.println(i); // exibindo valor 10
		
		// mesma ideia da divisão, multiplicação e módulo

	}

}
