/** 
 * Classe que representa um Contrato.
 */
public class Contrato {
  private Carro carro;
  private Pessoa cliente, funcionario;
  private String dataDevolucao;
  private double valorFinal;

 /**
  * Construtor da classe Contrato, que retorna uma nova instancia de um contrato.
  * @param carro Carro - carro do contrato.
  * @param cliente Pessoa - cliente do contrato.
  * @param funcionario Pessoa - funcionario do contrato.
  * @param dataDevolucao String - data de devolucao que consta no contrato.
  * @param valorFinal double - valor total do contrato.
  */
  public Contrato(Carro carro, Pessoa cliente, Pessoa funcionario, String dataDevolucao, double valorFinal) {
    this.carro = carro;
    this.cliente = cliente;
    this.funcionario = funcionario;
    this.dataDevolucao = dataDevolucao;
    this.valorFinal = valorFinal;
  }

  /**
   * Metodo que retorna a placa do carro.
   * Ex. ABC 1234, etc.
   * @return String - placa do carro.
   */
  public String getIdCarro() {
    return carro.getPlaca();
  }

  /**
   * Metodo que retorna o CPF do cliente.
   * Ex. 12345678912.
   * @return String - CPF do cliente.
   */
  public String getIdCliente() {
    return cliente.getCpf();
  }
  
  /**
   * Metodo que retorna o CPF do funcionario.
   * Ex. 12345678912.
   * @return String - CPF do funcionario.
   */
  public String getIdFuncionario() {
    return funcionario.getCpf();
  }

  /**
   * Metodo que retorna a data de devolucao do carro.
   * Ex. 26/12/2018.
   * @return String - data de devolucao do carro.
   */
  public String getDataDevolucao() {
    return dataDevolucao;
  }
  
  /**
   * Metodo que retorna o valor final do contrato.
   * Ex. 100,00.
   * @return double - valor final do contrato.
   */
  public double getValorFinal() {
    return valorFinal;
  }
  
  /**
   * Metodo que retorna uma descricao do contrato.
   * @return String - descricao generica de um contrato.
   */
  @Override
  public String toString() {
    return "\nContrato de prestacao de servicos. \nIdentificacao do carro: " + getIdCarro() + "\nCPF do cliente: " + getIdCliente() + "\nCPF do funcionario: " + getIdFuncionario() + "\nData de devolucao: " + getDataDevolucao() + "\nValor total: " + getValorFinal();
  }
}