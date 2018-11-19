package experiencias.io.altar.exemplos2;

public class Automovel extends Veiculo {
 
	private String antena="";
    public Automovel( int rodas, int portas, String marca, String antena, int litrosBagagem) {
		super( rodas, portas, marca);
		this.antena = antena;
		this.litrosBagagem = litrosBagagem;
	}
	private int litrosBagagem=0;
	


	public String getAntena() {
		return antena;
	}
	public void setAntena(String antena) {
		this.antena = antena;
	}
	public int getLitrosBagagem() {
		return litrosBagagem;
	}
	public void setLitrosBagagem(int litrosBagagem) {
		this.litrosBagagem = litrosBagagem;
	}
	
}
