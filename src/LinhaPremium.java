/** 
 * Classe que representa a linha de veiculos Premium.
 * Este pode ser turbo.
 * Subclasse da classe Carro.
 * Implementa a interface Calculos.
 */
public class LinhaPremium extends Carro implements Calculos{
    private String isTurbo;
   
    /**
     * Construtor da classe LinhaPremium.
     * Que herda os parametros modelo e placa do carro.
     * @param modelo String - modelo do carro.
     * @param placa String - placa do carro.
     * E recebe como parametros isTurbo.
     * @param isTurbo String - se o carro da linha premium e ou nao turbo.
     */
    public LinhaPremium(String modelo, String placa, String isTurbo){
        super (modelo, placa);
        this.isTurbo = isTurbo; 
    }

    /**
     * Metodo que retorna se o carro da linha premium e ou nao turbo.
     * Ex. Sim ou nao.
     * @return String - e turbo.
     */
    public String getIsTurbo(){
        return isTurbo;
    }

    /**
     * Metodo que retorna o calculo do retorno financeiro de um carro da linha premium.
     * Metodo sobrescrito da interface Calculos.
     * @return double - valor total do retorno financeiro anual.
     */
    @Override
    public double calcRetornoFinanceiro(){
       return 3000 - calcCustoAnual();
    }
    
    /**
     * Metodo que retorna o calculo do custo anual de um carro da linha premium.
     * Metodo sobrescrito da interface Calculos.
     * @return double - valor total do custo anual.
     */
    @Override
    public double calcCustoAnual(){
        return 100 * 12;
    }

    /**
     * Metodo que retorna uma descricao de um caro da linha premium.
     * Metodo sobrescrito da superclasse Carro.
     * @return descricao completa de um carro da linha premium.
     */
    @Override
    public String toString(){
        return super.toString() + "\nO veiculo e turbo: " + getIsTurbo() + "\nRetorno financeiro: " + calcRetornoFinanceiro() + "\nCusto anual: " + calcCustoAnual();
    }
}