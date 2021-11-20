
	/** 
	 * Classe que representa um cliente.
	 * Subclasse da classe Pessoa.
	 */
	public class Cliente extends Pessoa{   
	    private String tipo;
		
	   /**
	    * Construtor da classe Cliente, que retorna uma nova instancia de um cliente.
	    * Que herda os parametros nome, endereco, cpf e telefone.
	    * @param nome String - nome da pessoa.
	    * @param endereco String - endereco da pessoa.
	    * @param cpf String - CPF da pessoa.
	    * @param telefone int - telefone da pessoa.
	    * E recebe como parametro tipo.
	    * @param tipo String - tipo de cliente.
	    */ 
		public Cliente(String nome, String endereco, String cpf, int telefone, String tipo){
			super(nome, endereco, cpf, telefone);
			this.tipo = tipo;
		}

	    /**
	     * Metodo que retorna a categoria do cliente.
	     * Ex. Premium, estudante, etc.
	     * @return String - tipo do cliente.
	     */
	    public String getTipo(){
	    	return tipo;
	    }

	    /**
	     * Metodo que retorna uma descricao do cliente.
	     * Metodo sobrescrito da superclasse Pessoa.
	     * @return String - descricao completa de um cliente.
	     */
	    @Override
	    public String toString(){
	        return super.toString() + "\nTipo: " + getTipo();
	    }
	}

