package experiencias.io.altar.exemplos2;

public class Veiculo {
private Long id;
	private int rodas=0;
	private int portas=0;
	private String marca="";
	
	
	

	public Veiculo( int rodas, int portas, String marca) {
		super();
	
		this.rodas = rodas;
		this.portas = portas;
		this.marca = marca;
	}
	public int getRodas() {
		return rodas;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	public void setRodas(int rodas) {
		this.rodas = rodas;
	}




	
}
