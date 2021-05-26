package exemplo03;

/**
 * Programa para demontrar c�lculos aritm�ticos simplificados
 * @author mtomazs
 * @since 10/02/2021
 */
public class OperacoesSimplificadas {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// definindo vari�veis
		int i;
		
		// inicializando a variavel com valor 10
		i = 10;
		
		// opera��o de adi��o
		i = i + 2;
		System.out.println(i); // exibindo valor 12
		
		// opera��o de adi��o simplificada
		i += 2;
		System.out.println(i); // exibindo valor 14
		
		// opera��o de subtra��o
		i = i - 2;
		System.out.println(i); // exibindo valor 12
				
		// opera��o de subtra��o simplificada
		i -= 2;
		System.out.println(i); // exibindo valor 10
		
		// mesma ideia da divis�o, multiplica��o e m�dulo

	}

}
