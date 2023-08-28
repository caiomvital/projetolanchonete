package model;

import java.util.Scanner;

public class Lanche extends Prato {
	
	private String pao;
	private String recheio;
	private String molho;
	
	private String listaPaes = """
			1) Pão Francês
			2) Pão Australiano
			3) Pão Integral
			""";
	private String listaRecheios = """
			1) Frango com Catupiry
			2) Hamburguer com Cheddar
			3) Vegetariano Grelhado
			""";
	private String listaMolhos = """
			1) Mostarda
			2) Ketchup
			3) Maionese
			4) Mostarda e Mel
			5) Barbecue
			6) Alho com Ervas
			7) Molho de Queijo
			8) Molho Picante
			9) Iogurte com Ervas
			""";
	
	public Lanche() {
		
	}
	
	public Lanche(String pao, String recheio, String molho, String nome, double preco, String dataValidade, double peso) {
		super(nome, preco, peso);
		this.pao = pao;
		this.recheio = recheio;
		this.molho = molho;
	}
	
	public String getPao() {
		return pao;
	}
	public void setPao(String pao) {
		this.pao = pao;
	}
	public String getRecheio() {
		return recheio;
	}
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	public String getMolho() {
		return molho;
	}
	public void setMolho(String molho) {
		this.molho = molho;
	}
	@Override
	public String toString() {
		return "Lanche: " + getNome() + "\nPão: " + pao + "\nRecheio: " + recheio 
				+ "\nMolho: " + molho +
				"\nPreço: R$ " + getPreco()
				+ "\nData de Validade: " + getDataValidade(); 
	}
	
	public Lanche criarLanche() {
		Scanner scan = new Scanner(System.in);
		double valorTotal = 0;
		int opcao = 0;
		
		System.out.println("Entre com o pão: ");
		System.out.println(listaPaes);
		opcao = scan.nextInt();
		if(opcao == 1) {
			setPao("Pão Francês");
			valorTotal += ValoresLanche.PaoFrances.getPreco();
		} else if (opcao == 2) { 
			setPao("Pão Australiano");
			valorTotal += ValoresLanche.PaoAustraliano.getPreco();
		} else if (opcao == 3) {
			setPao("Pão Integral");
			valorTotal += ValoresLanche.PaoIntegral.getPreco();
		}
		scan.nextLine();
		System.out.println("Entre com o recheio: ");
		System.out.println(listaRecheios);
		opcao = scan.nextInt();
		if(opcao == 1) {
			setRecheio("Frango com Catupiry");
			valorTotal += ValoresLanche.FrangoCatupiry.getPreco();
		} else if (opcao == 2) {
			setRecheio("Hamburguer com Cheddar");
			valorTotal += ValoresLanche.HamburguerCheddar.getPreco();
		} else if (opcao == 3) {
			setRecheio("Vegetariano Grelhado");
			valorTotal += ValoresLanche.VegetarianoGrelhado.getPreco();
		}
		scan.nextLine();
		System.out.println("Entre com o molho: ");
		System.out.println(listaMolhos);
		opcao = scan.nextInt();
		switch(opcao) {
		case 1:
			setMolho("Mostarda");
			valorTotal += ValoresLanche.Mostarda.getPreco();
			break;
		case 2:
			setMolho("Ketchup");
			valorTotal += ValoresLanche.Ketchup.getPreco();
			break;
		case 3:
			setMolho("Maionese");
			valorTotal += ValoresLanche.Maionese.getPreco();
			break;
		case 4:
			setMolho("Mostarda e Mel");
			valorTotal += ValoresLanche.MostardaMel.getPreco();
			break;
		case 5:
			setMolho("Barbecue");
			valorTotal += ValoresLanche.Barbecue.getPreco();
			break;
		case 6:
			setMolho("Alho com Ervas");
			valorTotal += ValoresLanche.AlhoErvas.getPreco();
			break;
		case 7:
			setMolho("Molho de Queijo");
			valorTotal += ValoresLanche.MolhoQueijo.getPreco();
			break;
		case 8:
			setMolho("Molho Picante");
			valorTotal += ValoresLanche.MolhoPicante.getPreco();
			break;
		case 9:
			setMolho("Iogurte com Ervas");
			valorTotal += ValoresLanche.IogurteErvas.getPreco();
			break;
		default: 
			System.out.println("Sem Molho");
		}
		scan.nextLine();
		this.setNome(getPao() + " com " + getRecheio());
		this.setPreco(valorTotal);
		this.setDataValidade(super.getDataValidade());
		return this;
	}

}
