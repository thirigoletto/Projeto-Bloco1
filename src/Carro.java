/** 
 * Classe que repesenta um carro.
 * Superclasse das classes LinhaFamilia, LinhaPop e LinhaPremium.
 * Nenhum objeto do tipo Carro pode ser instanciado, pois a classe e abstrata.
 */
public abstract class Carro {
  private String modelo, placa;
 
  /**
   * Construtor da classe Carro.
   * Que recebe como parametros o tipo, modelo, cor, ano e placa do carro.
   * @param modelo String - modelo do carro.
   * @param placa String - placa do carro.
   */ 
  public Carro (String modelo, String placa) {
    this.modelo = modelo;
    this.placa = placa;
  }

  /**
   * Metodo que retorna o modelo do carro.
   * Ex. BWM M5, Mercedes CLC 200, Honda Accord, etc.
   * @return String - modelo do carro.
   */
  public String getModelo() {
    return modelo;
  }
       
  /**
   * Metodo que retorna a placa do carro.
   * Ex. ABC 1234, etc.
   * @return String - tipo do carro.
   */
  public String getPlaca() {
    return placa;
  }

  /**
   * Metodo que retorna uma descricao do carro.
   * @return String - descricao generica de um carro.
   */
  @Override
  public String toString() {
    return "Modelo: " + getModelo() + "\nPlaca: " + getPlaca();
  }
}