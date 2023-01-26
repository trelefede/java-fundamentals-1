package org.lessons.java.security;

public class CibiPreferiti {
	public static void main(String[] args) {

		String[] listaPrefe = { "Pizza", "Pizza fritta", "Pizza surgelata", "Pizza del kebabbaro", "Pizza fredda",
				"Pizza vecchia" };

		int lunghezzaLista = listaPrefe.length;
		String ultimaPosizione = listaPrefe[lunghezzaLista - 1];
		String posizioneIntermedia = listaPrefe[(lunghezzaLista - 1) / 2];

		System.out.println("Lunghezza lista: " + lunghezzaLista);
		System.out.println("Cibo top: " + listaPrefe[0]);
		System.out.println("Cibo intermedio: " + posizioneIntermedia);
		System.out.println("Cibo flop: " + ultimaPosizione);
	}
}
