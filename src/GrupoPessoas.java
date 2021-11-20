/**
 * Classe que representa todas as pessoas cadastradas no sistema.
 * Armazena informacoes de cada pessoa em uma lista.
**/
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GrupoPessoas {
	private ArrayList<Pessoa> grupoPessoas;

    /**
     * Construtor da classe GrupoPessoas.
     * Inicializa o ArrayList.
     */
	public GrupoPessoas() {
		grupoPessoas = new ArrayList<>();
	}

    /**
     * Metodo que adiciona uma pessoa ao ArrayList.
     * @param pessoa Pessoa - pessoa a ser adicionada ao ArrayList.
     */
	public void addPessoa(Pessoa pessoa) {
		grupoPessoas.add(pessoa);
	}

    /**
     * Metodo que imprime as pessoas do ArrayList na tela.
     */
	public void listarPessoas() {
		for(Pessoa p: grupoPessoas) {
			JOptionPane.showMessageDialog(null, p);
		}
	}
	

    /**
     * Metodo que remove uma pessoa do ArrayList.
     * @param cpf String - CPF da pessoa a ser removida.
     * @return boolean - remove a pessoa.
     */
    public boolean removerPessoa(String cpf) {
        Pessoa p;
        p = buscarPessoa(cpf); 
        if (p != null) {           
            grupoPessoas.remove(p);
            return true;         
        }
        return false;          
    }

    /** 
     * Metodo que busca uma pessoa no ArrayList.
     * @param id String - identificacao da pessoa a ser procurada.
     * @return Pessoa - pessoa buscada.
     */
    public Pessoa buscarPessoa(String id) {
        for (Pessoa p: grupoPessoas) {
            Pessoa pessoa = (Pessoa)p;                       
            String cpf = pessoa.getCpf();   
            if (cpf.equals(id)) {        
                return p;                             
            }
        }
        return null;                                  
    }
}