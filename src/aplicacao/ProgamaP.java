package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class ProgamaP {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digete o numero de linhas: ");
		int m = entrada.nextInt();
		System.out.println("Digete o numero de colunas: ");
		int n = entrada.nextInt();
		int[][] mat = new int [m][n];

		for(int i = 0; i<m; i++) {

			for(int j =0; j<n; j++) {
				mat[i][j] = entrada.nextInt();
			}
		}
		System.out.println("Digete o numero a pesquisar: ");
		int x = entrada.nextInt();

		for (int i = 0; i < m; i++) {
			for(int j = 0; j<n; j++) {
				if(mat[i][j]==x) {
					System.out.println("posição: "+i+","+j);
					if(j>0) {
						System.out.println("Esquerda: "+mat[i][j-1]);
					}
					if(j<mat[i].length-1) {
						System.out.println("Direita: "+mat[i][j+1]);
					}
					if(i>0) {
						System.out.println("Em cima: "+mat[i-1][j]);
					}
					if(i<mat.length-1) {
						System.out.println("Em baixo: "+mat[i+1][j]);
					}
					
				}
			}
		}




		entrada.close();

	}

}
