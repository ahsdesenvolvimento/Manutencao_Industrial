package manutecao;

/**
*
* André Henrique Sousa 
*/


public class Colaborador implements ItimeManutecao {

	protected String nome;
	protected int idade;
	protected String formacao;
	protected double experiencia;
	
	public Colaborador() {
		this.nome = nome;
		this.idade = idade;
		this.formacao = formacao;
		this.experiencia =  experiencia;
		
	}
	public void Infomacoes() {
		System.out.println("\n\n\n======================== INFORMAÇÕES DO COLABORADOR =============================");
		System.out.println("\n Colaborador: "+this.nome+" idade: "+this.idade+" anos");
		System.out.println("\n Formado em "+this.formacao+" com experiencia de "+this.experiencia+" anos");
		System.out.println("========================================================================================");
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public double getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(double experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public void realizarAtividade() {
		getNome();
				// TODO Auto-generated method stub
		
	}
}

