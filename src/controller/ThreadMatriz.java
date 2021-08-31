package controller;

public class ThreadMatriz extends Thread{

	private int matriz[][];

	public ThreadMatriz(int matriz[][]){
		this.matriz = matriz;
	}


	@Override
	public void run() {
		calc();
	}

	private void calc() {

		int soma = 0;
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 5; j++){
				soma += matriz[i][j];
			}
			System.out.println("Soma da " + (i + 1) + "° linha = " + soma);
		}
	}
}

