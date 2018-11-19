import VeiculoRepositorio.AutomovelRepositorio;
import VeiculoRepositorio.MotaRepositorio;
import experiencias.io.altar.exemplos2.Automovel;
import experiencias.io.altar.exemplos2.Mota;

public class Test {
private  static MotaRepositorio repositorioMotas=new MotaRepositorio(); 
private static AutomovelRepositorio repositorioAutomoveis=new AutomovelRepositorio();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		run();
		
		
	}
	public static  void run(){
		
			
			Mota mota1=new Mota(2, 0, "Piaggio",5, 250);
			repositorioMotas.save(mota1);
			System.out.println(repositorioMotas.findById((long) (0)).getMarca());
			
			Automovel auto= new Automovel(4,2,"Ferrari", "RadioTec", 20);
			
			
			
		}

}
