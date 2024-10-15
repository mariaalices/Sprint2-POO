public class Estoque {

	private Produto produto;
    private int qtdEstoque;
    
	public Estoque(Produto produto, int qtdEstoque) {
		super();
		this.produto = produto;
		this.qtdEstoque = qtdEstoque;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	//EXEMPLO DE MÉTODOS QUE SERÃO DESENVOLVIDOS FUTURAMENTE
    public void adicionarProduto() {  	
    	System.out.println("Produto " + getProduto().getNomeProd() + " adicionado com sucesso!");
    }
    
    public void removerProduto() {
    	System.out.println("Produto " + getProduto().getNomeProd() + " removido com sucesso!");
    }

	@Override
	public String toString() {
		return "Estoque [produto = " + produto + ", qtdEstoque = " + qtdEstoque + "]";
	}
    
    
	
}
