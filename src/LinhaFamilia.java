/** 
 * Classe que representa a linha de veiculos Familia.
 * Este pode ter uma capacidade de pessoas maior que outros modelos.
 * Subclasse da classe Carro.
 * Implementa a interface Calculos.
 * 
 */
public class LinhaFamilia extends Carro implements Calculos{
    private int capPessoas;

    /**
     * Construtor da classe LinhaFamilia.
     * Que herda os parametros modelo e placa do carro.
     * @param modelo String - modelo do carro.
     * @param placa String - placa do carro.
     * E recebe como parametros capPessoas e idF.
     * @param capPessoas int - capacidade de pessoas do carro da linha familia.
     */
    public LinhaFamilia(String modelo, String placa, int capPessoas){
        super (modelo, placa);
        this.capPessoas = capPessoas;
    }
  
    /**
     * Metodo que retorna a capacidade de pessoas do carro da linha familia.
     * Ex. 5.
     * @return int - capacidade de pessoas.
     */
    public int getCapPessoas(){
        return capPessoas;
    }

    /**
     * Metodo que retorna o calculo do retorno financeiro de um carro da linha familia.
     * Metodo sobrescrito da interface Calculos.
     * @return double - valor total do retorno financeiro anual.
     */
    @Override
    public double calcRetornoFinanceiro(){
        return 2000 - calcCustoAnual();
    }
    
    /**
     * Metodo que retorna o calculo do custo anual de um carro da linha familia.
     * Metodo sobrescrito da interface Calculos.
     * @return double - valor total do custo anual.
     */
    @Override
    public double calcCustoAnual(){
        return 75 * 12;
    }

    /**
     * Metodo que retorna uma descricao de um caro da linha familia.
     * Metodo sobrescrito da superclasse Carro.
     * @return descricao completa de um carro da linha familia.
     */
    @Override
    public String toString(){
        return super.toString() + "\nCapacidade de pessoas: " + getCapPessoas() + "\nRetorno financeiro: " + calcRetornoFinanceiro() + "\nCusto anual: " + calcCustoAnual();
    }
}
