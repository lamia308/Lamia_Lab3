package com.promy.balancebracket.main;

import com.promy.balancebracket.service.BalancingBrackets;

public class Driver {

	public static void main(String[] args) {
		

			BalancingBrackets balancingBrackets= new BalancingBrackets();
			String bracketExpression= "([[{}]])";
			
			boolean output;
			output= balancingBrackets.checkingBracketsBalanced(bracketExpression);
			if (output)
			System.out.println("The entered String has Balanced Brackets");
			else
			System.out.println(" The entered String do not contain Balanced Brackets");
	}

}
