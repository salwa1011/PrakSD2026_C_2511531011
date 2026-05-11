package pekan6_2511531011;

public class insertDLL_2511531011 {
	//menambahkan node di awal DLL
	static NodeDLL_2511531011 insertBegin_1011(NodeDLL_2511531011 head_1011, int data_1011) {
		//buat node baru
		NodeDLL_2511531011 new_node_1011 = new NodeDLL_2511531011(data_1011);
		//jadikan pointer nextnya head
		new_node_1011.next_1011 = head_1011;
		//jadikan pointer prev head ke new_node
		if (head_1011 != null) {
			head_1011.prev_1011 = new_node_1011;
		}
		return new_node_1011;
	}
	
	//fungsi menambahkan node di akhir
	public static NodeDLL_2511531011 insertAtEnd_1011(NodeDLL_2511531011 head_1011, int new_data_1011) {
		//buat node baru
		NodeDLL_2511531011 newNode_1011 = new NodeDLL_2511531011(new_data_1011);
		//jika DLL null jadikan head
		if (head_1011 == null) {
			head_1011 = newNode_1011;
		} else {
			NodeDLL_2511531011 curr_1011 = head_1011;
			while (curr_1011.next_1011 != null) {
				curr_1011 = curr_1011.next_1011;
			}
			curr_1011.next_1011 = newNode_1011;
			newNode_1011.prev_1011 = curr_1011;
		}
		return head_1011;
		
	}
	
	//fungsi menambahkan node di posisi terakhir
	public static NodeDLL_2511531011 insertAtPosition_1011 (NodeDLL_2511531011 head_1011, int pos_1011, int new_data_1011) {
		//buat node baru
		NodeDLL_2511531011 new_node_1011 = new NodeDLL_2511531011(new_data_1011);
		if (pos_1011 == 1) {
			new_node_1011.next_1011 = head_1011;
			if (head_1011 != null) {
				head_1011.prev_1011 = new_node_1011;
			}
			head_1011 = new_node_1011;
			return head_1011;
		}
		NodeDLL_2511531011 curr_1011 = head_1011;
		for (int i = 1; i < pos_1011 - 1 && curr_1011 != null; ++i) {
			curr_1011 = curr_1011.next_1011;
		}
		if (curr_1011 == null) {
			System.out.println("Posisi tidak ada");
			return head_1011;
		}
		new_node_1011.prev_1011 = curr_1011;
		new_node_1011.next_1011 = curr_1011.next_1011;
		curr_1011.next_1011 = new_node_1011;
		if (new_node_1011.next_1011 != null) {
			new_node_1011.next_1011.prev_1011 = new_node_1011;
		}
		return head_1011;
	}
	
	public static void printList_1011(NodeDLL_2511531011 head_1011) {
		NodeDLL_2511531011 curr_1011 = head_1011;
		while (curr_1011 != null) {
			System.out.print(curr_1011.data_1011 + " <-> ");
			curr_1011 = curr_1011.next_1011;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		//membuat dll 2 <-> 3 <-> 5
		NodeDLL_2511531011 head_1011 = new NodeDLL_2511531011(2);
		head_1011.next_1011 = new NodeDLL_2511531011(3);
		head_1011.next_1011.prev_1011 = head_1011;
		head_1011.next_1011.next_1011 = new NodeDLL_2511531011(5);
		head_1011.next_1011.next_1011.prev_1011 = head_1011;
		
		//cetak DLL awal
		System.out.print("DLL awal: ");
		printList_1011(head_1011);
		
		//tambah 1 di awal
		head_1011 = insertBegin_1011(head_1011, 1);
		System.out.print("Simpul 1 ditambah di awal: ");
		printList_1011(head_1011);
		//tambah 6 di akhir
		System.out.print("Simpul 6 ditambah di akhir: ");
		int data_1011 = 6;
		head_1011 = insertAtEnd_1011(head_1011, data_1011);
		printList_1011(head_1011);
		//menambah 4 di posisi 4
		System.out.print("Tambah node 4 di posisi ke 4: ");
		int data2_1011 = 4;
		int pos_1011 = 4;
		head_1011 = insertAtPosition_1011(head_1011, pos_1011, data2_1011);
		printList_1011(head_1011);
	}


}
