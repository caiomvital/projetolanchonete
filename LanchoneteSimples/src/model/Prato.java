package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Prato {
	
	LocalDate hoje = LocalDate.now();
	LocalDate dezDiasDepois = hoje.plusDays(10);
	DateTimeFormatter formatado = DateTimeFormatter.ofPattern("dd/MM/yy");
	
	private String nome;
	private double preco;
	private String dataValidade;
	private double peso;
	
	
	
	public Prato() {
		
	}

	public Prato(String nome, double preco, double peso) {
		this.nome = nome;
		this.preco = preco;
		this.dataValidade = dezDiasDepois.format(formatado);
		this.peso = peso;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDataValidade() {
		return dezDiasDepois.format(formatado);
	}
	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
}
