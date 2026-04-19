package pekan2_2511531011;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511531011 {
	// 1. Method untuk pilih menu
	public static void tampilkanMenu_2511531011() {
		System.out.println("\n1. Tambah Lagu");
		System.out.println("2. Lihat Playlist");
		System.out.println("3. Hapus Lagu");
		System.out.println("4. Keluar");
	}
	
	// 2. Method untuk tambah lagu
	public static void tambahLagu_2511531011 (ArrayList<Musik_2511531011> list, Scanner sc) {
		System.out.print("Masukkan Judul: ");
		String judulLagu = sc.nextLine();
		System.out.print("Masukkan Penyanyi: ");
		String penyanyi = sc.nextLine();
		System.out.print("Masukkan Durasi (Detik): ");
		String durasi = sc.nextLine();
		list.add(new Musik_2511531011 (judulLagu, penyanyi, durasi));
		System.out.println("Data berhasil ditambahkan");
		}
	
	// 3. Method untuk tampilkan semua data
	public static void tampilkanPlaylist_2511531011 (ArrayList<Musik_2511531011> list) {
		if (list.isEmpty()) {
			System.out.println("Playlist kosong");
		} else
			System.out.println("Playlist:");
		for (int i = 0; i < list.size(); i++) {
            Musik_2511531011 lagu = list.get(i);
            System.out.println((i + 1) + ". " + lagu.getJudul_1011() + " - " + lagu.getPenyanyi_1011() + " (" + lagu.getDurasi_1011() + " detik)");
        }
	}
	
	// 4. Method untuk hapus lagu
	public static void hapusLagu_2511531011 (ArrayList<Musik_2511531011> list, Scanner sc) {
		System.out.println("Masukkan judul lagu yang akan dihapus: ");
		String judulHapus = sc.nextLine();
		boolean removed = list.removeIf(m -> m.judulLagu_1011.equals(judulHapus));
		
		if (removed) {
			System.out.println("Lagu dengan judul " + judulHapus + " berhasil dihapus.");
		} else {
			System.out.println("Lagu tidak ditemukan.");
		}
	}

	public static void main (String[] args) {
		ArrayList<Musik_2511531011> musikList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		System.out.println("=== Playlist Musik NIM: 2511531011 ===");
		
		do {
			tampilkanMenu_2511531011();
			System.out.print("\nPrint Menu: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			case 1:
				tambahLagu_2511531011 (musikList, scanner);
				break;
			case 2:
				tampilkanPlaylist_2511531011 (musikList);
				break;
			case 3:
				hapusLagu_2511531011 (musikList, scanner);
				break;
			case 4:
				System.out.println("Keluar dari program.");
				break;
			default: 
				System.out.println("Pilihan tidak valid");
			}
		} while (choice !=4);
		scanner.close();
	}

}
