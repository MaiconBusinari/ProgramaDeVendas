package Programa;



import java.util.Scanner;
public class Programa {

	public static void main(String[] args) {

		int opcao;
		
		Scanner leitor = new Scanner(System.in);

		
		do {
			
			do{
				
				System.out.println("Escolha sua operacao");
				System.out.println("1-Ficha de cadastro");
				System.out.println("2-Consulta");
				opcao = leitor.nextInt();
				leitor.nextLine();
				
			}while(opcao !=1 && opcao !=2);
			
				switch (opcao) {
				
				case 1 : {					
						
						do {
							
							System.out.println("Escolha sua operacao");
							System.out.println("1-Cadastar");
							System.out.println("2-Atualizar");
							System.out.println("3-Apagar");
							
							
							opcao = leitor.nextInt();
							leitor.nextLine();
							
						}while(opcao != 1 &&  opcao != 2 && opcao !=3);
					
					Cadastro.cadastro(opcao);
							
					break;
				}
				case 2 : {
					
					do {
							System.out.println("Escolha sua operacao");
							System.out.println("1-Nova Venda");
							System.out.println("2-Atualizar de venda");
							System.out.println("3-Baixar venda");
							System.out.println("4-Vendas em abertas");
							System.out.println("5-Consultar venda por id");
							opcao = leitor.nextInt();
							leitor.nextLine();
							
					}while(opcao != 1 &&  opcao != 2  && opcao != 3 && opcao != 4 && opcao != 5);
					
					Consulta.consulta(opcao);
					
					break;	
				}
			
				
				}
				
				do {
					System.out.println("Deseja realizar mais alguma atividade (1-Sim -- 2-Nao)");
					opcao = leitor.nextInt();
					leitor.nextLine();
				}while(opcao != 1 &&  opcao != 2);
			
				
		}while(opcao != 2);	
		
		System.out.println("Programa foi finalizado!!!");
	}
}	
	

