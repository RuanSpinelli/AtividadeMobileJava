package tarefas_ads4mnha;

public class Aluno {
	private String nome;
	private int idade;
	
	
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void exibirAluno() {
		System.out.print("Nome: "+ this.nome + "\nIdade: " + this.idade);
	}
	
}
