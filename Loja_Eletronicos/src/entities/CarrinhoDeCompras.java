package entities;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private int id;
	
	private List<ItemCarrinho> itens = new ArrayList<>();
	
	public CarrinhoDeCompras(int id) {
		this.id = id;
	}
	
	
	public void adicionarProduto(Produto produto, int quantidade) {
		ItemCarrinho item = new ItemCarrinho(produto, quantidade);
        itens.add(item);
	}
	

	public void removerProduto(int idProduto) {
	    ItemCarrinho itemParaRemover = null;
	
	    for (ItemCarrinho item : itens) {
	        if (item.getProduto().getId() == idProduto) {
	            itemParaRemover = item;
	        }
	    }
	
	    if (itemParaRemover != null) {
	        itens.remove(itemParaRemover);
	    }
	}

	
	public double calcularTotal() {
		double total = 0;
		
		for(ItemCarrinho item : itens) {
			total+=item.subtotal();
		}
		
		return total;
	}
	

	 public List<ItemCarrinho> getItens() {
	        return itens;
	    }


	
}


