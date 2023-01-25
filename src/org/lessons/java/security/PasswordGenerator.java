package org.lessons.java.security;

public class PasswordGenerator {
		public static void main(String[] args) {
			
			String nome = "Federico";
			String cognome = "Treleani";
			String colorePrefe = "Rosso";
			byte giorno = 28;
			byte mese = 9;
			short anno = 1994;
			int sommaData = giorno + mese + anno;
			
			String password = nome + "-" + cognome + "-" + colorePrefe + "-" + sommaData;
			
			System.out.println(password);

		}
}
