public class InstanciaProfessor {

	public static void main(String[] args) {
		ProfessorIntegral profInt1 = new ProfessorIntegral("João Maria", 55478, 6500.65f);
		ProfessorHorista profHor1 = new ProfessorHorista("Maria João", 87455, 56.78f, 15);
		
		System.out.println(profInt1.nomeProfessor);
		System.out.println(profInt1.retornaSalario());
		
		System.out.println(profInt1.retornaNomeProf());
		System.out.println(profInt1.retornaMatricula());
		
		System.out.println(profInt1.retornaSalario());
				
		System.out.println(profHor1.nomeProfessor);
		System.out.println(profHor1.retornaSalario());
		
		
		
	}

}
