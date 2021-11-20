/** 
 * Classe que representa um Funcionario.
 * Subclasse da classe Pessoa.
 */
public class Funcionario extends Pessoa {
	private String cargo;

    /**
     * Construtor da classe Funcionario, que retorna uma nova instancia de um Funcionario.
     * Que herda os parametros nome, endereco, cpf e telefone.
     * @param nome String - nome da pessoa.
     * @param endereco String - endereco da pessoa.
     * @param cpf String - CPF da pessoa.
     * @param telefone int - telefone da pessoa.
     * E recebe como parametro cargo.
     * @param cargo String - cargo do funcionario.
     */
	public Funcionario(String nome, String endereco, String cpf, int telefone, String cargo) {
		super(nome, endereco, cpf, telefone);
		this.cargo = cargo;
	}

    /**
     * Metodo que retorna o cargo do funcionario.
     * Ex. Atendente, gerente, etc.
     * @return String - cargo do funcionario.
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Metodo que retorna uma descricao do funcionario.
     * Metodo sobrescrito da superclasse Pessoa.
     * @return String - descricao completa de um funcionario.
     */
    @Override
    public String toString(){
    	return super.toString() + "\nCargo: " + getCargo();
    }
}