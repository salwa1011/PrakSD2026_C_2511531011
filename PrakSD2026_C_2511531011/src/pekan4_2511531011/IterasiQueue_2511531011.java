package pekan4_2511531011;

import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;

public class IterasiQueue_2511531011 {

	public static void main(String[] args) {
		Queue<String> q_1011 = new LinkedList<>();
		q_1011.add("Praktikum");
		q_1011.add("Struktur");
		q_1011.add("Data");
		q_1011.add("Dan");
		q_1011.add("Algoritma");
		Iterator<String> iterator_1011 = q_1011.iterator();
		while (iterator_1011.hasNext()) {
			System.out.print(iterator_1011.next() + " ");
		}

	}

}
