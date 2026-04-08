package pekan3_2511531011;

import java.util.Stack;

public class NilaiMaksimum_2511531011 {
	public static int max_1011(Stack<Integer> s_1011) {
		Stack<Integer> backup_1011 = new Stack<Integer>();
		int maxValue_1011 = s_1011.pop();
		backup_1011.push(maxValue_1011);
		while (!s_1011.isEmpty()) {
			int next_1011 = s_1011.pop();
			backup_1011.push(next_1011);
			maxValue_1011 = Math.max(maxValue_1011, next_1011);
		}
		while (!backup_1011.isEmpty()) {
			s_1011.push(backup_1011.pop());
		}
		return maxValue_1011;
	}

	public static void main(String[] args) {
		Stack<Integer> s_1011 = new Stack<Integer>();
		s_1011.push(70);
		s_1011.push(12);
		s_1011.push(20);
		System.out.println("Isi stack "+s_1011);
		System.out.println("Stack teratas : "+s_1011.peek());
		System.out.println("Nilai maksimum : "+ max_1011(s_1011));

	}

}
