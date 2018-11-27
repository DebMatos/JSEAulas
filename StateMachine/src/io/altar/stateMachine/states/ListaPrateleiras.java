package io.altar.stateMachine.states;

public class ListaPrateleiras implements State {

	@Override
	public int execute() {
		System.out.println(" Lista de prateleiras");
		System.out.println("(...)\n");
		System.out.println("1) Criar nova prateleira");
		System.out.println("2) Editar prateleira");
		System.out.println("3) Consultar os detalhe da prateleira");
		System.out.println("4) Remover prateleira ");
		System.out.println("5) Voltar ao ecra anterior ");

		int[] opcoes = { 1, 2, 3, 4, 5 };
		return scannerUtils.getValidIntFromScanner("Por favor selecione uma das seguintes opcoes ", opcoes);
	}

}
