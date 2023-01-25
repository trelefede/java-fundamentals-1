package org.lessons.java.security;

public class SondaggioOs {
		public static void main(String[] args) {
			
			int totalStudents = 190;
			int linuxUsers = ((43*100)/totalStudents);
			int osxUsers = ((67*100)/totalStudents);
			int windowsUsers = ((80*100)/totalStudents);
			
			System.out.println("Utenti linux:" + linuxUsers + "%");
			System.out.println("Utenti osx:" + osxUsers + "%");
			System.out.println("Utenti windows:" + windowsUsers + "%");
		}
}
