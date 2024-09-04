package tarefas_ads4mnha;

public class Carro {
	private String modelo;
	private int ano;
	private String cor;
	
	
	public void exibirFicha() 
	{
		System.out.print("Modelo: " + this.modelo +"\nano: "+ this.ano + "\ncor: " + this.cor);
	}
	
	public int calcularIdade(int anoAtual) {
		return anoAtual- this.ano;
	}
	
	
}
