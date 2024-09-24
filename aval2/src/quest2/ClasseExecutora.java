package quest2;

public class ClasseExecutora {

	public static void main(String[] args) {
		Produto produto = new Produto("Batata Inglesa", 11, 10.0f, false);
		
		System.out.println(produto);
		
		//atribuir preço conforme regra
		
		produto.alterarPrecoInativo();
		
		
		//produto.setQtdEstoqueProduto(0);
		
		System.out.println(produto);

	}

}
