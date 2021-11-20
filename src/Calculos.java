
	/** 
	 * Interface que representa os calculos relacionados a cada veiculo.
	 */
	public interface Calculos {

	    /**
	     * Metodo abstrato para o calculo do retorno financeiro dos carros.
	     * Ex. lucroAnual - custoAnual.
	     * @return double - calculo do retorno financeiro.
	     */ 
	    double calcRetornoFinanceiro();
	    
	    /**
	     * Metodo abstrato para o calculo do custo anual dos carros.
	     * Ex. custoMensal * 12 meses do ano.
	     * @return double - calculo do custo anual.
	     */
	    double calcCustoAnual();
	}


