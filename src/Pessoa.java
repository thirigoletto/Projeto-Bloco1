/**
 * Classe que representa uma Pessoa.
 * Superclasse das classes Cliente e Funcionario.
 * Nenhum objeto do tipo Pessoa pode ser instanciado, pois a classe e abstrata.
 */
public abstract class Pessoa{
	private String nome, endereco, cpf;
	private int telefone;

	/**
     * Construtor da classe Pessoa.
     * Que recebe como parametros nome, endereco, cpf e telefone.
     * @param nome String - nome da pessoa.
     * @param endereco String - endereco da pessoa.
     * @param cpf String - CPF da pessoa.
     * @param telefone int - telefone da pessoa.
     */ 
	public Pessoa(String nome, String endereco, String cpf, int telefone){
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	/**
     * Metodo que retorna o nome da pessoa.
     * Ex. Felipe, Vanessa, Vitor, etc.
     * @return String - nome da pessoa.
     */
	public String getNome(){
		return nome;
	}

	/**
     * Metodo que retorna o endereco da pessoa.
     * Ex. Av. Doutor Sylvio Menicucci, 1001 - Kennedy, Lavras - MG, 37200-000.
     * @return String - endereco da pessoa.
     */
	public String getEndereco(){
		return endereco;
	}

	/**
     * Metodo que retorna o CPF da pessoa.
     * Ex. 12345678901.
     * @return String - cadastro de pessoa fisica da pessoa.
     */
	public String getCpf(){  
	    return cpf;
	}

	/**
     * Metodo que retorna o telefone da pessoa.
     * Ex. XX 1234 5678.
     * @return String - nome da pessoa.
     */
	public int getTelefone(){
		return telefone;
	}

  /**
   * Metodo que retorna uma descricao da pessoa.
   * @return String - descricao generica de uma pessoa.
   */
	@Override
	public String toString(){
		return "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nEndereco: " + getEndereco() + "\nTelefone: " + getTelefone();
	}
}