package java0225STack_Tr;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Stack_Test {
	private String calEx = "2*3/4-2";
	private ArrayList<String> newS = new ArrayList<>();
	private Stack mys = new Stack();

	Stack_Test() {
		StringTokenizer st = new StringTokenizer(calEx, "+-/(),true");
		while (st.hasMoreElements()) {
			String nowToken = st.nextToken();
			switch (nowToken) {
			case "*":
			case "/":
			case "+":
			case "-":
				chkOper(nowToken);
				break;
			case "(":
				mys.push(nowToken);
			case ")":
				popOper();
				break;
			default:
				newS.add(nowToken);

			}
		}
		popOper();
		calProcess();
	}
	private void calProcess() {
		Stack_Cal s = new Stack_Cal(newS);
		double sum = s.stack_ex();
		System.out.println("최종 결과 값: "+sum);
	}

	private void popOper() {
		while (true) {
			String nowStack = mys.pop();
			if (nowStack.equals("(") || nowStack.equals("Stack empty")) {
				break;
			}
			newS.add(nowStack);
		}
	} 

	private void chkOper(String nowToken) {
		String stackData = mys.pop();
		if (priority(stackData) >= priority(nowToken)) {
			newS.add(stackData);
		} else {
			mys.push(stackData);

		}
		mys.push(nowToken);
	}

	private int priority(String nowToken) {
		switch (nowToken) {
		case "*":
		case "/":
			return 2;
		case "+":
		case "-":
			return 1;
		default:
			return -1;
		}
	}

}
