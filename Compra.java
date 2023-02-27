package oo.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item> itens = new ArrayList<>();
    
    
    double precoTotal() {
	double precoTotal = 0;
	for(Item item: itens) {
	     precoTotal += item.produto.preco * item.quantidade;
	}
	return precoTotal;
    }
    
    void adicionarItem(Produto p, int qtde) {
	this.itens.add(new Item(p, qtde));
    }
}
