package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
		public static void main(String[] args) {
			
			Scanner scannerObj = new Scanner(System.in);
			
			System.out.println("Inserisci il nome:");
			String nome = scannerObj.nextLine();
			
			System.out.println("Inserisci il cognome:");
			String cognome = scannerObj.nextLine();
			
			String colorePrefe = "rosso";
			int giorno = 28;
			int mese = 9;
			int anno = 1994;
			int sommaData = giorno + mese + anno;
			
			String password = nome + "-" + cognome + "-" + colorePrefe + "-" + sommaData;
			
			System.out.println(password);

		}
}
