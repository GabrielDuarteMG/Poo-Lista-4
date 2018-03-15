
public class Pessoa {
	public String nome;
	public String Endereco;
	public String telefone;
	public Pessoa() {
		
	}
	public Pessoa(String Nome,String Endereco, String Telefone) {
		this.nome = Nome;
		this.Endereco = Endereco;
		this.telefone = Telefone;
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return this.nome;
	}
	public String getEndereco() {
		return this.Endereco;
	}
	public String getTelefone() {
		return this.telefone;
	}
	public void imprimirDados() {
		System.out.println("Nome: " + getNome() + "\nEndereco: "+ getEndereco() + " \nTelefone: " + getTelefone());
	}
}
