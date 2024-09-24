package aulas;
//import java.util.*;

public class CondutorVeiculo {
	public	static	void	main(String[]	args) {
		Veiculo v = new Veiculo();
		v.setPlacaVeiculo("HT3WE4");
		v.setMarcaVeiculo("VW");
		v.setCorVeiculo("Azul");

		System.out.println(v.getPlacaVeiculo());
		System.out.println(v.getMarcaVeiculo());
		System.out.println(v.getCorVeiculo());
		
		Veiculo v2 = new Veiculo();
		v2.setPlacaVeiculo("DJK341");
		v2.setMarcaVeiculo("HONDA");
		v2.setCorVeiculo("PRATA");
		
		Condutor c = new Condutor();
		c.setNomeCondutor("João");
		c.setCondutorCPF(49023123848);
		c.setCondutorFone(9991169907);
		c.conduzVeiculo = v;
	  c.conduzVeiculo = v2;
		
		System.out.println(c.getNomeCondutor());
		System.out.println(c.getCondutorCPF());
		System.out.println(c.getCondutorFone());
		System.out.print(c.conduzVeiculo);  
		System.out.println(c.conduzVeiculo.getPlacaVeiculo());
				
	}
	
}
