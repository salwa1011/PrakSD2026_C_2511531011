package pekan5_2511531011;

public class PencarianSLL_2511531011 {
	static boolean searchKey_2511531011 (NodeSLL_2511531011 head_1011, int key_1011) {
		NodeSLL_2511531011 curr_1011 = head_1011;
		while (curr_1011 != null) {
			if (curr_1011.data_1011 == key_1011)
				return true;
			curr_1011 = curr_1011.next_1011;
		}
		return false;
	}
	public static void traversal_2511531011 (NodeSLL_2511531011 head_1011) {
		//mulai dari head
		NodeSLL_2511531011 curr_1011 = head_1011;
		//telusuri sampai pointer null
		while (curr_1011 != null) {
			System.out.print(" " + curr_1011.data_1011);
			curr_1011 = curr_1011.next_1011;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		NodeSLL_2511531011 head_1011 = new NodeSLL_2511531011(14);
		head_1011.next_1011 = new NodeSLL_2511531011(21);
		head_1011.next_1011.next_1011 = new NodeSLL_2511531011(13);
		head_1011.next_1011.next_1011.next_1011 = new NodeSLL_2511531011(30);
		head_1011.next_1011.next_1011.next_1011.next_1011 = new NodeSLL_2511531011(10);
		System.out.print("Penelusuran SLL : ");
		traversal_2511531011(head_1011);
		//data yang akan dicari
		int key_1011 = 30;
		System.out.print("Cari data " + key_1011 + " = ");
		if (searchKey_2511531011(head_1011, key_1011))
			System.out.println("ketemu");
		else
			System.out.println("tidak ada");

	}

}
