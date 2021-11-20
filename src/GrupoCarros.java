/**
 * Classe que representa os carros da empresa.
 * Armazena informacoes de cada carro em uma lista.
 */
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GrupoCarros {
	private ArrayList<Carro> grupoCarros;

    /**
     * Construtor da classe GrupoCarros.
     * Inicializa o ArrayList.
     */
	public GrupoCarros() {
		grupoCarros = new ArrayList<>();
	}

    /**
     * Metodo que adiciona um carro ao ArrayList.
     * @param carro Carro - carro a ser adicionado no ArrayList.
     */
	public void addCarro(Carro carro) {
		grupoCarros.add(carro);
	}

    /**
     * Metodo que imprime os carros do ArrayList na tela.
     */
	public void listarCarros() {
		for(Carro c: grupoCarros) {
			JOptionPane.showMessageDialog(null, c);
		}
		
		
		/**System.out.println();
		for(Carro c: grupoCarros) {
			System.out.println(c);
            System.out.println();**/
		}
	

    /**
     * Metodo que remove um carro do ArrayList.
     * @param placa String - placa do carro a ser removido.
     * @return boolean - remove o carro.
     */
    public boolean removerCarro(String placa) {
        Carro c;
        c = buscarCarro(placa); 
        if (c != null) {           
            grupoCarros.remove(c);
            return true;         
        }
        return false;          
    }

    /** 
     * Metodo que busca um carro no ArrayList.
     * @param id String - identificacao do veiculo a ser procurado.
     * @return Carro - carro buscado.
     */
    public Carro buscarCarro(String id) {
        for (Carro c: grupoCarros) {
            Carro carro = (Carro)c;                       
            String placa = carro.getPlaca();   
            if (placa.equals(id)) {        
                return c;                             
            }
        }
        return null;                                  
    }
}