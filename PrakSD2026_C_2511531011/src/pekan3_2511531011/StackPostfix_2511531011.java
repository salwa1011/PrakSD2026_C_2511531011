package pekan3_2511531011;

import java.util.Scanner;
import java.util.Stack;

public class StackPostfix_2511531011 {
	public static int postfixEvaluate_1011(String expression) {
		Stack <Integer> s_1011 = new Stack <Integer>();
		Scanner input_1011 = new Scanner(expression);
		while (input_1011.hasNext()) {
			if (input_1011.hasNextInt()) { // an operand integer
				s_1011.push(input_1011.nextInt());
			} else { //an operator
				String operator_1011 = input_1011.next();
				int operand2_1011 = s_1011.pop();
				int operand1_1011 = s_1011.pop();
				if (operator_1011.equals("+")) {
					s_1011.push(operand1_1011 + operand2_1011);
				} else if (operator_1011.equals("-")){
					s_1011.push(operand1_1011 - operand2_1011);
				} else if (operator_1011.equals("*")){
					s_1011.push(operand1_1011 * operand2_1011);
				} else {
					s_1011.push(operand1_1011 / operand2_1011);
				}
			}
		}
		input_1011.close();
		return s_1011.pop();
	}

	public static void main(String[] args) {
		System.out.println("hasil postfix = " + postfixEvaluate_1011("5 2 4 * + 7 -"));
	}
	
}
