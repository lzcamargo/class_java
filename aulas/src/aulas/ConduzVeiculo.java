package aulas;
import java.util.*;  
import java.util.ArrayList;

public class ConduzVeiculo {
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
		c.setCondutorCPF(49023101952L);
		c.setCondutorFone(9991169934L);
		
		List<Veiculo> veiculos = new ArrayList<Veiculo>();  
		veiculos.add(v);
	  veiculos.add(v2);
		  
		System.out.println(c.getNomeCondutor());
		System.out.println(c.getCondutorCPF());
		System.out.println(c.getCondutorFone());
		System.out.println(v.getPlacaVeiculo());
		System.out.println(v2.getPlacaVeiculo());
		System.out.println(v2);

		
				
	}


}
