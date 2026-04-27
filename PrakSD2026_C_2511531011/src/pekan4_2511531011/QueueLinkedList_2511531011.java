package pekan4_2511531011;

import java.util.Queue;
import java.util.LinkedList;

public class QueueLinkedList_2511531011 {

	public static void main(String[] args) {
		Queue<Integer> q_1011 = new LinkedList<>();
		// Tambah elemen {0, 1, 2, 3, 4, 5} ke antrian
		for (int i = 0; i < 6; i++) 
			q_1011.add(i);
		// Menampilkan isi antrian
		System.out.println("Elemen Antrian " + q_1011);
		// Untuk menghapus kepala antrian
		int hapus_1011 = q_1011.remove();
		System.out.println("Hapus elemen = " + hapus_1011);
		System.out.println(q_1011);
		// Untuk melihat antrian terdepan
		int depan_1011 = q_1011.peek();
		System.out.println("Kepala Antrian = " + depan_1011);
		
		int banyak_1011 = q_1011.size();
		System.out.println("Size antrian = " + banyak_1011);
	}

}
