package quest3;

public abstract class Veiculo {
	protected float velocidade;
	
	public float acelerar(float velocidade) {
		return this.velocidade = velocidade; 
	}
	
	public void parar() {
		this.velocidade = 0.0f;
	}
}

