package org.lessons.java.security;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {

		double prezzoKm = 0.21;
		int scontoYoung = 20;
		int scontoSenior = 40;

		Scanner input = new Scanner(System.in);

		System.out.println("Quanti km vuoi fare? ");
		int km = input.nextInt();

		System.out.println("Quanti anni hai? ");
		int età = input.nextInt();

		double prezzoBiglietto = km * prezzoKm;
		double prezzoBiglietto20 = (prezzoBiglietto * scontoYoung) / 100;
		double prezzoBiglietto40 = (prezzoBiglietto * scontoSenior) / 100;

		if (età < 18) {
			System.out.println("Prezzo biglietto con sconto young " + prezzoBiglietto20 + "€");
		} else if (età > 65) {
			System.out.println("Prezzo biglietto con sconto senior " + prezzoBiglietto40 + "€");
		} else {
			System.out.println("Per te nessuno sconto! Prezzo biglietto " + prezzoBiglietto + "€");
		}
	}
}
