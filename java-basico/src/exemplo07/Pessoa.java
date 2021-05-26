package exemplo07;

/**
 * Classe para armazenar os atributos e m�todos do objeto Pessoa
 * @author mtomazs
 * @since 17/02/2021
 */
public class Pessoa {

	
	// declarando os atributos da pessoa
	private String nome;
	private Data dataNascimento;
	private double salario;
	
	// m�todos para acessar os atributos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Data getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Data dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalarioFinal(double salario) {
		this.salario= salario;
	}
	
	// m�todo para verificar se o sal�rio esta acima ou abaixo do sal�rio
	public String faixaSalarial() {
		if (salario <= 1163.55) {
			return "Abaixo do sal�rio m�nimo";
		} else {
			return "Acima do salario m�nimo";
		}
	}
}
