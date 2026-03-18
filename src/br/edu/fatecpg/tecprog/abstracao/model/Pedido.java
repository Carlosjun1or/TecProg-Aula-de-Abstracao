package br.edu.fatecpg.tecprog.abstracao.model;

public class Pedido {
	public int idPedido;
	public String produtoPedido;
	public String nmCliente;
	public String descricaoPedido;
	public String statusPedido;
	
	public void criarPedido() {
		System.out.println("Pedido criado com sucesso!"
				+"\nID do Pedido: " + this.idPedido
				+"\nCliente: " + this.nmCliente
				+ "\nProduto: " + this.produtoPedido
				+"\nDescrição: " + this.descricaoPedido
				+"\nStatus: " + this.statusPedido);
	}
	public void buscarPedido() {
		System.out.println("Pedido encontrado!"
				+"\nID do Pedido: " + this.idPedido
				+"\nCliente: " + this.nmCliente
				+ "\nProduto: " + this.produtoPedido
				+"\nDescrição: " + this.descricaoPedido
				+"\nStatus: " + this.statusPedido);
	}
	public void cancelarPedido() {
            System.out.println("Pedido " + this.idPedido + " cancelado com sucesso!"
            		+"\nCliente: " + this.nmCliente
            		+"\nProduto: " + this.produtoPedido);
	}
}
