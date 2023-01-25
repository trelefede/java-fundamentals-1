package org.lessons.java.security;

public class PasswordGenerator {
		public static void main(String[] args) {
			
			String nome = "Federico";
			String cognome = "Treleani";
			String colorePrefe = "Rosso";
			int giorno = 28;
			int mese = 9;
			int anno = 1994;
			int sommaData = giorno + mese + anno;
			
			String password = nome + "-" + cognome + "-" + colorePrefe + "-" + sommaData;
			
			System.out.println(password);

		}
}
