package exemplo09;

/**
 * Classe para armazenar os aributos de professor herdando os dados de
 * funcionário (herança)
 * 
 * @author mtomazs
 * @since 23/02/2021
 */
public class Professor extends Funcionario implements InterfaceFuncionario {
	
	// atributos do objeto professor
	private String materia;

	// métodos para acessar o atributo
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	// método para exibir os dados 
	public void mostrardados() {
		super.mostarDados();
		System.out.println("Matéria: " + materia);
	}

	@Override
	public void salvar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void consultar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar() {
		// TODO Auto-generated method stub
		
	}

}
