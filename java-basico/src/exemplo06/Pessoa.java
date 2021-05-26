package exemplo06;

/**
 * Classe para demonstrar a utilização de objetos responsável por armazenar seus atributos e métodos
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
	
	// método para exibir os dados do objeto
	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Data de Nascimento: " + dataNascimento);
		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso);
		System.out.println("Sexo: " + sexo);
		System.err.println("Idade: " + calcularIdade());
		System.out.println(faixaEtaria());
	}
	
	// método para retornar a idade da pessoa
	public int calcularIdade() {
		// declarando a variavel de retorno do método
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
	
	// método para retornar se é maior de idade ou não
	public String faixaEtaria() {
		if (calcularIdade() >= 18) {
			return "Maior de idade";
		} else {
			return "Menor de Idade";
		}
	}
}
