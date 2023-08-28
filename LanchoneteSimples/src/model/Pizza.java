package model;

import java.util.Scanner;

public class Pizza extends Prato {
	
	private String molho;
    private String recheio;
    private String borda;
    
    private String listaMolhos = """
			1) Molho de Tomate
			2) Molho Branco
			3) Molho Pesto
			""";
    
	private String listaRecheios = """
			1) Mussarela
			2) Calabresa
			3) Portuguesa
			""";
	
	private String listaBordas = """
			1) Borda Tradicional
			2) Borda de Catupiry
			3) Borda de Cheddar
			""";
	
    
    public Pizza() {
    	
    }
    
    public Pizza(String molho, String recheio, String borda, String nome, double preco, double peso) {
    	super(nome, preco, peso);
    	this.molho = molho;
    	this.recheio = recheio;
    	this.borda = borda;
    }
    
    public String getMolho() {
		return molho;
	}
    public void setMolho(String molho) {
		this.molho = molho;
	}
    public String getRecheio() {
		return recheio;
	}
    public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
    public String getBorda() {
		return borda;
	}
    public void setBorda(String borda) {
		this.borda = borda;
	}
    
    @Override
    public String toString() {
    	return "Pizza: " + getNome() + "\nMolho: " + molho + "\nRecheio: " + recheio 
				+ "\nBorda: " + borda +
				"\nPreço: R$ " + getPreco()
				+ "\nData de Validade: " + getDataValidade();
    }
    
    public Pizza criarPizza() {
    	Scanner scan = new Scanner(System.in);
		double valorTotal = 0;
		int opcao = 0;
		System.out.println("Entre com o molho: ");
		System.out.println(listaMolhos);
		opcao = scan.nextInt();
		if(opcao == 1) {
			setMolho("Molho de Tomate");
			valorTotal += ValoresPizza.MolhoTomate.getPreco();
		} else if (opcao == 2) { 
			setMolho("Molho Branco");
			valorTotal += ValoresPizza.MolhoBranco.getPreco();
		} else if (opcao == 3) {
			setMolho("Molho Pesto");
			valorTotal += ValoresPizza.MolhoPesto.getPreco();
		}
		scan.nextLine();
		System.out.println("Entre com o recheio: ");
		System.out.println(listaRecheios);
		opcao = scan.nextInt();
		if(opcao == 1) {
			setRecheio("Mussarela");
			valorTotal += ValoresPizza.MussarelaRecheio.getPreco();
		} else if (opcao == 2) {
			setRecheio("Calabresa");
			valorTotal += ValoresPizza.CalabresaRecheio.getPreco();
		} else if (opcao == 3) {
			setRecheio("Portuguesa");
			valorTotal += ValoresPizza.PortuguesaRecheio.getPreco();
		}
		scan.nextLine();
		System.out.println("Entre com a Borda:");
		System.out.println(listaBordas);
		opcao = scan.nextInt();
		switch(opcao) {
		case 1:
			setBorda("Tradicional");
			valorTotal += ValoresPizza.BordaTradicional.getPreco();
			break;
		case 2:
			setBorda("de Catupiry");
			valorTotal += ValoresPizza.BordaCatupiry.getPreco();
			break;
		case 3:
			setBorda("de Cheddar");
			valorTotal += ValoresPizza.BordaCheddar.getPreco();
			break;
		}
		scan.nextLine();
		this.setNome("Pizza de " + getRecheio() + " com " + getMolho() + " e borda " + getBorda());
		this.setPreco(valorTotal);
		this.setDataValidade(super.getDataValidade());
		
		return this;
    }

}
