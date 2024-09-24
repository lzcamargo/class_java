public class ProfessorHorista extends Professor {
	protected float valorHora;
	protected int totalHoras;

	public ProfessorHorista(String nmProf, int matrProf, float vlrHora, int qtdHoras) {
		super(nmProf, matrProf);
		if (qtdHoras > 0) totalHoras = qtdHoras;
		if (vlrHora > 0) valorHora = vlrHora;
	}
	
	public float retornaSalario() {
		float salario = valorHora * totalHoras;
		return salario - (salario * 0.16f);
	
	}

}
