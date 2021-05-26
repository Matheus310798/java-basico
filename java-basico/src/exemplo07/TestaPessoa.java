package exemplo07;

/**
 * Programa para testar o objeto pessoa
 * @author mtomazs
 *
 */
public class TestaPessoa {

	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// declarar e instanciar o objeto pessoa
		Pessoa joao = new Pessoa();
		
		// atribuindo os valores do objeto joao
		joao.setNome("João Almeida de Souza");
		
		// criando o objeto de data
		Data dataNascimento = new Data();
		
		//  inicializando a data do objeto joao
		dataNascimento.setDia(10);
		dataNascimento.setMes(02);
		dataNascimento.setAno(1985);
		
		// atribuindo valores de data para o objeto joao
		joao.setDataNascimento(dataNascimento);
		
		// atribuindo os valores do objeto
		joao.setSalarioFinal(2500.00);;
		
		// exibindo os dados do objeto joao
		System.out.println("Nome: " + joao.getNome());
		System.out.println("Data de Nascimento: " + joao.getDataNascimento());
		System.out.println(joao.getDataNascimento().faixaEtaria());
		System.out.println(joao.faixaSalarial());

	}

}
