package associa;

public class Transacao {
	private double valor;
  private String data;

  public Transacao(double valorInicial, String dataInicial) {
      valor = valorInicial;
      data = dataInicial;
  }

  public double getValor() {
      return valor;
  }

  public String getData() {
      return data;
  }

}
