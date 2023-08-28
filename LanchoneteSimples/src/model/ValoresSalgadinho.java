package model;

public enum ValoresSalgadinho {
    //tipos de preparo
	Assado(10.00),
    Frito(12.00),
    //tipos de recheio
    Queijo(8.00),
    Presunto(8.50),
    Frango(9.00),
    //tipos de massa
    Tradicional(0.00),
    Especial(1.50);

    private double preco;

    ValoresSalgadinho(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}
