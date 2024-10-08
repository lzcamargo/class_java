package exerc01;

public abstract class Produto {
	protected String produtoSKU;
	protected String produtoDesc;

	public Produto(String produtoSKU, String produtoDesc) {
		this.produtoSKU = produtoSKU;
		this.produtoDesc = produtoDesc;
	}
	
	public abstract float calcularPreco(); 

	
	public String obterDadosProduto() {
		return produtoSKU + produtoDesc;
	}

}
