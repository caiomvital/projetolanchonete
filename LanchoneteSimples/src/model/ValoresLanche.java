package model;

public enum ValoresLanche {
	//molhos para lanche
		Mostarda(0.00),
	    Ketchup(0.00),
	    Maionese(0.00),
		MostardaMel(1.00),
		Barbecue(1.00),
		AlhoErvas(1.50),
		MolhoQueijo(2.00),
		MolhoPicante(0.50),
		IogurteErvas(2.50),
		//pães para lanche
		PaoFrances(0.00),
		PaoIntegral(2.00),
		PaoAustraliano(5.00),
		//recheios para lanche
		FrangoCatupiry(15.00),
		HamburguerCheddar(18.00),
		VegetarianoGrelhado(14.00);
		

	    private double preco;

	    ValoresLanche(double preco) {
	        this.preco = preco;
	    }

	    public double getPreco() {
	        return preco;
	    }
}
