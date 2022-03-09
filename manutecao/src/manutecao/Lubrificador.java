package manutecao;

/**
*
* André Henrique Sousa 
*/

public class Lubrificador extends Colaborador {

	public Lubrificador(String nome, int idade,
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
	System.out.println("\n                  "+nome+" esta lubrificando componente da máquina");
	System.out.println("\n*****************************************************************************************");
	
}
}