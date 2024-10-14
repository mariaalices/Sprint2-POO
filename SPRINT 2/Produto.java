public class Produto {

	private int codProd;
    private int qtd;
    private String nome;
    private String desc;
    private String categoria;
    private double valor;
    private String palavraChaves;
    
	public Produto(int codProd, int qtd, String nome, String desc, String categoria, double valor,
			String palavraChaves) {
		super();
		this.codProd = codProd;
		this.qtd = qtd;
		this.nome = nome;
		this.desc = desc;
		this.categoria = categoria;
		this.valor = valor;
		this.palavraChaves = palavraChaves;
	}

	public int getCodProd() {
		return codProd;
	}
	
	public void setCodProd(int codProd) {
		this.codProd = codProd;
	}
	
	public int getQtd() {
		return qtd;
	}
	
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getPalavraChaves() {
		return palavraChaves;
	}
	
	public void setPalavraChaves(String palavraChaves) {
		this.palavraChaves = palavraChaves;
	}
	
}
