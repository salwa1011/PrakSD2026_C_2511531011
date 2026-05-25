package pekan8_2511531011;

public class MergeSort_2511531011 {
	void merge_1011 (int arr_1011[], int l_1011, int m_1011, int r_1011) {
		//Find size of two subarrays to be merged
		int n1_1011 = m_1011 - l_1011 + 1;
		int n2_1011 = r_1011 - m_1011;
		// Create temporary arrays
		int L_1011[] = new int[n1_1011];
		int R_1011[] = new int[n2_1011];
		// Copy data to temp arrays
		for (int i = 0; i < n1_1011; ++i)
			L_1011[i] =  arr_1011[l_1011 + i];
		for (int j = 0; j < n2_1011; ++j)
			R_1011[j] =  arr_1011[m_1011 + 1 + j];
		int i = 0, j = 0;
		
		// Initial index of merged subarray array
		int k_1011 = l_1011;
		while (i < n1_1011 && j < n2_1011) {
			if (L_1011[i] <= R_1011[j]) {
				arr_1011[k_1011] = L_1011[i];
				i++;
			} else {
				arr_1011[k_1011] = R_1011[j];
				j++;
			}
			k_1011++;
		}
		
		// Copy ramaining elemets of L[] if any
		while (i < n1_1011) {
			arr_1011[k_1011] = L_1011[i];
			i++;
			k_1011++;
		}
		
		// Copy remaining element of R[] if any
		while (j < n2_1011) {
			arr_1011[k_1011] = R_1011[j];
			j++;
			k_1011++;
		}
	}
	
	void sort_1011(int arr_1011[], int l_1011, int r_1011) {
		if (l_1011 < r_1011) {
			// Find the middle point
			int m_1011 = (l_1011 + r_1011) / 2;
			// Sort first and second halves
			sort_1011(arr_1011, l_1011, m_1011);
			sort_1011(arr_1011, m_1011 + 1, r_1011);
			// Merge the sorted halves
			merge_1011(arr_1011, l_1011, m_1011, r_1011);
		}
	}
	
	// A utility function to print array to size n
	static void printArray_1011(int arr_1011[]) {
		int n_1011 = arr_1011.length;
		for (int i = 0; i < n_1011; ++i)
			System.out.print(arr_1011[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		int arr_1011[] = {12, 11, 13, 5, 6, 7}; 
		System.out.print("Sebelum diurutkan: ");
		printArray_1011(arr_1011);
		
		MergeSort_2511531011 ob = new MergeSort_2511531011();
		ob.sort_1011(arr_1011, 0, arr_1011.length - 1);
		
		System.out.print("\nSesudah terurut menggunakan merge sort: ");
		printArray_1011(arr_1011);
	}

}
