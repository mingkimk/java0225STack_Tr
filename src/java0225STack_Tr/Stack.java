package java0225STack_Tr;

public class Stack {
	private String[] myStack = new String[10];
	private int pointer = -1;
	// stack 연사 2가지,push pop

	public void push(String p) {
		// pointer 하나 증가 한 후 String 를 입력 한다.

		pointer++;
		if (pointer == 10) {
			System.out.println("Stack is full");
		} else {
			myStack[pointer] = p;
		}
	}

	public String pop() {
		String getData = null;
		if (pointer == -1) {
			getData = "STack empty";
		} else {
			getData = myStack[pointer];
			myStack[pointer] = null;
			pointer--;

		}
		return getData;

	}
}
