package experiments;

public class Cachorro extends Mamifero {
	private String corCachorro; 

	public Cachorro(float cotaLeiteDiaria, String corCachorro) {
		super(cotaLeiteDiaria);
		this.corCachorro = corCachorro;
	}
	
	public float obterCotaLeite() {
		return cotaLeiteDiaria;
		
	}

}
