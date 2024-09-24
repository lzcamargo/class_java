package experiments;

public abstract class Mamifero {
	protected float cotaLeiteDiaria;

	public Mamifero(float cotaLeiteDiaria) {
		this.cotaLeiteDiaria = cotaLeiteDiaria;
	}
	
	public float obterCotaLeite() {
		return cotaLeiteDiaria;
	}

}
