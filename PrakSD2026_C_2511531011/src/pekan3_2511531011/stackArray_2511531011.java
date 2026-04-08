package pekan3_2511531011;

public class stackArray_2511531011 {
	static final int MAX_1011 = 1000;
	int top_1011;
	int a_1011 [] = new int [MAX_1011];
	boolean isEmpty_1011() {
		return (top_1011 < 0);
	}
	
	stackArray_2511531011() {
		top_1011 = -1;
	}
	
	boolean push_1011 (int x_1011) {
		if (top_1011 >= (MAX_1011 - 1)) {
			System.out.println("Stack overflow.");
			return false;
		} else {
			a_1011 [++top_1011] = x_1011;
			System.out.println(x_1011 + " dimasukkan dalam stack");
			return true;
		}
	}
	
	int pop_1011 () {
		if (top_1011 < 0) {
			System.out.println("Stack underflow");
			return 0;
		} else {
			int x_1011 = a_1011 [top_1011--];
			return x_1011;
		}
	}
	
	int peek_1011() {
		if (top_1011 < 0) {
			System.out.println("Stack underflow");
			return 0;
		} else {
			int x_1011 = a_1011 [top_1011];
			return x_1011;
		}
	}
	
	void print_1011() {
		for (int i_1011 = top_1011; i_1011 > -1; i_1011--) {
			System.out.print(" " + a_1011[i_1011]);
		}
	}
}
