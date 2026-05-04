package pekan5_2511531011;

public class HapusSLL_2511531011 {
	//fungsi untuk menghapus head
	public static NodeSLL_2511531011 deleteHead_2511531011(NodeSLL_2511531011 head_1011) {
		//jika SLL kosong
		if (head_1011 == null)
			return null;
		//pindahkan head ke node berikutnya
		head_1011 = head_1011.next_1011;
		//return head baru
		return head_1011;
	}
	//fungsi menghapus node terakhir SLL
	public static NodeSLL_2511531011 removeLastNode_2511531011 (NodeSLL_2511531011 head_1011) {
		//jika list kosong, return null
		if (head_1011 == null) {
			return null;
		}
		//jika list satu node, hapus node dan return null
		if (head_1011.next_1011 == null) {
			return null;
		}
		//temukan node terakhir ke dua
		NodeSLL_2511531011 secondLast_2511531011 = head_1011;
		while (secondLast_2511531011.next_1011.next_1011 != null) {
			secondLast_2511531011 = secondLast_2511531011.next_1011;
		}
		//hapus node terakhir
		secondLast_2511531011.next_1011 = null;
		return head_1011;
	}
	//fungsi menghapus node di posisi tertentu
	public static NodeSLL_2511531011 deleteNode_2511531011(NodeSLL_2511531011 head_1011, int position_1011) {
		NodeSLL_2511531011 temp_1011 = head_1011;
		NodeSLL_2511531011 prev_1011 = null;
		//jika linked list null 
		if (temp_1011 == null)
			return head_1011;
		//kasus 1: head dihapus
		if (position_1011 == 1) {
			head_1011 = temp_1011.next_1011;
			return head_1011;
		}
		//kasus 2: menghapus node di tengah 
		//telusuri ke node yang dihapus
		for (int i = 1; temp_1011 != null && i < position_1011; i++) {
			prev_1011 = temp_1011;
			temp_1011 = temp_1011.next_1011;
		}
		//jika ditemukan, hapus node
		if (temp_1011 != null) {
			prev_1011.next_1011 = temp_1011.next_1011;
		} else {
			System.out.print("Data tidak ada");
		}
			return head_1011;
	}
	//fungsi mencetak SLL
	public static void printList_2511531011(NodeSLL_2511531011 head_1011) {
		NodeSLL_2511531011 curr_1011 = head_1011;
		while (curr_1011.next_1011 != null) {
			System.out.print(curr_1011.data_1011 + "-->");
			curr_1011 = curr_1011.next_1011;
		}
		if (curr_1011.next_1011 == null) {
			System.out.print(curr_1011.data_1011);
		}
		System.out.println();
	}
	//kelas main
	public static void main (String [] args) {
		//buat SLL 1->2->3->4->5->6->null
		NodeSLL_2511531011 head_1011 = new NodeSLL_2511531011(1);
		head_1011.next_1011 = new NodeSLL_2511531011(2);
		head_1011.next_1011.next_1011 = new NodeSLL_2511531011(3);
		head_1011.next_1011.next_1011.next_1011 = new NodeSLL_2511531011(4);
		head_1011.next_1011.next_1011.next_1011.next_1011 = new NodeSLL_2511531011(5);
		head_1011.next_1011.next_1011.next_1011.next_1011.next_1011 = new NodeSLL_2511531011(6);
		//cetak list awal
		System.out.println("List awal: ");
		printList_2511531011(head_1011);
		//hapus head
		head_1011 = deleteHead_2511531011(head_1011);
		System.out.println("List setelah head dihapus: ");
		printList_2511531011(head_1011);
		//hapus node terakhir
		head_1011 = removeLastNode_2511531011(head_1011);
		System.out.println("List setelah simpul terakhir dihapus: ");
		printList_2511531011(head_1011);
		//deleting node at position 2
		int position_1011 = 2;
		head_1011 = deleteNode_2511531011(head_1011, position_1011);
		//print list after deletion
		System.out.println("List setelah posisi 2 dihapus: ");
		printList_2511531011(head_1011);
	}

}
