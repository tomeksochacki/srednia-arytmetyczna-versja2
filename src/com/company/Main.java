package com.company;

public class Main {

    public static void main(String[] args) {
	int[] tablica = new int[] {20, 20, 13, 30, 100, 20, 102, 4, 10, 17};

	int długość = tablica.length;
	int max = tablica[0];
	int min = tablica[0];

	float suma = 0;


	for (int i = 0; i<długość; i++) {

		if (tablica[i] > max) {
			max = tablica[i];
		}
		if (tablica[i] < min) {
			min = tablica[i];
		}


		suma = suma + tablica[i];
		
	}
		float średnia = 0;
		średnia = suma/tablica.length;

	System.out.println(max);
	System.out.println(min);
	System.out.println(suma);
	System.out.println(średnia);
    }
}
