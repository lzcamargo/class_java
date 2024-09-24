package associa;

public class ContaCorrente {
	private int numero;
  private double saldo;
  private Transacao[] transacoes;
  private int indice;

  public ContaCorrente(int numeroInicial) {
      numero = numeroInicial;
      saldo = 0;
      transacoes = new Transacao[20];
      indice = 0;
  }

  public boolean debitar(Transacao valor) {
      if (valor.getValor() >= 0) {
          return false;
      }
      saldo += valor.getValor();
      transacoes[indice] = valor;
      indice++;
      return true;
  }

  public boolean creditar(Transacao valor) {
      if (valor.getValor() <= 0) {
          return false;
      }
      saldo += valor.getValor();
      transacoes[indice] = valor;
      indice++;
      return true;
  }

  public int getNumero() {
      return numero;
  }

  public double getSaldo() {
      return saldo;
  }

  public Transacao[] extrato() {
      return transacoes;
  }

}
