
public class Pessoa {
	public String nome;
	public String Endereco;
	public String telefone;
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
