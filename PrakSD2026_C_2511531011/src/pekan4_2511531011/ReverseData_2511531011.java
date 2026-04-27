package pekan4_2511531011;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_2511531011 {
	public static void main(String[] args) {
		Queue<Integer> q_1011 = new LinkedList<Integer>();
		q_1011.add(1);
		q_1011.add(2);
		q_1011.add(3); // [1, 2, 3]
		System.out.println("sebelum reverse: " + q_1011);
		Stack<Integer> s_1011 = new Stack<Integer>();
		while (!q_1011.isEmpty()) { // Q -> S
			s_1011.push(q_1011.remove());
		}
		while (!s_1011.isEmpty()) { // S -> Q
			q_1011.add(s_1011.pop());
		}
		System.out.println("sesudah reverse: " + q_1011); // [3, 2, 1]

	}

}
