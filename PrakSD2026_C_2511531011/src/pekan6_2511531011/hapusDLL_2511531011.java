package pekan6_2511531011;

public class hapusDLL_2511531011 {
	//fungsi menghapus node awal
	public static NodeDLL_2511531011 delHead_1011(NodeDLL_2511531011 head_1011) {
		if (head_1011 == null) {
			return null;
		}
		NodeDLL_2511531011 temp_1011 = head_1011;
		head_1011 = head_1011.next_1011;
		if (head_1011 != null) {
			head_1011.prev_1011 = null;
		}
		return head_1011;
	}
	
	//fungsi menghapus node akhir
		public static NodeDLL_2511531011 delLast_1011(NodeDLL_2511531011 head_1011) {
			if (head_1011 == null) {
				return null;
			}
			if (head_1011.next_1011 == null) {
				return null;
			}
			NodeDLL_2511531011 curr_1011 = head_1011;
			while (curr_1011.next_1011 != null) {
				curr_1011 = curr_1011.next_1011;
			}
			
			//update pointer previous node
			if (curr_1011 != null) {
				curr_1011.prev_1011.next_1011 = null;
			}
			return head_1011;
		}
		
	//fungsi menghapus node di posisi tertentu
		public static NodeDLL_2511531011 delPos_1011(NodeDLL_2511531011 head_1011, int pos_1011) {
			//jika DLL kosong
			if (head_1011 == null) {
				return head_1011;
			}
			NodeDLL_2511531011 curr_1011 = head_1011;
			//telusuri sampai ke node yang akan dihapus
			for (int i = 1; curr_1011 != null && i < pos_1011; ++i) {
				curr_1011 = curr_1011.next_1011;
			}
			//jika posisi tidak ditemukan
			if (curr_1011 == null) {
				return head_1011;
			}
			//update poiter
			if (curr_1011.prev_1011 != null) {
				curr_1011.prev_1011.next_1011 = curr_1011.next_1011;
			}
			if (curr_1011.next_1011 != null) {
				curr_1011.next_1011.prev_1011 = curr_1011.prev_1011;
			}
			//jika yang dihapus head
			if (head_1011 == curr_1011) {
				head_1011 = curr_1011.next_1011;
			}
			return head_1011;
		}
		
	//fungsi mencetak DLL
		public static void printList_1011(NodeDLL_2511531011 head_1011) {
			NodeDLL_2511531011 curr_1011 = head_1011;
			while (curr_1011 != null) {
				System.out.print(curr_1011.data_1011 + " ");
				curr_1011 = curr_1011.next_1011;
			}
			System.out.println();
		}

	public static void main(String[] args) {
		//buat sebuah DLL
		NodeDLL_2511531011 head_1011 = new NodeDLL_2511531011(1);
		head_1011.next_1011 = new NodeDLL_2511531011(2);
		head_1011.next_1011.prev_1011 = head_1011;
		head_1011.next_1011.next_1011 = new NodeDLL_2511531011(3);
		head_1011.next_1011.next_1011.prev_1011 = head_1011.next_1011;
		head_1011.next_1011.next_1011.next_1011 = new NodeDLL_2511531011(4);
		head_1011.next_1011.next_1011.next_1011.prev_1011 = head_1011.next_1011.next_1011;
		head_1011.next_1011.next_1011.next_1011.next_1011 = new NodeDLL_2511531011(5);
		head_1011.next_1011.next_1011.next_1011.next_1011.prev_1011 = head_1011.next_1011.next_1011.next_1011;
		
		System.out.print("DLL awal: ");
		printList_1011(head_1011);
		
		System.out.print("Setelah head dihapus: ");
		head_1011 = delHead_1011(head_1011);
		printList_1011(head_1011);
		
		System.out.print("Setelah node terakhir dihapus: ");
		head_1011 = delLast_1011(head_1011);
		printList_1011(head_1011);
		
		System.out.print("Menghapus node ke 2: ");
		head_1011 = delPos_1011(head_1011, 2);
		
		printList_1011(head_1011);

	}

}
