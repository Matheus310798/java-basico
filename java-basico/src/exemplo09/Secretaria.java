package exemplo09;

/**
 * Classe para armazenar os atributos e métodos do objeto secretaria e herdar de
 * funcionário
 * 
 * @author mtomazs
 * @since 23/02/2021
 */
public class Secretaria extends Funcionario {

	// atributos de secretária
	private int ramal;

	// método para acessar o atributo
	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
	
	// método para exibir os dados
	public void mostrarDados() {
		super.mostarDados();
		System.out.println("Ramal: " + ramal);
	}
	
	
}
