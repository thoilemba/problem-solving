package leetcode;

import java.util.Stack;

public class ValidParenthesis {
	
	static boolean validParenthesis(String s) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}else if(!stack.isEmpty() && 
				(ch == ')' && stack.peek() == '(' || 
				ch == '}' && stack.peek() == '{' || 
				ch == ']' && stack.peek() == '[')){
					stack.pop();
			}else {
				return false;
			}
		}
		
		return stack.isEmpty();
		
	}

	public static void main(String[] args) {

		String s1 = "()";
		String s2 = "()[]{}";
		String s3 = "(]";
		String s4 = "]";
		
		System.out.println(validParenthesis(s1));
		System.out.println(validParenthesis(s2));
		System.out.println(validParenthesis(s3));
		System.out.println(validParenthesis(s4));

	}

}
