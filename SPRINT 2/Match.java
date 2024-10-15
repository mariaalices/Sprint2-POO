public class Match {

	private Cliente cliente;
    private Consultora consultora;
    private double scoreCompatibilidade;
    
    
    //CONSTRUTOR
	public Match(Cliente cliente, Consultora consultora, double scoreCompatibilidade) {
		super();
		this.cliente = cliente;
		this.consultora = consultora;
		this.scoreCompatibilidade = scoreCompatibilidade;
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

	public double getScoreCompatibilidade() {
		return scoreCompatibilidade;
	}

	public void setScoreCompatibilidade(double scoreCompatibilidade) {
		this.scoreCompatibilidade = scoreCompatibilidade;
	}
	
	//EXEMPLO DE MÉTODOS QUE SERÃO DESENVOLVIDOS FUTURAMENTE
    public void realizarMatch() {
    	System.out.println("Match realizado entre " + getCliente().getNome() + " e " + getConsultora().getNome());
    }

	@Override
	public String toString() {
		return "Match [cliente = " + cliente + ", consultora = " + consultora + ", scoreCompatibilidade = "
				+ scoreCompatibilidade + "]";
	}
    
    
	
}
