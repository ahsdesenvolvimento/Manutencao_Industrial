package manutecao;

/**
*
* André Henrique Sousa 
*/

public class Industria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lubrificador l1 = new Lubrificador("Humberto", 27, "Lubrificacao pelo Senai", 2.5);
		l1.Infomacoes();
		
		
		Mecanico m2 = new Mecanico("Joseberto", 34, "Tecnico Mecanico pela ETEC", 7.6);
		m2.Infomacoes();
		
		
		Soldador s3 = new Soldador("Doisberto", 41, "Soldador MIG pelo Senai", 10.8);
		s3.Infomacoes();
		
		//Executando o metodo realizar atividade
		l1.realizarAtividade();
		m2.realizarAtividade();
		s3.realizarAtividade();
	}

}
