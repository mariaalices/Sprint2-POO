public class Produto {

	private int codProd;
    private String nomeProd;
    private String descProd;
    private String categoriaProd;
    private double valorProd;
    
	public Produto(int codProd, String nomeProd, String descProd, String categoriaProd, double valorProd) {
		super();
		this.codProd = codProd;
		this.nomeProd = nomeProd;
		this.descProd = descProd;
		this.categoriaProd = categoriaProd;
		this.valorProd = valorProd;
	}

	public int getCodProd() {
		return codProd;
	}

	public void setCodProd(int codProd) {
		this.codProd = codProd;
	}

	public String getNomeProd() {
		return nomeProd;
	}

	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}

	public String getDescProd() {
		return descProd;
	}

	public void setDescProd(String descProd) {
		this.descProd = descProd;
	}

	public String getCategoriaProd() {
		return categoriaProd;
	}

	public void setCategoriaProd(String categoriaProd) {
		this.categoriaProd = categoriaProd;
	}

	public double getValorProd() {
		return valorProd;
	}

	public void setValorProd(double valorProd) {
		this.valorProd = valorProd;
	}

	@Override
	public String toString() {
		return "Produto Cadastrado [codProd = " + codProd + ", nomeProd = " + nomeProd + ", descProd = " + descProd + ", "
				+ "categoriaProd = " + categoriaProd + ", valorProd = " + valorProd + "]";
	}
    
	
}
