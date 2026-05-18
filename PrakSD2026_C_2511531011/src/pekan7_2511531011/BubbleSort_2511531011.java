package pekan7_2511531011;

public class BubbleSort_2511531011 {
	public static void bubbleSort_2511531011(int[] arr_1011) {
		int n_1011 = arr_1011.length;
		for (int i = 1; i<n_1011; i++) {
			for (int j_1011 = 0; j_1011 < n_1011 - 1; j_1011++) {
				if (arr_1011[j_1011] > arr_1011[j_1011 + 1]) {
					int temp_1011 = arr_1011[j_1011];
					arr_1011[j_1011] = arr_1011[j_1011 + 1];
					arr_1011[j_1011 + 1] = temp_1011;
				}
			}
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
		bubbleSort_2511531011(arr_1011);
		System.out.printf("array yang terurut:\n");
		for (int i=0; i<n_1011; i++)
			System.out.print(arr_1011[i] + " ");
		System.out.println("");
	}
}
