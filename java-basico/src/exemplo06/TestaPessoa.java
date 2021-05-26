package exemplo06;

/**
 * Classe para demonstrar a utilização do objeto Pessoa
 * 
 * @author mtomazs
 * @since 17/02/2021
 */
public class TestaPessoa {

	/*
	 * Método pincipal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando o objeto Pessoa joao
		Pessoa joao;

		// inicializando o objeto joao (instancia de objeto)
		joao = new Pessoa();

		// qtribuindo os valores ao objeto joao
		joao.nome = "Jõao almeida";
		joao.dataNascimento = "23/05/1986";
		joao.altura = 85;
		joao.peso = 1.89;
		joao.sexo = "Masculino";

		// declarano o objeto pessoa maria
		Pessoa maria;

		// inicializando o objeto maria (instancia de objeto)
		maria = new Pessoa();

		// atribuindo valores ao objeto maria
		maria.nome = "Maria da Silva de Souza";
		maria.dataNascimento = "12/08/1985";
		maria.altura = 1.52;
		maria.peso = 65;
		maria.sexo = "Feminino";

		// exibindo os dados do objeto joao
		System.out.println("Nome: " + joao.nome);
		System.out.println("Data de nascimento: " + joao.dataNascimento);
		System.out.println("Altura: " + joao.altura);
		System.out.println("Peso: " + joao.peso);
		System.out.println("Sexo: " + joao.sexo);

		// pulando uma linha
		System.out.println("");
		
		// exibindo os dados do objeto Maria
		System.out.println("Nome: " + maria.nome);
		System.out.println("Data de nascimento: " + maria.dataNascimento);
		System.out.println("Altura: " + maria.altura);
		System.out.println("Peso: " + maria.peso);
		System.out.println("Sexo: " + maria.sexo);
		
		// pulando uma linha
		System.out.println("");
		
		// exibindo os dados do objeto joao
		joao.exibirDados();
		
		// pulando linha
		System.out.println("");
		
		// exibindo os dados do objeto maria
		maria.exibirDados();
	}
}