package java0225STack_Tr;

import java.util.ArrayList;

public class Stack_Cal {

	private Stack calStack = new Stack();
	private ArrayList<String> calString = null;

	Stack_Cal(ArrayList<String> a) {
		this.calString = a;
	}

	public double stack_ex() {
		double stackCalResult = 0;
		double sInt = 0;
		double fInt = 0;
		for (String nowT : calString) {
			switch (nowT) {
			case "*":
				sInt = Double.valueOf(calStack.pop());
				fInt = Double.valueOf(calStack.pop());
				stackCalResult = fInt * sInt;
				calStack.push(String.valueOf(stackCalResult));
				break;
			case "/":
				sInt = Double.valueOf(calStack.pop());
				fInt = Double.valueOf(calStack.pop());
				stackCalResult = fInt / sInt;
				calStack.push(String.valueOf(stackCalResult));
				break;
			case "+":
				sInt = Double.valueOf(calStack.pop());
				fInt = Double.valueOf(calStack.pop());
				stackCalResult = fInt + sInt;
				calStack.push(String.valueOf(stackCalResult));
				break;
			case "-":
				sInt = Double.valueOf(calStack.pop());
				fInt = Double.valueOf(calStack.pop());
				stackCalResult = fInt - sInt;
				calStack.push(String.valueOf(stackCalResult));
				break;
			default:
				calStack.push(nowT);

			}
		}
		return stackCalResult;
	}

}
