package model;

public enum ValoresPizza {
	//recheios das pizzas
		MussarelaRecheio(25.00),
	    CalabresaRecheio(30.00),
	    PortuguesaRecheio(35.00),
	    //molhos das pizzas
	    MolhoTomate(0.00),
	    MolhoBranco(1.50),
	    MolhoPesto(2.00),
	    //bordas das pizzas
	    BordaTradicional(0.00),
	    BordaCatupiry(3.00),
	    BordaCheddar(2.50);
	
	private double preco;

    ValoresPizza(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}
