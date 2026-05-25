package pekan8_2511531011;

public class ShellSort_2511531011 {
	public static void shellSort_1011 (int[] A_1011) {
		int n_1011 = A_1011.length;
		int gap_1011 = n_1011/2;
		while (gap_1011 > 0) {
			for (int i = gap_1011; i < n_1011; i++) {
				int temp_1011 = A_1011[i];
				int j = i;
				while (j >= gap_1011 && A_1011[j - gap_1011] > temp_1011) {
					A_1011[j] = A_1011 [j-gap_1011];
					j = j - gap_1011;
				}
				A_1011[j] = temp_1011;
			}
			gap_1011 = gap_1011/2;
		}
	}

	public static void main(String[] args) {
		int[] data_1011 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		
		System.out.print("Sebelum: ");
		printArray_1011(data_1011);
		
		shellSort_1011(data_1011);
		
		System.out.print("Sesudah (Shell Sort): ");
		printArray_1011(data_1011);
	}
	
	public static void printArray_1011(int[] arr_1011) {
		for (int i : arr_1011) System.out.print(i + " ");
		System.out.println();
	}

}
