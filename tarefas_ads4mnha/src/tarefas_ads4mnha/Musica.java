package tarefas_ads4mnha;

public class Musica {
	//atributos da classe
	private String titulo;
	private String artista;
	private  int anoLancamento;
	private double avaliacao;
	private int numeroAvaliacoes;
	
	
	//metodos
	
	public void exibirFicha() {
		System.out.print(this.titulo);
		System.out.print(this.artista);
		System.out.print(this.anoLancamento);
		System.out.print(this.avaliacao);
		System.out.print(this.numeroAvaliacoes);
			
	}
	
	public void avaliar(double nota) {
		this.numeroAvaliacoes++;
		this.avaliacao = ( nota + this.avaliacao )/ this.numeroAvaliacoes;
	}
	
	public double media() {
		return this.avaliacao / this.numeroAvaliacoes;
	}
	
	
	
}
