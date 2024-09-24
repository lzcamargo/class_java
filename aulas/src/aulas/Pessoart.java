package aulas;

public class Pessoart {
	public static void main( String[] args ) {
		Pessoar joao = new Pessoar();
		joao.nome = "João dos Santos";
		joao.setIdade(22);
		joao.setPeso(70.22);
		joao.cidade = "Araquari";
		
		System.out.println(joao.nome);
		System.out.println(joao.getIdade());
		System.out.println(joao.getPeso());
		System.out.println(joao.cidade);
	}

}
