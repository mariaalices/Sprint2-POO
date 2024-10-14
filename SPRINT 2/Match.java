public class Match {

	private int codCli;
    private String resultado;
    
	public Match(int codCli, String resultado) {
		super();
		this.codCli = codCli;
		this.resultado = resultado;
	}

	public int getCodCli() {
		return codCli;
	}
	
	public void setCodCli(int codCli) {
		this.codCli = codCli;
	}
	
	public String getResultado() {
		return resultado;
	}
	
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
    
    
	
}
