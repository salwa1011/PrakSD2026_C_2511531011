package pekan7_2511531011;

public class InsertionSort_2511531011 {
	public static void insertionSort_2511531011(int[] arr_1011) {
		int n_1011 = arr_1011.length;
		for (int i = 1; i<n_1011; i++) {
			int key_1011 = arr_1011[i];
			int j_1011 = i - 1;
			while (j_1011 >= 0 && arr_1011[j_1011] > key_1011) {
				arr_1011 [j_1011+1] = arr_1011[j_1011];
				j_1011--;
			}
			arr_1011[j_1011 + 1] = key_1011;
		}
	}

	public static void main(String[] args) {
		int arr_1011[] = {23, 78, 45, 8, 32, 56, 1};
		int n_1011 = arr_1011.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i = 0; i < n_1011; i++) {
			System.out.print(arr_1011[i] + " ");
		}
		System.out.println("");
		insertionSort_2511531011(arr_1011);
		System.out.printf("array yang terurut:\n");
		for (int i=0; i<n_1011; i++)
			System.out.print(arr_1011[i] + " ");
		System.out.println("");
	}
}
