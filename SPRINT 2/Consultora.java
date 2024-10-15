public class Consultora extends Usuario{

	public Consultora(int id, String nome, String cpf, String email, String telefone, String endereco, int idade) {
		super(id, nome, cpf, email, telefone, endereco, idade);
		
	}

	//EXEMPLO DE CRIAÇÃO DE MÉTODOS FUTUROS
	public void gerenciarEstoque() {
        System.out.println(getNome() + " irá gerenciar seu estoque!");
    }

	
}
