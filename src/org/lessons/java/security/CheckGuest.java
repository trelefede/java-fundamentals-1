package org.lessons.java.security;

import java.util.Scanner;

public class CheckGuest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean presente = false;
		String[] invitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
				"Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeili" };

		System.out.println("Nome, prego?");
		String nome = sc.nextLine();

		int i = 0;

		// con ciclo for
		for (i = 0; i < invitati.length; i++) {
			if (nome.equalsIgnoreCase(invitati[i])) {
				presente = true;
			}
		}

		if (presente) {
			System.out.println("Mi dispiace per te, PUOI entrare! Ciclo For");
		} else {
			System.out.println("Ti sei salvato la serata, NON SEI IN LISTA! Ciclo For");
		}

		// con ciclo while
		while (i < invitati.length) {
			if (nome.equalsIgnoreCase(invitati[i])) {
				presente = true;
			}
			i++;
		}

		if (presente) {
			System.out.println("Mi dispiace per te, PUOI entrare! Ciclo While");
		} else {
			System.out.println("Ti sei salvato la serata, NON SEI IN LISTA! Ciclo While");
		}
	}
}
