package io.altar.stateMachine.states;

public class ListarProdutos implements State {

	@Override
	public int execute() {
		System.out.println(" Lista de produto");
		System.out.println("(...)\n");
			System.out.println("1) Criar novo produto");
			System.out.println("2) Editar produto");
			System.out.println("3) Consultar os detalhe do produto");
			System.out.println("4) Remover Produto ");
			System.out.println("5) Voltar ao ecra anyterior ");
			
			int[] opcoes={1,2,3,4,5};
			return scannerUtils.getValidIntFromScanner("Por favor selecione uma das seguintes opcoes ", opcoes);
	
	}

}
