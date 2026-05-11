package pekan6_2511531011;

public class PenelusuranDLL_2511531011 {
	//fungsi penelusuran maju
	static void forwardTraversal_1011(NodeDLL_2511531011 head_1011) {
		//memulai penelursuran dari head
		NodeDLL_2511531011 curr_1011 = head_1011;
		//lanjutkan sampai akhir
		while (curr_1011 != null) {
			//print data
			System.out.print(curr_1011.data_1011 + " <-> ");
			//pindah ke node berikutnya
			curr_1011 = curr_1011.next_1011;
		}
		//print spasi
		System.out.println();
	}
	
	//fungsi penelusuran mundur
	static void backwardTraversal_1011(NodeDLL_2511531011 tail_1011) {
		//mulai dari akhir
		NodeDLL_2511531011 curr_1011 = tail_1011;
		//lanjut sampai head
		while (curr_1011 != null) {
			//cetak data
			System.out.print(curr_1011.data_1011 + " <-> ");
			//pindah ke node sebelumnya
			curr_1011 = curr_1011.prev_1011;
		}
		//cetak spasi
		System.out.println();
	}

	public static void main(String[] args) {
		//cetak DLL
		NodeDLL_2511531011 head_1011 = new NodeDLL_2511531011(1);
		NodeDLL_2511531011 second_1011 = new NodeDLL_2511531011(2);
		NodeDLL_2511531011 third_1011 = new NodeDLL_2511531011(3);
		
		head_1011.next_1011 = second_1011;
		second_1011.prev_1011 = head_1011;
		second_1011.next_1011 = third_1011;
		third_1011.prev_1011 = second_1011;
		
		System.out.println("Penelursuran maju: ");
		forwardTraversal_1011(head_1011);
		
		System.out.println("Penelursuran mundur: ");
		backwardTraversal_1011(third_1011);

	}

}
