package pekan8_2511531011;

import java.util.Scanner;

public class Sorting_2511531011 {
	Scanner input_1011 = new Scanner(System.in);
	
	//array yang menyimpan maksimal 20 data
	static dataLagu_2511531011[] dataLagu_1011 = new dataLagu_2511531011[20];
	
	//method inputData
	public static dataLagu_2511531011 inputData_1011 (Scanner input_1011) {
		System.out.print("Judul Lagu: ");
		String judul_1011 = input_1011.nextLine();
		System.out.print("Penyanyi Lagu: ");
		String penyanyi_1011 = input_1011.nextLine();
		System.out.print("Durasi Lagu: ");
		int durasi_1011 = input_1011.nextInt();
		
		input_1011.nextLine();
		
		return new dataLagu_2511531011(judul_1011, penyanyi_1011, durasi_1011);
	}
	
	
	static void swap_1011(dataLagu_2511531011[] dataLagu_1011, int i, int j) {
		dataLagu_2511531011 temp_1011 = dataLagu_1011[i];
		dataLagu_1011[i] = dataLagu_1011[j];
		dataLagu_1011[j] = temp_1011;
	}
	
	//Metode tambahan untuk mengatur pivot dengan median of three
	static void medianOfThree_1011 (dataLagu_2511531011[] dataLagu_1011, int low_1011, int high_1011) {
		int mid_1011 = low_1011 + (high_1011-low_1011) /2;
		
		//Urutkan elemen low, mid, dan high
		if (dataLagu_1011[low_1011].getdurasi_1011() > dataLagu_1011[mid_1011].getdurasi_1011()) {
			swap_1011(dataLagu_1011, low_1011, mid_1011);
		}
		if (dataLagu_1011[low_1011].getdurasi_1011() > dataLagu_1011[high_1011].getdurasi_1011()) {
			swap_1011(dataLagu_1011, low_1011, high_1011);
		}
		if (dataLagu_1011[mid_1011].getdurasi_1011() > dataLagu_1011[high_1011].getdurasi_1011()) {
			swap_1011(dataLagu_1011, mid_1011, high_1011);
		}
		swap_1011(dataLagu_1011, mid_1011, high_1011);
	}
	
	static int partition_1011(dataLagu_2511531011[] dataLagu_1011, int low_1011, int high_1011) {
		//Panggil fungsi median of three sebelum menentukan pivot
		medianOfThree_1011(dataLagu_1011, low_1011, high_1011);
		
		dataLagu_2511531011 pivot_1011 = dataLagu_1011[high_1011]; // Sekarang arr[high] sudah berisi nilai median
		int i = (low_1011 - 1);
		
		for (int j = low_1011; j<=high_1011-1; j++) {
			//Jika elemen saat ini lebih keci dari atau sama dengan pivot
			if (dataLagu_1011[j].getdurasi_1011() < pivot_1011.getdurasi_1011()) {
				//Increment indeks elemen yang lebih kecil
				i++;
				swap_1011(dataLagu_1011, i, j);
			}
		}
		swap_1011(dataLagu_1011, i + 1, high_1011);
		return (i + 1);
	}
	
	//method sorting (quickSort)
	static void quickSort_1011(dataLagu_2511531011[] dataLagu_1011, int low_1011, int high_1011) {
		if (low_1011 < high_1011) {
			int pi_1011 = partition_1011(dataLagu_1011, low_1011, high_1011);
			quickSort_1011(dataLagu_1011, low_1011, pi_1011 - 1);
			quickSort_1011(dataLagu_1011, pi_1011 + 1, high_1011);
		}
	}
	
	//method tampilData
	public static void tampilData_1011 (dataLagu_2511531011[] dataLagu_1011, int jumlah_1011) {
		for (int i = 0; i < jumlah_1011; i++) {
			System.out.println((i+1) + ". " + dataLagu_1011[i]);
		}
	}


	public static void main(String[] args) {
		Scanner input_1011 = new Scanner(System.in);
		int jumlah_1011;
		System.out.println("=== Sorting Playlist NIM: 2511531011 ===");
		
		//validasi untuk minimal 7 lagu
		do {
			System.out.print("Jumlah lagu(Minimal 7): ");
			jumlah_1011 = input_1011.nextInt();
			input_1011.nextLine();
			if (jumlah_1011 < 7) System.out.println("Minimal harus 7 lagu!");
		} while (jumlah_1011 < 7);
		
		for(int i = 0; i < jumlah_1011; i++) {
			System.out.println("\nData lagu ke-" + (i+1));
			dataLagu_1011[i] = inputData_1011(input_1011);
		}
		
		System.out.println("\nData sebelum diurutkan: ");
		tampilData_1011(dataLagu_1011, jumlah_1011);
		
		quickSort_1011(dataLagu_1011, 0, jumlah_1011 - 1);
		
		System.out.println("\n\nData terurut quicksort(durasi asc): ");
		tampilData_1011(dataLagu_1011, jumlah_1011);

	}

}
