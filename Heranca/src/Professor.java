public abstract class Professor {

	protected String nomeProfessor;
	protected int matriculaProfessor;
	
	public Professor(String nmProf, int matrProf) {
		nomeProfessor = nmProf;
		matriculaProfessor = matrProf;
	}
	
	public String retornaNomeProf() { 
		return nomeProfessor; 
	}
	public int retornaMatricula() { 
		return matriculaProfessor; 
	}
	
	public float retornaSalario() {
		return 0; 
	}


}
