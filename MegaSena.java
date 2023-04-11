package com.programa.megasenna;

import java.util.ArrayList;

public class MegaSena {
	
//Essa parte criando uma constante com valor definido.
	final static int LIMITE_MAXIMO = 60; // definindo o limite , por isso o final statatic, essa valor nao pode mudar.

	// Esse m�todo � respons�vel por criar os numeros aleatorios dentro do limite.
	private int sortearNumero(int limite) {
		//feito um casting para garantir que os numeros ser�o inteiros, e arredondando atrav�s do math.round.
		return (int) Math.round(Math.random() * limite); // aqui definindo numeros aleatorios em que os numeros estar�o entre 1 e 60. 
	}

	// Esse m�todo � respons�vel por definir a sequencia pegando os valores aleat�rios e colocando na sequencia. 
	private ArrayList<Integer> sortearSequencia() {  // definindo que aqui ser� uma lista de arrays do tipo integer no m�todo.
		int contador = 0;  //inicializando o contador.
		ArrayList<Integer> sequencia = new ArrayList<>(); //criando sempre uma nova lista onde sequencia recebe esse array .
		while (contador < 6) { // aqui defino a quantidade de numeros que ser�o criados entre 1 e 60
			int numeroSorteado = sortearNumero(LIMITE_MAXIMO); // aqui criando uma varaivel onde recebe os numeros aleatorios que serao 
			//gerados atrav�s do math.random dentro do limite de 60. 
			if (sequencia.contains(numeroSorteado) || numeroSorteado == 0) { // essa parte aqui faz uma valida��o pra garantir valores v�lidos.
				continue;
			}
			sequencia.add(numeroSorteado); //aqui adicionando os numeros da sequencia.
			contador++; // e o contador realizando o loop 6 vezes.
		}
		return sequencia; // os numeros criados.
	}

	// Esse m�todo � respons�vel por gerar a quantidade dos jogos que serao feitos de acordo com o usu�rio.
	public void gerarJogos(int quantidadeJogos) {  // metodo recebendo parametro que ser� dado pelo usu�rio
		System.out.println("\n***           Jogos Sorteados           ***");
		for (int i = 0; i < quantidadeJogos; i++) { // de acordo com a quantidade de jogos que for definido, ser� gerado os numeros.
			System.out.print((i + 1) + "� Jogo: "); // aqui � so numerando o jogo criado, ex: jogo 1, jogo 2, etc.
			for (int n : sortearSequencia()) { // aqui pegando a a sequencia de numeros sorteados no metodo acima e jogando na var n .
				System.out.print(n + "   ");
				//System.out.println(sortearSequencia().lastIndexOf(sortearSequencia()));
				
			}
			System.out.println();
		}
		System.out.println("*********************************************");
	}

}
