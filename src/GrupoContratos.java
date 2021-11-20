//Classe que armazena uma lista para os contratos
import java.util.ArrayList;

import javax.swing.JOptionPane;

	public class GrupoContratos {
	    private ArrayList<Contrato> grupoContratos;
	    
	    /**
	     * Construtor da classe GrupoContratos.
	     * Inicaliza o ArrayList. 
	     */
	    public GrupoContratos() {
	      grupoContratos = new ArrayList<>();
	    }

	    /**
	     * Metodo que adiciona um carro ao ArrayList.
	     * @param contrato Contrato - Contrato a ser adicionado no ArrayList.
	     */
	    public void addContrato(Contrato contrato) {
	      grupoContratos.add(contrato);
	    }

	    /**
	     * Metodo que imprime os contratos do ArrayList na tela.
	     */
	    public void listarContratos() {
	    	for(Contrato c: grupoContratos) {
				JOptionPane.showMessageDialog(null, c);
			}
	    }
	}

