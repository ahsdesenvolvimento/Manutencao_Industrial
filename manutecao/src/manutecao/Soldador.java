package manutecao;

/**
*
* André Henrique Sousa 
*/

public class Soldador extends Colaborador {

	public Soldador(String nome, int idade,
			String formacao, double experiencia) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.formacao = formacao;
		this.experiencia = experiencia;
	}

@Override
public void realizarAtividade() {
	System.out.println("\n\n********************************** EM ATIVIDADE ***************************************");
	System.out.println("\n                  "+this.nome+" esta soldando componente da máquina");
	System.out.println("\n*****************************************************************************************");
	
}
}

