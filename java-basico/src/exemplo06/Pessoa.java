package exemplo06;

/**
 * Classe para demonstrar a utiliza��o de objetos respons�vel por armazenar seus atributos e m�todos
 * 
 * @author mtomazs
 *@since 17/02/2021
 */
public class Pessoa {
	
	// atributos ou caracteristicas do objeto
	String nome;
	String dataNascimento;
	double altura;
	double peso;
	String sexo;
	
	// m�todo para exibir os dados do objeto
	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Data de Nascimento: " + dataNascimento);
		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso);
		System.out.println("Sexo: " + sexo);
		System.err.println("Idade: " + calcularIdade());
		System.out.println(faixaEtaria());
	}
	
	// m�todo para retornar a idade da pessoa
	public int calcularIdade() {
		// declarando a variavel de retorno do m�todo
		int idade = 0;
		
		// variavel para armazenar o ano de nascimento
		int anoNascimento = 0;
		int anoAtual = 2021;
		
		// quebrando a data do tipo string
		String dataQuebrada[] = dataNascimento.split("/");
		anoNascimento = Integer.parseInt(dataQuebrada[2]);
		
		// calculando a idade do objeto
		idade = anoAtual - anoNascimento;
		
		// retornando a idade calculada
		return idade;
	}
	
	// m�todo para retornar se � maior de idade ou n�o
	public String faixaEtaria() {
		if (calcularIdade() >= 18) {
			return "Maior de idade";
		} else {
			return "Menor de Idade";
		}
	}
}
