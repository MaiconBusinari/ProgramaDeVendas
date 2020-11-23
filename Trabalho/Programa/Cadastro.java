package Programa;

import java.util.List;
import java.util.Scanner;

import Objeto.Cliente;
import DAO.ClienteDAO;

public class Cadastro {
	
	public static void cadastro(int opcao) {
		

		int id;
		String cpf, nome, telefone;
		
		
		Scanner leitor = new Scanner(System.in);
		ClienteDAO clienteDAO = new ClienteDAO();
		
		switch (opcao) {
		
		case 1 : {
			
			do {
				
				System.out.println("Informe o Cpf do Cliente:");
				cpf = leitor.nextLine();
				System.out.println("Informe o Nome do Cliente:");
				nome = leitor.nextLine();
				System.out.println("Informe o Telefone do Cliente:");
				telefone = leitor.nextLine();
				
				System.out.println("Cpf:" + cpf);
				System.out.println("Nome:" + nome);
				System.out.println("Telefone:" + telefone);
				
				Cliente cliente = new Cliente(cpf,nome,telefone);
		
				clienteDAO.salvar(cliente);
				System.out.println("Cliente Cadastrado com sucesso!!!");
				
				do {
					System.out.println("Deseja cadastrar mais um cliente? (1-Sim -- 2-Nao)");
					opcao = leitor.nextInt();
					leitor.nextLine();
				}while(opcao != 1 &&  opcao != 2);
				
			}while(opcao != 2);
			break;

				
		}
		
		case 2 : {
				
			List<Cliente> listaDeClientes = clienteDAO.listar();
			
			
			for (Cliente p : listaDeClientes) {
				System.out.println("------------------------------");
				System.out.println("Id: " + p.getId());
				System.out.println("Cpf: " + p.getCpf());
				System.out.println("Nome: " + p.getNome());
				System.out.println("Telefone: "  + p.getTelefone());
			}	
				System.out.println("------------------------------");
			
				do {
				
				System.out.println("Informe o id do Cliente que deseja Atualizar: ");
				id = leitor.nextInt();
				leitor.nextLine();
				System.out.println("Informe o Cpf atualizado do Cliente: ");
				cpf = leitor.nextLine();
				System.out.println("Informe o Nome atualizado do Cliente: ");
				nome = leitor.nextLine();
				System.out.println("Informe o Telefone atualizado do Cliente: ");
				telefone = leitor.nextLine();
				
				System.out.println("------------------------------");
				System.out.println("Cpf:" + cpf);
				System.out.println("Nome:" + nome);
				System.out.println("Telefone:" + telefone);
				System.out.println("------------------------------");
				
				Cliente cliente = new Cliente(id,cpf,nome,telefone);
		
				clienteDAO.atualizar(cliente);
				System.out.println("Cliente atualizado com sucesso!!!");
				
				do {
					System.out.println("Deseja atualizar mais um cliente? (1-Sim -- 2-Nao)");
					opcao = leitor.nextInt();
				}while(opcao != 1 &&  opcao != 2);
			
					}while(opcao != 2);
				break;

		}
		
		case 3 : {
			
			List<Cliente> listaDeClientes = clienteDAO.listar();
			
			
			for (Cliente p : listaDeClientes) {
				System.out.println("------------------------------");
				System.out.println("Id: " + p.getId());
				System.out.println("Cpf: " + p.getCpf());
				System.out.println("Nome: " + p.getNome());
				System.out.println("Telefone: "  + p.getTelefone());
			}	
				System.out.println("------------------------------");
			
				do {
				
				System.out.println("Informe o id do Cliente que deseja APAGAR: ");
				id = leitor.nextInt();
				leitor.nextLine();
		
				clienteDAO.apagar(id);;
				System.out.println("Cliente apagado com sucesso!!!");
				
				do {
					System.out.println("Deseja apagar mais um cliente? (1-Sim -- 2-Nao)");
					opcao = leitor.nextInt();
					
				}while(opcao != 1 &&  opcao != 2);
				
			}while(opcao != 2);
				break;

		}
		
		
}
		
	}
	
}
