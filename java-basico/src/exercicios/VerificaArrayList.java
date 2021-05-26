package exercicios;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

import exemplo05.BuscarValorVetorString;

/**
 * Classe respons�vel pelo sistema de Arraylist do tipo String, realizando o
 * controller de uma lista de nomes
 * 
 * @author mtomazs
 * @since 26/02/2021
 */
public class VerificaArrayList {

	// declararando uma lista de String
	private ArrayList<String> nomes;

	// construtor da classe
	public VerificaArrayList() {
		nomes = new ArrayList<String>();
		menu();

	}

	// m�todo para criar o menu de op��es
	public void menu() {

		String menu = "======= BEM VINDO AO SISTEMA DE NOMES =======\n\n";
		menu += "1 - CADASTRAR NOME\n";
		menu += "2 - EXCLUIR NOME\n";
		menu += "3 - LISTAR NOMES CADASTRADOS\n";
		menu += "4 - LISTAR NOMES EM ORDEM ALFAB�TICA\n";
		menu += "5 - LISTAR NOMES IGUAIS\n";
		menu += "6 - LISTAR NOMES POR LETRA INICIAL\n";
		menu += "7 - PESQUISAR NOME\n";
		menu += "8 - SAIR DO SISTEMA\n";

		while (true) {
			try {
				int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
				processamento(opcao);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Informe uma op��o v�lida", RotuloString.sistemaNome, 0);
			}
		}
	}

	// m�todo para controlar o processamento do programa
	public void processamento(int opcao) {
		switch (opcao) {
		case 1: {
			cadastrarNome();
			break;
		}

		case 2: {
			excluirNome();
			break;
		}

		case 3: {
			listarNomes();
			break;
		}

		case 4: {
			listarNomesOrdemAlfabetica();
			break;
		}

		case 5: {
			listarNomesIguais();
			break;
		}

		case 6: {
			listarNomesLetraInicial();
			break;
		}

		case 7: {
			pesquisarNome();
			break;
		}

		case 8: {
			sair();
			break;
		}
		default:
			JOptionPane.showMessageDialog(null, "Op��o inv�lida", RotuloString.sistemaNome, 0);
			break;
		}
	}

	// 1 - m�todo para cadastrar nome
	public void cadastrarNome() {
		if (nomes.size() < 10) {
			String nome = JOptionPane.showInputDialog("Informe o nome");
			if (nome.trim().isEmpty() || (nome.length() < 2)) {
				JOptionPane.showMessageDialog(null, "Informe um nome v�lido", RotuloString.sistemaNome, 2);
				menu();
			}
			if (!nome.matches("[A-Z a-z�������������������������������]*")) {
				JOptionPane.showMessageDialog(null, "Informe um nome v�lido", RotuloString.sistemaNome, 2);
				menu();
			} else {
				JOptionPane.showMessageDialog(null, "Usu�rio cadastrado", RotuloString.sistemaNome, 1);
				nomes.add(nome);
				menu();
			}
		}
		if (nomes.size() >= 10) {
			JOptionPane.showMessageDialog(null, "Limite de usu�rios atingidos", RotuloString.sistemaNome, 0);
			menu();
		}
	}

	// 2 - m�todo para excluir nome
	public void excluirNome() {
		String mensagem = "";
		int contador = 1;
		boolean auxiliar = false;
		boolean retirado = false;

		// verifica se possui nomes cadastrados
		if (nomes.size() > 0) {
			while (auxiliar == false) {
				// mostrar os nomes da lista
				for (String variavel : nomes) {
					mensagem += "C�digo: " + contador + " - Nome: " + variavel + "\n";
					contador++;
				}
				// recebendo do usuario o nome para retirar
				int codigoRetirar = Integer.parseInt(
						JOptionPane.showInputDialog(mensagem + "\nInforme o c�digo do nome que deseja retirar"));
				// laco para encontrar o nome desejado
				for (int i = 1; i <= nomes.size(); i++) {
					if (codigoRetirar == i) {
						nomes.remove(nomes.get(i - 1));
						retirado = true;
					}
				}
				// exibe em tela
				if (retirado) {
					auxiliar = true;
					JOptionPane.showMessageDialog(null, "Nome exlu�do com sucesso", RotuloString.sistemaNome, 1);
				} else {
					JOptionPane.showMessageDialog(null, "Informe um c�digo v�lido", RotuloString.sistemaNome, 0);
					// apaga a mensagem em caso de erro
					mensagem = "";
					// reinicia o contador
					contador = 1;
				}
			}
		} else {
			// exibe lista vazia
			JOptionPane.showMessageDialog(null, "N�o possui usu�rio cadastrado", RotuloString.sistemaNome, 2);
		}
	}

	// 3 - m�todo para listar nomes cadastrados
	public void listarNomes() {
		String mensagem = "";
		boolean existe = false;

		for (int i = 0; i < nomes.size(); i++) {
			mensagem += (nomes.get(i) + "\n");
			existe = true;
		}

		if (existe) {
			JOptionPane.showMessageDialog(null, "=======Nomes cadastrados=======\n" + mensagem,
					RotuloString.sistemaNome, 1);
		} else {
			JOptionPane.showMessageDialog(null, "O sistema n�o possui usu�rios cadastrados", RotuloString.sistemaNome,
					2);
		}
	}

	// 4 - m�todo para listar nomes em ordem alfab�tica
	public void listarNomesOrdemAlfabetica() {
		ArrayList<String> novoArray = new ArrayList<String>(nomes);

		String mensagem = "";
		boolean existe = false;

		for (int i = 0; i < novoArray.size(); i++) {
			novoArray.replaceAll(String::toUpperCase); // transformando tudo em maiusculo para definir melhor em ordem
														// alfabetica
			Collections.sort(novoArray);
			mensagem += (novoArray.get(i) + "\n");
			existe = true;
		}

		if (existe) {
			JOptionPane.showMessageDialog(null, "====Nomes em ordem Alfab�tica====\n" + mensagem,
					RotuloString.sistemaNome, 1);
		} else {
			JOptionPane.showMessageDialog(null, "O sistema n�o possui usu�rios cadastrados", RotuloString.sistemaNome,
					2);
		}
	}

	// 5 - m�todo para listar nomes iguais
	public void listarNomesIguais() {
		// declarando variaveis auxiliares.
		boolean existe = false;
		String msg = "";
		// varrendo a lista de nomes e agrupando os iguais
		for (int i = 0; i < nomes.size(); i++) {
			// contando quantas vezes o nome agrupado se repetiu na lista
			int quantidade = Collections.frequency(nomes, nomes.get(i));
			if (quantidade > 1) {
				existe = true;
				// concatenando mensagem para apresenta��o
				msg += "O nome repetido � : " + nomes.get(i) + "  \n";
				msg += "Com um total de : " + quantidade + " repeti��es  \n\n";
				i += (quantidade - 1);
				existe = true;
			}

		}

		if (existe) {// se existe apresentar em tela a lista de nomes repetidos
			JOptionPane.showMessageDialog(null, msg, RotuloString.sistemaNome, 1);
		} else {// se n�o existe apresentar em tela a mensagem de erro ( n�o existe cadastro de
				// nome).
			JOptionPane.showMessageDialog(null, "O sistema n�o possui nomes cadastrados ou nomes repetidos",
					RotuloString.sistemaNome, 0);
		}
		// fim do m�todo
	}

	// 6 - m�todo para listar nomes por letra inicial
	public void listarNomesLetraInicial() {
		String mensagem = "Nomes:\n";
		int contador = 0;
		String comparador;
		String valor = "";
		boolean executa = true;

		if (nomes.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Lista vazia", RotuloString.sistemaNome, 2);
		} else {
			while (executa) {
				valor = JOptionPane.showInputDialog(null, "Informe uma letra", RotuloString.sistemaNome, 3);

				if ((valor.length() > 1)) {
					JOptionPane.showMessageDialog(null, "Informe apenas 1 letra", RotuloString.sistemaNome, 2);
				} else if (!valor.matches("[A-Z a-z]")) {
					JOptionPane.showMessageDialog(null, "Digite uma letra v�lida", RotuloString.sistemaNome, 2);
				} else {

					for (String letra : nomes) {
						comparador = (letra.substring(0, 1));
						if (valor.equals(comparador)) {
							mensagem += "\n" + ++contador + " - " + letra;
							executa = false;
						}
					}
					if (executa) {
						JOptionPane.showMessageDialog(null,"Sistema n�o possui nomes cadastrados com essa inicial", RotuloString.sistemaNome, 2);
						menu();
					}

				}
			}
			JOptionPane.showMessageDialog(null, mensagem, RotuloString.sistemaNome, 1);
		}
	}

	// 7 - m�todo para pesquisar nome
	public void pesquisarNome() {
		//declarando variavel auxiliar de mensagem.
				String auxiliar = "";
				auxiliar = JOptionPane.showInputDialog(null, "Informe nome para pesquisa", RotuloString.sistemaNome, 1);
				if (nomes.contains(auxiliar)) {//se existe apresentar em tela a lista de nomes repetidos
					JOptionPane.showMessageDialog(null, "Nome : " + auxiliar + " encontrado", RotuloString.sistemaNome, 1);
				} else {// se n�o  existe apresentar em tela a mensagem de erro ( n�o existe cadastro de nome).
					JOptionPane.showMessageDialog(null, "Nome n�o encontrado",RotuloString.sistemaNome,  0);
				}
	}

	// 8 - m�todo para sair do sistema
	public void sair() {
		int opcao = JOptionPane.showConfirmDialog(null, "Deseja encerrar o sistema?", "Aten��o", JOptionPane.YES_OPTION,
				JOptionPane.CANCEL_OPTION);

		if (opcao == JOptionPane.YES_OPTION) {
			System.exit(0);
		}

	}

	// m�todo principal para executar a classe
	public static void main(String[] args) {
		new VerificaArrayList();
	}

}
