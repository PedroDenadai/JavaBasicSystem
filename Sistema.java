package oo.Desafio;

public class Sistema {
    public static void main(String[] args) {
	Produto p1 = new Produto("Chiclete", 12.98);
	Compra c1 = new Compra();
	c1.adicionarItem(p1, 5);
	Cliente cliente1 = new Cliente("Pedro");
	
	cliente1.fezCompra(c1);
	System.out.println(cliente1.totalGasto());
    }
}
