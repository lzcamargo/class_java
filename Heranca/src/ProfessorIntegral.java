public class ProfessorIntegral extends Professor {
	protected float valorSalario; 

	public ProfessorIntegral(String nmProf, int matrProf, float vlrSalario) {
		super(nmProf, matrProf);
		if (vlrSalario > 0)
			valorSalario = vlrSalario;
	}
	
	public float retornaSalario() {
		return valorSalario - (valorSalario * 0.16f);
	}
	

}
