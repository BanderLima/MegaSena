package com.programa.megasenna;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		MegaSena megaSena = new MegaSena();

		System.out.print("Informe a quantidade de Jogos que deseja realizar: ");
		int qtdJogos = scan.nextInt();

		megaSena.gerarJogos(qtdJogos);

		scan.close();
	}
}
