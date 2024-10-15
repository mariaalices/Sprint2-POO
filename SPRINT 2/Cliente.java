public class Cliente extends Usuario{

	public Cliente(int id, String nome, String cpf, String email, String telefone, String endereco, int idade) {
		
		super(id, nome, cpf, email, telefone, endereco, idade);
		
	}

	//EXEMPLO DE CRIAÇÃO DE MÉTODOS FUTUROS
	 public void fazerPedido() {
	        System.out.println("O cliente " + getNome() + " está fazendo um pedido!");   
	    }
	
}
