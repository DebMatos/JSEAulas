package io.altar.stateMachine;

import io.altar.stateMachine.states.ListaPrateleiras;
import io.altar.stateMachine.states.ListarProdutos;
import io.altar.stateMachine.states.MenuInicial;
import io.altar.stateMachine.states.State;

public class StateMachine {

	public static void main(String[] args) {
StateMachine fsm= new StateMachine();
int opcao=0;

while(true){
	opcao=fsm.states[fsm.currentState].execute();
	fsm.currentState=fsm.transitionMatrix[fsm.currentState][opcao-1];
	
	if(fsm.currentState==0&& opcao==3){
		break;}
}
	}

	public State[] states = { new MenuInicial(), // 0
			new ListarProdutos(), // 1
			new ListaPrateleiras() }; // 2

	private int transitionMatrix[][] = { { 1, 2 },       //0
										{ 0,1,1,1,0 },   //1  Produtos
										{ 0,2,2,2,0 } }; //2  Prateleiras

	private int currentState = 0;
}