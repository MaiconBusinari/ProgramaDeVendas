package Programa;

import java.util.List;
import java.util.Scanner;
import DAO.VendaDAO;
import Objeto.Venda;

public class Consulta {

	public static void consulta(int opcao) {
		
		int id, qtdeP, parc;
		String cpf, data, formaDePgto;
		double preco;
		
		Scanner leitor = new Scanner(System.in);
		VendaDAO vendaDAO = new VendaDAO();
		
		switch (opcao) {
		
		case 1 : {
			do {
				
				System.out.println("Informe o Cpf do Cliente que efeutou a compra:");
				cpf = leitor.nextLine();
				System.out.println("Informe o Data da compra");
				data = leitor.nextLine();
				System.out.println("Informe o preco total da compra");
				preco = leitor.nextDouble();
				leitor.nextLine();
				System.out.println("Informe a quantidade de pagas");
				qtdeP = leitor.nextInt();
				leitor.nextLine();
				System.out.println("Informe a quantida de parcelas");
				parc = leitor.nextInt();
				leitor.nextLine();
				System.out.println("Informe a forma de pagamento");
				formaDePgto = leitor.nextLine();
				
				System.out.println("Cpf: " + cpf);
				System.out.println("Data: " + data);
				System.out.println("Preco total: " + preco);
				System.out.println("Parcelas pagas: " + qtdeP);
				System.out.println("Total de parcelas: " + parc);
				System.out.println("Forma de pagamento: " + formaDePgto);
				
				Venda venda = new Venda(cpf,data,preco,qtdeP,parc,formaDePgto);
				vendaDAO.salvar(venda);
		
				System.out.println("Nova venda cadastrada com sucesso!!!");
				
				do {
					System.out.println("Deseja cadastrar mais vendas? (1-Sim -- 2-Nao)");
					opcao = leitor.nextInt();
					leitor.nextLine();
				}while(opcao != 1 &&  opcao != 2);
			
			}while(opcao != 2);
			break;
		}									
		
		case 2 : {
			
			List<Venda> listaVenda = vendaDAO.listar();
			
			
			for (Venda p : listaVenda) {
				System.out.println("------------------------------");
				System.out.println("Id: " + p.getId());
				System.out.println("Cpf: " + p.getCpf());
				System.out.println("Data: " + p.getData());
				System.out.println("Preco total: "  + p.getPrecoTotal());
				System.out.println("Parcelas pagas: "  + p.getQtdePagas());
				System.out.println("Total de parcelas: "  + p.getParcelamento());
				System.out.println("Forma de pagamento: "  + p.getFormaPagamento());
			}	
				System.out.println("------------------------------");
				
				do {
					
					System.out.println("Informe o id da venda que deseja Atualizar: ");
					id = leitor.nextInt();
					leitor.nextLine();
					System.out.println("Informe o Cpf atualizado do Cliente que efetuou a compra: ");
					cpf = leitor.nextLine();
					System.out.println("Informe a data atualizada de quando a compra foi realizada: ");
					data = leitor.nextLine();
					System.out.println("Informe o preco total atualizado da compra: ");
					preco = leitor.nextDouble();
					leitor.nextLine();
					System.out.println("Informe o a quantidade atualizada de parcelas pagas: ");
					qtdeP = leitor.nextInt();
					leitor.nextLine();
					System.out.println("Informe a quantida de parcelas que a compra foi feita: ");
					parc = leitor.nextInt();
					leitor.nextLine();
					System.out.println("Informe a forma de pagamento: ");
					formaDePgto = leitor.nextLine();
					
					System.out.println("------------------------------");
					System.out.println("Id: " + id);
					System.out.println("Cpf: " + cpf);
					System.out.println("Data: " + data);
					System.out.println("Preco total: " + preco);
					System.out.println("Parcelas pagas: " + qtdeP);
					System.out.println("Total de parcelas: " + parc);
					System.out.println("Forma de pagamento: " + formaDePgto);
					System.out.println("------------------------------");
					
					Venda venda = new Venda(id,cpf,data,preco,qtdeP,parc,formaDePgto);
			
					vendaDAO.atualizar(venda);
					System.out.println("Venda atualizado com sucesso!!!");
					
					do {
						System.out.println("Deseja atualizar mais uma venda? (1-Sim -- 2-Nao)");
						opcao = leitor.nextInt();
						leitor.nextLine();
					}while(opcao != 1 &&  opcao != 2);
				
					leitor.nextLine();
					
				}while(opcao != 2);
			
				break;

		}
		case 3 : {
				List<Venda> listaVenda = vendaDAO.listar();
			
			
			for (Venda p : listaVenda) {
				System.out.println("------------------------------");
				System.out.println("Id: " + p.getId());
				System.out.println("Cpf: " + p.getCpf());
				System.out.println("Data: " + p.getData());
				System.out.println("Preco total: "  + p.getPrecoTotal());
				System.out.println("Parcelas pagas: "  + p.getQtdePagas());
				System.out.println("Total de parcelas: "  + p.getParcelamento());
				System.out.println("Forma de pagamento: "  + p.getFormaPagamento());
			}	
				System.out.println("------------------------------");
				do {
				
				System.out.println("Informe o id da venda que deseja dar baixa: ");
				id = leitor.nextInt();
				leitor.nextLine();
		
				vendaDAO.apagar(id);;
				System.out.println("Venda foi baixada com sucesso!!!");
				
				do {
					System.out.println("Deseja dar baixa em mais uma venda? (1-Sim -- 2-Nao)");
					opcao = leitor.nextInt();
					leitor.nextLine();
					
				}while(opcao != 1 &&  opcao != 2);
			
				leitor.nextLine();
				
			}while(opcao != 2);
				break;

		}
		
		case 4 : {
				List<Venda> listaVenda = vendaDAO.listar();
			
			
			for (Venda p : listaVenda) {
				System.out.println("------------------------------");
				System.out.println("Id: " + p.getId());
				System.out.println("Cpf: " + p.getCpf());
				System.out.println("Data: " + p.getData());
				System.out.println("Preco total: "  + p.getPrecoTotal());
				System.out.println("Parcelas pagas: "  + p.getQtdePagas());
				System.out.println("Total de parcelas: "  + p.getParcelamento());
				System.out.println("Forma de pagamento: "  + p.getFormaPagamento());
			}	
				System.out.println("------------------------------");
				break;

		}

		case 5 : {
			
				System.out.println("informe o id da venda:");
				id = leitor.nextInt();
				leitor.nextLine();
				 Venda lista = vendaDAO.buscarPorId(id);
				
				
					System.out.println("------------------------------");
					System.out.println("Id: " + lista.getId());
					System.out.println("Cpf: " + lista.getCpf());
					System.out.println("Data: " + lista.getData());
					System.out.println("Preco total: "  + lista.getPrecoTotal());
					System.out.println("Parcelas pagas: "  + lista.getQtdePagas());
					System.out.println("Total de parcelas: "  + lista.getParcelamento());
					System.out.println("Forma de pagamento: "  + lista.getFormaPagamento());
				
					System.out.println("------------------------------");
				
				
				
				break;

		}
				
		}
		
	}
	
}
