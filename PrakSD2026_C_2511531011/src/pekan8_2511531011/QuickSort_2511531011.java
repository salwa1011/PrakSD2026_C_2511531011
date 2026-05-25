package pekan8_2511531011;

public class QuickSort_2511531011 {
	static void swap_1011(int[] arr_1011, int i, int j) {
		int temp_1011 = arr_1011[i];
		arr_1011[i] = arr_1011[j];
		arr_1011[j] = temp_1011;
	}
	
	//Metode tambahan untuk mengatur pivot dengan median of three
	static void medianOfThree_1011 (int[] arr_1011, int low_1011, int high_1011) {
		int mid_1011 = low_1011 + (high_1011-low_1011) /2;
		
		//Urutkan elemen low, mid, dan high
		if (arr_1011[low_1011] > arr_1011[mid_1011]) {
			swap_1011(arr_1011, low_1011, mid_1011);
		}
		if (arr_1011[low_1011] > arr_1011[high_1011]) {
			swap_1011(arr_1011, low_1011, mid_1011);
		}
		if (arr_1011[mid_1011] > arr_1011[high_1011]) {
			swap_1011(arr_1011, low_1011, mid_1011);
		}
		swap_1011(arr_1011, mid_1011, high_1011);
	}
	
	static int partition_1011(int[] arr_1011, int low_1011, int high_1011) {
		//Panggil fungsi median of three sebelum menentukan pivot
		medianOfThree_1011(arr_1011, low_1011, high_1011);
		
		int pivot_1011 = arr_1011[high_1011]; // Sekarang arr[high] sudah berisi nilai median
		int i = (low_1011 - 1);
		
		for (int j = low_1011; j<=high_1011-1; j++) {
			//Jika elemen saat ini lebih keci dari atau sama dengan pivot
			if (arr_1011[j] < pivot_1011) {
				//Increment indeks elemen yang lebih kecil
				i++;
				swap_1011(arr_1011, i, j);
			}
		}
		swap_1011(arr_1011, i + 1, high_1011);
		return (i + 1);
	}
	
	static void quickSort_1011(int[] arr_1011, int low_1011, int high_1011) {
		if (low_1011 < high_1011) {
			int pi_1011 = partition_1011(arr_1011, low_1011, high_1011);
			quickSort_1011(arr_1011, low_1011, pi_1011 - 1);
			quickSort_1011(arr_1011, pi_1011 + 1, high_1011);
		}
	}
	
	public static void printArr_1011 (int[] arr_1011) {
		for (int i = 0; i < arr_1011.length; i++) {
			System.out.print(arr_1011[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr_1011 = {10, 7, 8, 9, 1, 5};
		int N_1011 = arr_1011.length;
		System.out.print("Data sebelum diurutkan: ");
		printArr_1011(arr_1011);
		
		quickSort_1011(arr_1011, 0, N_1011 - 1);
		
		System.out.print("Data terurut quicksort: ");
		printArr_1011(arr_1011);
	}

}
