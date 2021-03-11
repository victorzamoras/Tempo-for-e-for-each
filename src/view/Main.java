package view;

import controller.ThreadVetor;

public class Main {
	
	public static void main (String[] args) {
		int vetor[] = new int[1000];
		
		Thread t = new ThreadVetor(1,vetor);
		Thread t1 = new ThreadVetor(2,vetor);
		t.start();
		t1.start();
		}
		
	}
