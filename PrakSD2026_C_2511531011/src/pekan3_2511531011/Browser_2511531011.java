package pekan3_2511531011;

import java.util.Stack;
import java.util.Scanner;

public class Browser_2511531011 {
	// 1. Method untuk pilih menu
		public static void tampilkanMenu_2511531011() {
			System.out.println("\n1. Kunjungi Website (Push)");
			System.out.println("2. Tombol Back (Pop)");
			System.out.println("3. Lihat Halaman Aktif (Peek)");
			System.out.println("4. Keluar");
		}
		
		// 2. Method untuk push
		public static void kunjungiWebsite_2511531011 (Stack<Website_2511531011> list, Scanner sc) {
			System.out.print("Masukkan Judul: ");
			String judul = sc.nextLine();
			System.out.print("Masukkan URL: ");
			String URL = sc.nextLine();
			Website_2511531011 web = new Website_2511531011(judul, URL);
			list.push(web);
			System.out.println("Berhasil Mengunjungi Halaman!");
			}
		
		// 3. Method untuk pop
		public static void tombolBack_2511531011 (Stack<Website_2511531011> list) {
			if (list.isEmpty()) {
				System.out.println("Histori kosong");
			} else {
				Website_2511531011 web = list.pop();
				System.out.println("Kembali dari: " + web.getJudul_1011());
			}
		}
		
		// 4. Method untuk peek
		public static void halamanAktif_2511531011 (Stack<Website_2511531011> list, Scanner sc) {
			if (list.isEmpty()) {
				System.out.println("Tidak ada halaman aktif");
			} else {
				Website_2511531011 web = list.peek();
				System.out.println("Halaman aktif: " + web.getJudul_1011() + " " + web.getURL_1011());
			}
		}

		public static void main (String[] args) {
			Stack<Website_2511531011> browser = new Stack<>();
			Scanner scanner = new Scanner(System.in);
			int choice;
			
			System.out.println("=== Browser History NIM: 2511531011 ===");
			
			do {
				tampilkanMenu_2511531011();
				System.out.print("\nPrint Menu: ");
				choice = scanner.nextInt();
				scanner.nextLine();
				
				switch (choice) {
				case 1:
					kunjungiWebsite_2511531011 (browser, scanner);
					break;
				case 2:
					tombolBack_2511531011 (browser);
					break;
				case 3:
					halamanAktif_2511531011 (browser, scanner);
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
