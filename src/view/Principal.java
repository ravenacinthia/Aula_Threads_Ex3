package view;

import java.util.Random;
import controller.ThreadMatriz;

public class Principal {

	public static void main(String[] args) {


		Random random = new Random();
		int[][] matriz = new int[3][5];

		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 5; j++){
				System.out.println(matriz[i][j] = 1 + random.nextInt(100));
			}
		}
		
		ThreadMatriz tMatriz = new ThreadMatriz(matriz);
		tMatriz.start();
	}
}






