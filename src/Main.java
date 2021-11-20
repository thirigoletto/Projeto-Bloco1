//Classe Principal do programa AlugaCar, responsável por executar os menus do programa.
import java.util.Scanner;
import javax.swing.*;

public class Main{
    private static Scanner input = new Scanner(System.in);

    private static GrupoCarros grupoCarros;
    private static GrupoPessoas grupoPessoas;
    private static GrupoContratos grupoContratos;

    private static Carro carro;
    private static Pessoa pessoa, pessoaF;
    private static Contrato contrato;

    private static String tipo, modelo, placa, isArCondicionado, isTurbo, dataDevolucao;
    private static String nome, endereco, cpf, cargo, idFuncionario, idCliente;
    private static int telefone, capPessoas;
    private static double valorFinal;
    
    /** 
     * Metodo principal(main), responsavel pela interacao com o usuario.
     *  @param args - parametros recebidos durante a chamada da aplicacao.
     */
    public static void main(String[] args) {
        grupoCarros = new GrupoCarros();
        grupoPessoas = new GrupoPessoas();
        grupoContratos = new GrupoContratos();
        
        int opcao1 = 0;
        
       JOptionPane.showMessageDialog(null,"Bem vindo ao Sistema de Aluguel de Carros.");
        
        do{
            opcao1 = opcoesMenu();
        }while(opcao1 != 4); 
    }

    /**
     * Metodo que exibe um primeiro menu para o usuario
     * Serao dadas opcoes de 1 a 4 para o usuario escolher
     * @return int - opcao do menu escolhida pelo usuario
     */
    private static int menuPrincipal(){
        
    	int opcao1 =  Integer.parseInt(JOptionPane.showInputDialog("\n--------------Menu principal--------------" + "\nEscolha uma opcao: "
    															+ "\n1- Pessoas" + "\n2- Carros" + "\n3- Contratos" + "\n4- Sair"));
    	
    	
    	
        //Retorna opcao escolhida
        return opcao1;
    }
    
    /**
     * Metodo que exibe o menu pessoa para o usuario.
     * @param entidade String - opcao escolhida, pessoa.
     * @return int - opcao do menu escolhida.
     */
    private static int menuPessoa(String entidade){
    	int opcao2 =  Integer.parseInt(JOptionPane.showInputDialog(	"\n------------------ Menu "+" " + entidade +" " + " ------------------"+
        "\n1-Cadastrar cliente" +
        "\n2-Cadastrar funcionario" +
        "\n3-Remover" +
        "\n4-Listar" +
        "\n5-Voltar"));
    	
    
        //Le a opcao escolhida pelo usuario
        //Retorna opcao escolhida
        return opcao2;
    }
    
    /**
     * Metodo que exibe o menu carros para o usuario.
     * @param entidade String - opcao escolhida, carros.
     * @return int - opcao do menu escolhida.
     */
    private static int menuCarros(String entidade){
        int opcao2 = Integer.parseInt(JOptionPane.showInputDialog("\n------------------ Menu "+" "+entidade+" "+" ------------------"+
        "\n1-Cadastrar linha familia"+
        "\n2-Cadastrar linha popular"+
        "\n3-Cadastrar linha premium"+
        "\n4-Remover"+
        "\n5-Listar"+
        "\n6-Voltar"));
        //Le a opcao escolhida pelo usuario
        //Retorna opcao escolhida
        return opcao2;
    }

    /**
     * Metodo que exibe o menu contratos para o usuario.
     * @param entidade String - opcao escolhida, contratos.
     * @return int - opcao do menu escolhida.
     */
    private static int menuContratos(String entidade){
        int opcao2 = Integer.parseInt(JOptionPane.showInputDialog("\n------------------ Menu "+ entidade + " ------------------" +
        "\n1-Cadastrar"+
        "\n2-Listar"+
        "\n3-Voltar"));
        //Le a opcao escolhida pelo usuario
        //Retorna opcao escolhida
        return opcao2;
    }
    
    /**
     * Metodo principal chamado na execucao do programa.
     */
    private static int opcoesMenu(){
        int opcao1 = 0;
        int opcao2 = 0;

        opcao1 = menuPrincipal();
        switch (opcao1){
            case 1:
                do{
                    opcao2 = menuPessoa("pessoa");
                    switch (opcao2){
                        case 1:
                            cadastrarCliente();
                        break;
                        case 2:
                            cadastrarFuncionario();
                        break;
                        case 3:
                            removerPessoa();
                        break;
                        case 4:
                            grupoPessoas.listarPessoas();
                        break;
                        case 5:
                            //Case para não cair em opção inválida quando digitar para voltar
                        break;
                        default:
                        	JOptionPane.showMessageDialog(null, "Opção Inválida.");
                        	//System.out.println("\nOpcao invalida!");
                        break;
                    }
                }while(opcao2 != 5);
                return 2;
            case 2:
                do{
                    opcao2 = menuCarros("carro");
                    switch (opcao2){
                        case 1:
                            cadastrarCarroFamilia();
                        break;
                        case 2:
                             cadastrarCarroPop();
                        break;
                        case 3:
                            cadastrarCarroPremium();
                        break;
                        case 4:
                            removerCarro();
                        break;
                        case 5:
                            grupoCarros.listarCarros();
                        break;
                        case 6:
                            //Case para não cair em opção inválida quando digitar para voltar
                        break;
                        default:
                        	JOptionPane.showMessageDialog(null, "Opção Inválida.");
                        break;
                    }
                }while(opcao2 != 6);
                return 2;
            case 3:
                do{
                    opcao2 = menuContratos("contrato");
                    switch (opcao2){
                        case 1:
                            cadastrarContrato();
                        break;
                        case 2:
                            grupoContratos.listarContratos();
                        break;
                        case 3:
                            //Case para não cair em opção inválida quando digitar para sair
                        break;
                        default:
                        	JOptionPane.showMessageDialog(null, "Opção Inválida.");
                        break;
                    }
                }while(opcao2 != 3);
                return 2;
            case 4:
                return 4; //Case para não cair em opção inválida quando digitar para sair
            default:
            	JOptionPane.showMessageDialog(null, "Opção Inválida.");
                return 2;
        }
    }
    
    /**
     * Metodo para cadastro de carro da linha familia.
     * O metodo faz chamada ao metodo addCarro, presente na classe GrupoCarros.
     */
    private static void cadastrarCarroFamilia(){
    	JOptionPane.showMessageDialog(null, "\nEntre com os dados do carro família");
    	modelo = JOptionPane.showInputDialog("Modelo: ");
    	placa = JOptionPane.showInputDialog("Placa: ");
    	capPessoas =Integer.parseInt(JOptionPane.showInputDialog("Capacidade de Pessoas: "));
        carro = new LinhaFamilia(modelo, placa, capPessoas);
        grupoCarros.addCarro(carro);
    }

    /**
     * Metodo para cadastro de carro da linha popular.
     * O metodo faz chamada ao metodo addCarro, presente na classe GrupoCarros.
     */
    private static void cadastrarCarroPop(){
       	JOptionPane.showMessageDialog(null,"\nEntre com os dados do carro pop");
       	modelo = JOptionPane.showInputDialog("Modelo: ");
     	placa = JOptionPane.showInputDialog("Placa: ");
     	isArCondicionado = JOptionPane.showInputDialog("Ar condicionado: ");
        carro = new LinhaPop(modelo, placa, isArCondicionado);
        grupoCarros.addCarro(carro);
    }
    
    /**
     * Metodo para cadastro de carro da linha premium.
     * O metodo faz chamada ao metodo addCarro, presente na classe GrupoCarros.
     */
    private static void cadastrarCarroPremium(){
       
    	JOptionPane.showMessageDialog(null,"\nEntre com os dados do carro premium");
       	modelo = JOptionPane.showInputDialog("Modelo: ");
       	placa = JOptionPane.showInputDialog("Placa: ");
    	isTurbo = JOptionPane.showInputDialog("Turbo: ");
        carro = new LinhaPremium(modelo, placa, isTurbo);
        grupoCarros.addCarro(carro);
    }
    
    /**
     * Metodo que remove um carro.
     * O metodo faz chamada ao metodo removerCarro, presente na classe GrupoCarros.
     */
    private static void removerCarro() {
       placa = JOptionPane.showInputDialog("Entre com a placa do carro: ");
    	
        if(grupoCarros.removerCarro(placa)) {
            JOptionPane.showMessageDialog(null, "Remoção realizada com sucesso.");
        	
        	/**System.out.print("Remocao realizada com sucesso.");
            System.out.println();**/
        } else {
        	 JOptionPane.showMessageDialog(null, "Erro carro inexistente.");
        }
    }

    /**
     * Metodo para cadastro de cliente.
     * O metodo faz chamada ao metodo addPessoa, presente na classe GrupoPessoas.
     */
    private static void cadastrarCliente(){
    	JOptionPane.showMessageDialog(null, "Entre com os dados pedidos: ");
    	nome = JOptionPane.showInputDialog("Nome: ");
    	endereco = JOptionPane.showInputDialog("Endereço: ");
    	cpf = JOptionPane.showInputDialog("CPF: ");
    	tipo = JOptionPane.showInputDialog("Tipo: ");
    	telefone = Integer.parseInt(JOptionPane.showInputDialog("Telefone: "));
    	pessoa = new Cliente(nome, endereco, cpf, telefone, tipo);
        grupoPessoas.addPessoa(pessoa);
    }

    /**
     * Metodo para cadastro de funcionario.
     * O metodo faz chamada ao metodo addPessoa, presente na classe GrupoPessoas.
     */
    private static void cadastrarFuncionario(){
    	JOptionPane.showMessageDialog(null, "Entre com os dados pedidos: ");
    	nome = JOptionPane.showInputDialog("Nome: ");
    	endereco = JOptionPane.showInputDialog("Endereço: ");
    	cpf = JOptionPane.showInputDialog("CPF: ");
    	cargo = JOptionPane.showInputDialog("Cargo: ");
    	telefone = Integer.parseInt(JOptionPane.showInputDialog("Telefone: "));
    	pessoa = new Funcionario(nome, endereco, cpf, telefone, cargo);
        grupoPessoas.addPessoa(pessoa);
    	
    }
    /**
     * Metodo que remove uma pessoa.
     * O metodo faz chamada ao metodo removerPessoa, presente na classe GrupoPessoas.
     */
    private static void removerPessoa() {
    	cpf = JOptionPane.showInputDialog("Entre com o CPF: ");
    	 if(grupoPessoas.removerPessoa(cpf)) {
             JOptionPane.showMessageDialog(null, "Remoção realizada com sucesso.");
         } else {
        	 JOptionPane.showMessageDialog(null, "Erro: Pessoa inexistente.");
         }
    }

    /**
     * Metodo para cadastro de contratos.
     * O metodo faz chamada ao metodo addcontrato, presente na classe GrupoContratos
     * Faz a verificacao dos resultados que o metodo pode retornar, e exibe uma mensagem ao usuario.
     */
    private static void cadastrarContrato(){
       JOptionPane.showMessageDialog(null, "Entre com os dados pedidos");
       idFuncionario = JOptionPane.showInputDialog("Identificação do funcionário: ");
       pessoaF = grupoPessoas.buscarPessoa(idFuncionario);
       if (pessoa == null){
           JOptionPane.showMessageDialog(null, "Erro: Funcionário inexistente.");
           return;
       }
       placa = JOptionPane.showInputDialog("Placa do carro: ");
       carro = grupoCarros.buscarCarro(placa);
       if (carro == null){
           JOptionPane.showMessageDialog(null, "Erro: carro inexistente.");
           return;
       }
       idCliente = JOptionPane.showInputDialog("Identificação do cliente: ");
       pessoa = grupoPessoas.buscarPessoa(idCliente);
       if (pessoa == null){
           JOptionPane.showMessageDialog(null, "Erro: Cliente inexistente.");
           return;
       }
       dataDevolucao = JOptionPane.showInputDialog("Data da entrega do veículo: ");
       valorFinal = Double.parseDouble(JOptionPane.showInputDialog("Valor da locação: "));
       contrato = new Contrato(carro, pessoaF, pessoa, dataDevolucao, valorFinal);
       grupoContratos.addContrato(contrato);
      
    }
}