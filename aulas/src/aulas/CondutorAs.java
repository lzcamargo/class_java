package aulas;
import java.util.*;   

public class CondutorAs {
	private String nomeCondutor;
	private long condutorCPF;
	private long condutorFone;
	List <Veiculo> conduzVeiculos;
	
	public void setNomeCondutor(String nmcondutor) {
		nomeCondutor = nmcondutor;
	}
	
	public String getNomeCondutor() {
		return nomeCondutor;
	}
	
	public void setCondutorCPF(long condutorcpf) {
		condutorCPF = condutorcpf;
	}
	
	public long getCondutorCPF() {
		return condutorCPF;
	}
	
	public void setCondutorFone(long condfone) {
		condutorFone = condfone;
	}
	
	public long getCondutorFone() {
		return condutorFone;
	}

}
