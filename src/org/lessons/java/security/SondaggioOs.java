package org.lessons.java.security;

public class SondaggioOs {
		public static void main(String[] args) {
			
			float totalStudents = 190;
			float linuxUsers = ((43/totalStudents)*100);
			float osxUsers = ((67/totalStudents)*100);
			float windowsUsers = ((80/totalStudents)*100);
			
			System.out.println("Totale studenti intervistati: " + totalStudents);
			System.out.println("Utenti linux: " + linuxUsers + "%");
			System.out.println("Utenti osx: " + osxUsers + "%");
			System.out.println("Utenti windows: " + windowsUsers + "%"); //senza casting per vedere la differenza in console
			
			System.out.println("-------------------------------------------------------------");
			
			//con casting da float ad int
			System.out.println("Totale studenti intervistati (casting int): " + (int)totalStudents);
			System.out.println("Utenti linux: " + (int)linuxUsers + "%");
			System.out.println("Utenti osx: " + (int)osxUsers + "%");
			System.out.println("Utenti windows: " + (int)windowsUsers + "%");
		}
}
