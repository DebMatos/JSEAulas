package experiencias.io.altar.exemplos2;

public class Mota extends Veiculo{

	private int cc;	
	private int mudancas;


		
	public Mota(int rodas, int portas, String marca, int cc, int mudancas) {
		super( rodas, portas, marca);
		this.cc = cc;
		this.mudancas = mudancas;
	}



	



	public int getMudancas() {
		return mudancas;
	}



	public void setMudancas(int mudancas) {
		this.mudancas = mudancas;
	}



	public int getCc() {
		return cc;
	}



	public void setCc(int cc) {
		this.cc = cc;
	}




	
	
	
}
