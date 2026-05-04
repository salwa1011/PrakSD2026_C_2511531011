package pekan5_2511531011;

public class TambahSLL_2511531011 {
	public static NodeSLL_2511531011 insertAtFront_2511531011(NodeSLL_2511531011 head_1011, int value_1011) {
		NodeSLL_2511531011 new_node_1011 = new NodeSLL_2511531011(value_1011);
		new_node_1011.next_1011 = head_1011;
		return new_node_1011;
	}
	//fungsi menambahkan node di akhir SLL
	public static NodeSLL_2511531011 insertAtEnd_2511531011(NodeSLL_2511531011 head_1011, int value_1011) {
		//buat sebuah node dengan sebuah nilai
		NodeSLL_2511531011 newNode_1011 = new NodeSLL_2511531011(value_1011);
		//jika list kosong maka node jadi head
		if (head_1011 == null) {
			return newNode_1011;
		}
		//simpan head ke variabel sementara
		NodeSLL_2511531011 last_1011 = head_1011;
		//telusuri ke node akhir
		while (last_1011.next_1011 != null) {
			last_1011 = last_1011.next_1011;
		}
		//ubah pointer
		last_1011.next_1011 = newNode_1011;
		return head_1011;
	}
	static NodeSLL_2511531011 GetNode_2511531011(int data_1011) {
		return new NodeSLL_2511531011(data_1011);
	}
	static NodeSLL_2511531011 insertPos_2511531011(NodeSLL_2511531011 headNode_1011, int position_1011, int value_1011) {
		NodeSLL_2511531011 head_1011 = headNode_1011;
		if (position_1011 < 1)
			System.out.print("Invalid Position");
		if (position_1011 == 1) {
			NodeSLL_2511531011 new_node_1011 = new NodeSLL_2511531011(value_1011);
			new_node_1011.next_1011 = head_1011;
			return new_node_1011;
		} else {
			while (position_1011-- !=0) {
				if (position_1011 == 1) {
					NodeSLL_2511531011 newNode_1011 = GetNode_2511531011(value_1011);
					newNode_1011.next_1011 = headNode_1011.next_1011;
					headNode_1011.next_1011 = newNode_1011;
					break;
				}
				headNode_1011 = headNode_1011.next_1011;
			}
			if (position_1011 !=1)
				System.out.print("Posisi diluar jangkauan");
		}
			return head_1011;
		}
		public static void printList_2511531011(NodeSLL_2511531011 head_1011) {
			NodeSLL_2511531011 curr_1011 = head_1011;
			while (curr_1011.next_1011 != null) {
				System.out.print(curr_1011.data_1011+"-->");
				curr_1011 = curr_1011.next_1011;
			}
			if (curr_1011.next_1011==null) {
				System.out.print(curr_1011.data_1011);
			}
			System.out.println();
		}
		public static void main(String [] args) {
			//buat linkedlist 2->3->4->5->6
			NodeSLL_2511531011 head_1011 = new NodeSLL_2511531011(2);
			head_1011.next_1011 = new NodeSLL_2511531011(3);
			head_1011.next_1011.next_1011 = new NodeSLL_2511531011(5);
			head_1011.next_1011.next_1011.next_1011 = new NodeSLL_2511531011(6);
			//cetak list asli
			System.out.print("Senarai Berantai Awal: ");
			printList_2511531011(head_1011);
			//tambahkan node baru di depan
			System.out.print("tambah 1 simpul di depan: ");
			int data_1011 = 1;
			head_1011 = insertAtFront_2511531011(head_1011, data_1011);
			//cetak update list
			printList_2511531011(head_1011);
			//tambahkan baru di belakang
			System.out.print("tambah 1 simpul di belakang: ");
			int data2_1011 = 7;
			head_1011 = insertAtEnd_2511531011(head_1011, data2_1011);
			//cetak update list
			printList_2511531011(head_1011);
			System.out.print("tambah 1 simpul ke data 4: ");
			int data3_1011 = 4;
			int pos_1011 = 4;
			head_1011 = insertPos_2511531011(head_1011, pos_1011, data3_1011);
			//cetak update list
			printList_2511531011(head_1011);
		}

}
