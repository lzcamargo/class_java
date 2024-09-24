package aulas;

public class Condutor {
	
	private String nomeCondutor;
	private long condutorCPF;
	private long condutorFone;
	Veiculo conduzVeiculo;
	
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
	
	//public Veiculo getVeiculo() {
	//	return veiculo;
	//}
}
