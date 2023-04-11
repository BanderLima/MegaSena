package com.programa.megasenna;

import java.util.ArrayList;

public class MegaSena {
	
//Essa parte criando uma constante com valor definido.
	final static int LIMITE_MAXIMO = 60; // definindo o limite , por isso o final statatic, essa valor nao pode mudar.

	// Esse método é responsável por criar os numeros aleatorios dentro do limite.
	private int sortearNumero(int limite) {
		//feito um casting para garantir que os numeros serão inteiros, e arredondando através do math.round.
		return (int) Math.round(Math.random() * limite); // aqui definindo numeros aleatorios em que os numeros estarão entre 1 e 60. 
	}

	// Esse método é responsável por definir a sequencia pegando os valores aleatórios e colocando na sequencia. 
	private ArrayList<Integer> sortearSequencia() {  // definindo que aqui será uma lista de arrays do tipo integer no método.
		int contador = 0;  //inicializando o contador.
		ArrayList<Integer> sequencia = new ArrayList<>(); //criando sempre uma nova lista onde sequencia recebe esse array .
		while (contador < 6) { // aqui defino a quantidade de numeros que serão criados entre 1 e 60
			int numeroSorteado = sortearNumero(LIMITE_MAXIMO); // aqui criando uma varaivel onde recebe os numeros aleatorios que serao 
			//gerados através do math.random dentro do limite de 60. 
			if (sequencia.contains(numeroSorteado) || numeroSorteado == 0) { // essa parte aqui faz uma validação pra garantir valores válidos.
				continue;
			}
			sequencia.add(numeroSorteado); //aqui adicionando os numeros da sequencia.
			contador++; // e o contador realizando o loop 6 vezes.
		}
		return sequencia; // os numeros criados.
	}

	// Esse método é responsável por gerar a quantidade dos jogos que serao feitos de acordo com o usuário.
	public void gerarJogos(int quantidadeJogos) {  // metodo recebendo parametro que será dado pelo usuário
		System.out.println("\n***           Jogos Sorteados           ***");
		for (int i = 0; i < quantidadeJogos; i++) { // de acordo com a quantidade de jogos que for definido, será gerado os numeros.
			System.out.print((i + 1) + "° Jogo: "); // aqui é so numerando o jogo criado, ex: jogo 1, jogo 2, etc.
			for (int n : sortearSequencia()) { // aqui pegando a a sequencia de numeros sorteados no metodo acima e jogando na var n .
				System.out.print(n + "   ");
				//System.out.println(sortearSequencia().lastIndexOf(sortearSequencia()));
				
			}
			System.out.println();
		}
		System.out.println("*********************************************");
	}

}
