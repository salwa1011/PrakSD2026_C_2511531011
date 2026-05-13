package pekan6_2511531011;

import java.util.Scanner;

public class Musik_2511531011 {
	private Lagu_2511531011 head_1011;
	public static Lagu_2511531011 tambahLagu_1011(Lagu_2511531011 head_1011, String newJudul_1011, String newPenyanyi_1011) {
		//buat node baru
		Lagu_2511531011 newNode_1011 = new Lagu_2511531011(newJudul_1011, newPenyanyi_1011);
		//jika DLL null jadikan head
		if (head_1011 == null) {
			head_1011 = newNode_1011;
		} else {
			Lagu_2511531011 curr_1011 = head_1011;
			while (curr_1011.next_1011 != null) {
				curr_1011 = curr_1011.next_1011;
			}
			curr_1011.next_1011 = newNode_1011;
			newNode_1011.prev_1011 = curr_1011;
		}
		System.out.println("Lagu " + newJudul_1011 + " - " + newPenyanyi_1011 + " berhasil dimasukkan!");
		return head_1011;
	}
	
	//fungsi menghapus node awal
		public static Lagu_2511531011 hapusLaguAwal_1011(Lagu_2511531011 head_1011) {
			if (head_1011 == null) {
				System.out.println("Playlist kosong.");
				return null;
			}
			Lagu_2511531011 temp_1011 = head_1011;
			head_1011 = head_1011.next_1011;
			if (head_1011 != null) {
				head_1011.prev_1011 = null;
			}
			System.out.println("Lagu " + temp_1011.judul_1011 + " - " + temp_1011.penyanyi_1011 + " berhasil dihapus!");
			return head_1011;
		}
		
	//fungsi menampilkan semua lagu dari awal ke akhir
		static void tampilMaju_1011(Lagu_2511531011 head_1011) {
			if (head_1011 == null) {
				System.out.println("Playlist kosong.");
				return;
			}
			
			System.out.println("Urutan lagu dari awal sampai akhir:");
			//memulai penelursuran dari head
			Lagu_2511531011 curr_1011 = head_1011;
			//lanjutkan sampai akhir
			while (curr_1011 != null) {
				//print data
				System.out.print("Lagu: " + curr_1011.judul_1011 + ", Penyanyi: " + curr_1011.penyanyi_1011 + " <-> \n");
				//pindah ke node berikutnya
				curr_1011 = curr_1011.next_1011;
			}
			//print spasi
			System.out.println();
		}
		
	//fungsi menampilkan lagu dari akhir sampai awal
		static void tampilMundur_1011(Lagu_2511531011 tail_1011) {
			if (tail_1011 == null) {
				System.out.println("Playlist kosong.");
				return;
			}
			
			System.out.println("Urutan lagu dari akhir sampai awal:");
			//mulai dari akhir
			Lagu_2511531011 curr_1011 = tail_1011;
			//lanjut sampai head
			while (curr_1011 != null) {
				//cetak data
				System.out.print("Lagu: " + curr_1011.judul_1011 + ", Penyanyi: " + curr_1011.penyanyi_1011 + " <-> \n");
				//pindah ke node sebelumnya
				curr_1011 = curr_1011.prev_1011;
			}
			//cetak spasi
			System.out.println();
		}
		
	//fungsi cari lagu berdasarkan judul
		public void cariLagu_1011(String cariJudul_1011) {

			// cek apakah list kosong
			if (head_1011 == null) {

				System.out.println("Playlist kosong.");
				return;
			}

			Lagu_2511531011 curr_1011 = head_1011;
			int posisi_1011 = 1;
			boolean ditemukan_1011 = false;
			// traversal untuk pencarian data
			while (curr_1011 != null) {

				// pencarian tanpa membedakan huruf besar kecil
				if (curr_1011.getJudul_1011().equalsIgnoreCase(cariJudul_1011)) {
					System.out.println("Lagu ditemukan pada posisi " + posisi_1011);
					System.out.println(curr_1011);
					ditemukan_1011 = true;
					break;
				}
				curr_1011 = curr_1011.getPointer_1011();
				posisi_1011++;
			}
			// jika data tidak ditemukan
			if (!ditemukan_1011) {
				System.out.println("lagu dengan judul " + cariJudul_1011 + " tidak ditemukan.");
			}
		}
		
		// method untuk menampilkan menu
		public static void tampilkanMenu_1011() {
			System.out.println("\n=== Playlist Musik NIM: 2511531011 ===");
			System.out.println("1. Tambah Lagu");
			System.out.println("2. Hapus Lagu Pertama");
			System.out.println("3. Lihat Playlist (Maju)");
			System.out.println("4. Lihat Playlist (Mundur)");
			System.out.println("5. Cari lagu");
			System.out.println("6. Keluar");
			System.out.print("Pilihan : ");
		}
	    
		public static void main(String[] args) {
			Scanner input_1011 = new Scanner(System.in);
			Musik_2511531011 m_1011 = new Musik_2511531011();
			int pilihan_1011;
			do {
				tampilkanMenu_1011();
				pilihan_1011 = input_1011.nextInt();
				input_1011.nextLine();
				switch (pilihan_1011) {
					case 1:
						System.out.print("Masukkan judul lagu : ");
						String judul_1011 = input_1011.nextLine();
						System.out.print("Masukkan penyanyi : ");
						String penyanyi_1011 = input_1011.nextLine();
						m_1011.head_1011 =
						tambahLagu_1011(m_1011.head_1011, judul_1011, penyanyi_1011);
						break;
					case 2:
						m_1011.head_1011 =
						hapusLaguAwal_1011(m_1011.head_1011);
						break;
					case 3:
						tampilMaju_1011(m_1011.head_1011);
						break;
					case 4:
						Lagu_2511531011 tail_1011 = m_1011.head_1011;
						while (tail_1011 != null && tail_1011.next_1011 != null) {
							tail_1011 = tail_1011.next_1011;
						}
						tampilMundur_1011(tail_1011);
						break;
					case 5:
						System.out.print("Masukkan judul lagu yang dicari : ");
						String cariJudul_1011 = input_1011.nextLine();
						m_1011.cariLagu_1011(cariJudul_1011);
						break;
					case 6:
						System.out.println("Keluar dari program.");
						break;
					default:
						System.out.println("Pilihan tidak valid.");
				}

			} while (pilihan_1011 != 6);
			input_1011.close();
		}
		
}
