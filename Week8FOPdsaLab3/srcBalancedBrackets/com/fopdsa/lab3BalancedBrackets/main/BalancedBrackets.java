package com.fopdsa.lab3BalancedBrackets.main;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
	 public static void main(String[] args) {
	        try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Please enter the input");
				String value = sc.next();
				isBalanced(value);
			}
	    }

	    public static void isBalanced(String s){
	        Stack<Character> stack = new Stack<>();
	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            if (c == '(' || c=='{' || c=='['){
	                stack.push(c);
	            } else {
	                if (stack.isEmpty()){
	                    System.out.println("not balanced");
	                    return;
	                }
	               char top = stack.peek();
	                if ((top == '(' && c ==')') || (top == '{' && c =='}') || (top == '[' && c ==']')){
	                    stack.pop();
	                }
	            }
	        }
	        if (stack.isEmpty()){
	            System.out.println("Balanced");
	        } else {
	            System.out.println("Not balanced");
	        }
	    }
	}
