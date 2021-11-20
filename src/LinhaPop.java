/** 
 * Classe que representa a linha de veiculos Popular. 
 * Esta possui modelos com o preco em conta e pode ter ar condicionado.
 * Subclasse da classe Carro.
 * Implementa a interface Calculos.
 */
public class LinhaPop extends Carro implements Calculos{
    private String isArCondicionado;    

    /**
     * Construtor da classe LinhaPop.
     * Que herda os parametros modelo e placa do carro.
     * @param modelo String - modelo do carro.
     * @param placa String - placa do carro.
     * E recebe como parametro isArCondicionado.
     * @param isArCondicionado String - se o carro da linha popular possui ou nao ar condicionado.
    */
    public LinhaPop(String modelo, String placa, String isArCondicionado){
        super (modelo, placa);
        this.isArCondicionado = isArCondicionado;
    }

    /**
     * Metodo que retorna se o carro da linha popular possui ou nao ar condicionado.
     * Ex. Sim ou nao.
     * @return String - possui ar condicionado.
     */
    public String getIsArCondicionado(){
        return isArCondicionado;
    }

    /**
     * Metodo que retorna o calculo do retorno financeiro de um carro da linha popular.
     * Metodo sobrescrito da interface Calculos.
     * @return double - valor total do retorno financeiro anual.
     */
    @Override
    public double calcRetornoFinanceiro(){
        return 1500 - calcCustoAnual();
    }
    
    /**
     * Metodo que retorna o calculo do custo anual de um carro da linha popular.
     * Metodo sobrescrito da interface Calculos.
     * @return double - valor total do custo anual.
     */@Override
    public double calcCustoAnual(){
        return 50 * 12;
    }

    /**
     * Metodo que retorna uma descricao de um caro da linha popular.
     * Metodo sobrescrito da superclasse Carro.
     * @return descricao completa de um carro da linha popular.
     */
    @Override
    public String toString(){
        return super.toString() + "\nPossui ar condicionado: " + getIsArCondicionado() + "\nRetorno financeiro: " + calcRetornoFinanceiro() + "\nCusto anual: " + calcCustoAnual();
    }
}