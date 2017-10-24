/*
 * Name:Zhiwei Lin
 * Section:12:30-1:45
 * 
 */

import java.util.Stack;
import java.util.Scanner;

public class DelimeterChecker {
	public boolean isdelimiter(String expr) {
		String str;
		Stack<Character>s = new Stack<Character>();
		str=expr;
		
		for(int i=0; i< str.length();i++) {
			char firstC= str.charAt(i);
			
			if(firstC=='(' || (firstC=='{') || (firstC=='[')) {
				stack.push(firstC);
			}
			
			if(firstC==')' || firstC=='}' || firstC==']')  {
				if(stack.isEmpty()) {
					return false;
				}
				else {
					switch(firstC) {
					case ')':
						if(stack.peek()=='(') {
							stack.pop();
							continue;
						}
						else {
							System.out.println("Error : mismatch delimeter ')'");
							return false;
						}
					case '}' :
						if(stack.peek()=='{') {
							stack.pop();
							continue;
						}
						else if {
							System.out.println("Error : mismatch delimeter '}'");
							return false;
						}
					case ']' :
						if(stack.peek()=='[') {
							stack.pop();
							continue;
						}
						else  {
							System.out.println("Error : mismatch delimeter ']'");
							return false;
						}
					}
				}
			}
			}
		  if (!stack.isempty()) {
			  return false;
		  }
		  else return true;
		}

	public static void main(String[] args) {
		DelimeterChecker delimCheck = new DelimeterChecker();
		Scanner console = new Scanner(System.in);
		System.out.println("Test string: ");
		System.out.print("> ");
		String str = console.next();

		if (delimCheck.isdelimiter(str))
			System.out.println("Correct: Matching delims");
		else
			System.out.println("Incorrect: Check delims");

	}
}
