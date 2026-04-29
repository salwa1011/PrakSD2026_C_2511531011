package pekan4_2511531011;

import java.util.*;

public class AntrianLoketDriver_2511531011 {
		public static void tampilkanMenu_2511531011() {
			System.out.println("\n1. Tambah Antrian");
			System.out.println("2. Hapus Antrian");
			System.out.println("3. Tampilkan Antrian");
			System.out.println("4. Reverse");
			System.out.println("5. Keluar");
		}
		
		public static void main (String[] args) {
			Scanner scanner = new Scanner(System.in);
			AntrianLoket_2511531011 antrian = new AntrianLoket_2511531011(10);
			int choice;
			
			System.out.println("=== Program Antrian Loket ===");
			
			do {
				tampilkanMenu_2511531011();
				System.out.print("\nPrint Menu: ");
				choice = scanner.nextInt();
				scanner.nextLine();
				
				switch (choice) {
				case 1:
					System.out.print("Masukkan nama pelanggan:");
					String nama_1011 = scanner.nextLine();
					antrian.enqueue_2511531011(nama_1011);
					break;
				case 2:
					String keluar = antrian.dequeue_2511531011();
					if (keluar == null) {
						System.out.println("Antrian kosong");
						} else {
							System.out.println(keluar + " telah dilayani");
							}
					break;
				case 3:
					antrian.display_2511531011();
					break;
				case 4:
					antrian.reverse_2511531011();
					break;
				case 5:
					System.out.println("Program Selesai");
					break;
				default: 
					System.out.println("Pilihan tidak valid");
				}
			} while (choice !=5);
			scanner.close();
		}

}
