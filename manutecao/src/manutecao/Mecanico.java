package manutecao;

/**
*
* André Henrique Sousa 
*/
public class Mecanico extends Colaborador {

	public Mecanico(String nome, int idade,
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
		System.out.println("\n                  "+nome+" esta realizando manutenção em componente mecânico");
		System.out.println("\n*******************************************************************************************");
	}
}