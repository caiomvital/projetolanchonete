package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Lanche;
import model.Pizza;
import model.Prato;
import model.Salgadinho;

public class Pedido {
	
	private String cliente;
	private static List<Prato> itensConsumidos;
	private double taxaServico;
	
	
	public Pedido() {
		itensConsumidos = new ArrayList<>();
	}
	
	public Pedido(String cliente, List<Prato> itensConsumidos) {
	    this.cliente = cliente;
	    this.taxaServico = 0.10;
	    Pedido.itensConsumidos = itensConsumidos; // Use o nome da classe para acessar a variável estática
	}
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public List<Prato> getItensConsumidos() {
		return itensConsumidos;
	}
	public void setItensConsumidos(List<Prato> itensConsumidos) {
		this.itensConsumidos = itensConsumidos;
	}
	public double getTaxaServico() {
		return taxaServico;
	}
	public void setTaxaServico(double taxaServico) {
		this.taxaServico = taxaServico;
	}
	
	@Override
	 public String toString() {
        return "Pedido \n" + "Nome do Cliente: " + cliente + "\n Taxa De Serviço: " + taxaServico + "%\n Itens Consumidos: " + itensConsumidos;
    }
	
	public static void criarPedido() {
        Scanner scan = new Scanner(System.in);
        itensConsumidos = new ArrayList<>();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1) Adicionar Lanche");
            System.out.println("2) Adicionar Pizza");
            System.out.println("3) Adicionar Salgadinho");
            System.out.println("4) Finalizar Pedido");

            int opcao = scan.nextInt();
            scan.nextLine(); // Para consumir a quebra de linha

            if (opcao == 1) {
            	Lanche novoLanche = new Lanche();
                novoLanche.criarLanche();
                itensConsumidos.add(novoLanche);
            	
            } else if (opcao == 2) {
            	Pizza novaPizza = new Pizza();
            	novaPizza.criarPizza();
            	itensConsumidos.add(novaPizza);
            	
            } else if (opcao == 3) {
            	Salgadinho novoSalgadinho = new Salgadinho();
            	novoSalgadinho.criarSalgadinho();
            	itensConsumidos.add(novoSalgadinho);
                
            } else if (opcao == 4) {
                
                imprimirNotaFiscal();
                break; 
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        
        scan.close();
    }
	
	public static double calcularTotal() {
		double total = 0;
		for(Prato p : itensConsumidos) {
			total += p.getPreco();
		}
		return total;
	}
	
	public static double calcularServico() {
		double somaItens = 0;
		for(Prato p : itensConsumidos) {
			somaItens += p.getPreco();
		}
		double taxa = somaItens * 0.1;
		return taxa;
	}
	
	public static double calcularTroco(double pagamento) {
	    double somaItens = 0;
	    for (Prato p : itensConsumidos) {
	        somaItens += p.getPreco();
	    }
	    double troco = (pagamento - somaItens - calcularServico());
	    return troco;	
	}
	
	public static void imprimirNotaFiscal() {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("---Nota Fiscal---");
	    System.out.println("Itens Consumidos:");
	    for (Prato p : itensConsumidos) {
	        System.out.printf("Prato: %s -- Valor: R$ %.2f\n", p.getNome(), p.getPreco());
	    }
	    System.out.printf("\nValor final a pagar: R$ %.2f", (calcularTotal() + calcularServico()));
	    System.out.printf("\nA taxa de serviço é: R$ %.2f", calcularServico());
	    double pagamento = 0;

	    while (true) {
	        System.out.println("\nForma de Pagamento?");
	        System.out.println("1) Espécie | 2) Cartão");
	        int opcao = scan.nextInt();
	        
	        if (opcao == 1) {
	            System.out.println("Valor pago:");
	            pagamento = scan.nextDouble();
	            if (pagamento > calcularTotal()) {
	            	System.out.printf("\nO troco é: R$ %.2f", calcularTroco(pagamento));
	                break; 
	            } else {
	                System.out.println("Valor insuficiente. Tente novamente.");
	            }
	        } else if (opcao == 2) {
	            System.out.println("Pagamento efetuado.");
	            break;
	        } else {
	            System.out.println("Opção Inválida. Tente Novamente. \n\n");
	        }
	    }
	    
	    System.out.println("\n--------Fim---------");
	    scan.close();
	}
 }

