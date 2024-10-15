public class Pedido {

	private Cliente cliente;
    private Consultora consultora;
    private Produto[] produtosPedido;
    private int[] quantidadePedido;
    private double valorTotal;
    
    //CONSTRUTOR
	public Pedido(Cliente cliente, Consultora consultora, Produto[] produtosPedido, int[] quantidadePedido,
			double valorTotal) {
		super();
		this.cliente = cliente;
		this.consultora = consultora;
		this.produtosPedido = produtosPedido;
		this.quantidadePedido = quantidadePedido;
		this.valorTotal = calcularValorTotal();
	}
	
	
	//GETTERS E SETTERS
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Consultora getConsultora() {
		return consultora;
	}

	public void setConsultora(Consultora consultora) {
		this.consultora = consultora;
	}

	public Produto[] getProdutosPedido() {
		return produtosPedido;
	}

	public void setProdutosPedido(Produto[] produtosPedido) {
		this.produtosPedido = produtosPedido;
	}

	public int[] getQuantidadePedido() {
		return quantidadePedido;
	}

	public void setQuantidadePedido(int[] quantidadePedido) {
		this.quantidadePedido = quantidadePedido;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
    
	//EXEMPLO DE MÉTODOS QUE SERÃO DESENVOLVIDOS FUTURAMENTE
    private double calcularValorTotal() {
    	int total = 0;
    	return total;
    }
	
    private void exibirPedido() {
    	System.out.println("Pedido realizado por: " + getCliente().getNome());
    	System.out.println("Consultora responsável: " + getConsultora().getNome());
    	System.out.println("Valor total do pedido: " + valorTotal);
    	//fazer um for (futuramente) para rodar os produtos e para que os mesmos sejam guardados no array criado acima
    	System.out.println("Produtos adquiridos.... ");
    }
	
}
