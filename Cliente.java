package oo.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;
    int id;
    int idade;
    List<Compra> compras = new ArrayList<>();
    
    Cliente(String nome) {
	this.nome = nome;
    }
    
    void fezCompra(Compra compra) {
	this.compras.add(compra);
    }
    
    double totalGasto() {
	double total = 0;
	
	for(Compra compra: compras) {
	    total += compra.precoTotal();
	}
	
	return total;
    }
}
