package experiencias.io.altar.exemplos;

public class TryCatchExemple2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		try {
			switch (args[0]) {

			case "DEV":
				runDEV();
				break;
			case "PROD":
				runPROD();
				break;

			case "TEST":
				runTEST();
				break;

			default:
				System.out.println("Erro : 'DEV' 'PROD' 'TEST");
			}

		} catch (Exception e) {
			runTEST();
		}

	}

	public static void runDEV() {
		System.out.println("Config DEV");
	}

	public static void runPROD() {
		System.out.println("Config PROD");
	}

	public static void runTEST() {
		System.out.println("Config TEST");
	}
}
