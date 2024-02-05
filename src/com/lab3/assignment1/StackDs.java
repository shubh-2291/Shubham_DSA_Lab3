package com.lab3.assignment1;

import java.util.Stack;

public class StackDs {

	public boolean validate(String expression) {
		Stack<Character> stack = new Stack<>();
		for (char i : expression.toCharArray()) {
			if (i == '{' || i == '[' || i == '(') {
				stack.push(i);
			}
			if (stack.isEmpty())
				return false;

			char z;
			switch (i) {
			case '}':
				z = stack.pop();
				if (z == ']' || z == ')')
					return false;
				break;
			case ']':
				z = stack.pop();
				if (z == '}' || z == ')')
					return false;
				break;
			case ')':
				z = stack.pop();
				if (z == '}' || z == ']')
					return false;
				break;
			}
		}
		return (stack.isEmpty());
	}

}
