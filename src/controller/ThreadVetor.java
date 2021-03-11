package controller;

import java.util.Random;

public class ThreadVetor extends Thread{
	
	private int n;
	private int[] vetor;
	Random random = new Random();
	
	public ThreadVetor(int n, int vetor[]) {
		this.n = n;
		this.vetor = vetor;
	}
	@Override
	public void run() {
		if (n % 2 == 0) {
			double tempoInicial = System.nanoTime();
				for (int i = 0; i < vetor.length; i++) {
					vetor[i] = (int) (Math.random()*101);
					
				}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("String for ==>"+tempoTotal+"s.");
				
		}
		else {
			double tempoInicial = System.nanoTime();
			for (int i:vetor) {
				vetor[i] = (int) (Math.random()*101);
			}
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			tempoTotal = tempoTotal / Math.pow(10, 9);
			System.out.println("String for each ==>"+tempoTotal+"s.");
			}
	}		
}	
