package model;

import java.util.Scanner;

public class Salgadinho extends Prato {
	
	private String recheio;
	private String massa;
	private String preparo;
	
	private String listaRecheios = """
			1) Queijo
			2) Presunto
			3) Frango
			""";
	
	private String listaMassas = """
			1) Tradicional
			2) Especial
			""";
	
	private String listaPreparo = """
			1) Assado
			2) Frito
			""";
	
	public String getRecheio() {
		return recheio;
	}
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	
	public String getMassa() {
		return massa;
	}
	public void setMassa(String massa) {
		this.massa = massa;
	}
	
	public String getPreparo() {
		return preparo;
	}
	public void setPreparo(String preparo) {
		this.preparo = preparo;
	}
	
	@Override
	public String toString() {
		return "Salgadinho: " + getNome() + "\nRecheio: " + recheio 
				+ "\nMassa: " + massa 
				+ "\nPreparo: " + preparo
				+ "\nPreço: R$ " + getPreco()
				+ "\nData de Validade: " + getDataValidade();
		
	}

	public Salgadinho criarSalgadinho() {
		Scanner scan = new Scanner(System.in);
		double valorTotal = 0;
		int opcao = 0;
		
		System.out.println("Entre com o recheio: ");
		System.out.println(listaRecheios);
		opcao = scan.nextInt();
		if(opcao == 1) {
			setRecheio("Queijo");
			valorTotal += ValoresSalgadinho.Queijo.getPreco();
		}
		if(opcao == 2) {
			setRecheio("Presunto");
			valorTotal += ValoresSalgadinho.Presunto.getPreco();
		}
		if(opcao == 3) {
			setRecheio("Frango");
			valorTotal += ValoresSalgadinho.Frango.getPreco();
		}
		scan.nextLine();
		System.out.println("Entre com a massa: ");
		System.out.println(listaMassas);
		opcao = scan.nextInt();
		switch(opcao) {
		case 1:
			setMassa("Tradicional");
			valorTotal += ValoresSalgadinho.Tradicional.getPreco();
			break;
		case 2:
			setMassa("Especial");
			valorTotal += ValoresSalgadinho.Especial.getPreco();
			break;
		}
		scan.nextLine();
		System.out.println("Entre com o preparo: ");
		System.out.println(listaPreparo);
		opcao = scan.nextInt();
		if(opcao == 1) {
			setPreparo("Assado");
			valorTotal += ValoresSalgadinho.Assado.getPreco();
		}
		if(opcao == 2) {
			setPreparo("Frito");
			valorTotal += ValoresSalgadinho.Frito.getPreco();
		}
		scan.nextLine();
		this.setNome("Salgadinho de " + getRecheio() + " " + getPreparo() + " com massa " + getMassa());
		this.setPreco(valorTotal);
		this.setDataValidade(super.getDataValidade());
		return this;
	}

	
}
