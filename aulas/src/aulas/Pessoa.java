package aulas;

public class Pessoa {
	public String nome;
	private int idade;
	private double peso;
	protected String cidade;
	
	public static void main( String[] args ) {
		Pessoa joao = new Pessoa();
		joao.nome = "Joao da silva";
		joao.idade = 45;
		joao.peso = 72.520;
		joao.cidade = "Joinville";
		
		System.out.println(joao.nome);
		System.out.println(joao.idade);
		// System ...
		
	}

}

