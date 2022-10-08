package Assignment1;

public class Arithmatic {
	
		 public static void main (String[] args) { 
		 int operand1, operand2; 
		 char theOperator; 
		 

		 if (args.length != 3) { 
		 System.err.println("Usage: java Arithmetic int1 int2 op"); 
		 return; 
		 } 
		 
	 
			 operand1 = Integer.parseInt(args[0]); 
		 operand2 = Integer.parseInt(args[1]);
		 
				 theOperator = args[2].charAt(0);
		 System.out.print(args[0] + args[2] + args[1] + "="); 		 
		 switch(theOperator) { 
		 case ('-'): System.out.println(operand1 - operand2); break; 
		 case ('+'): System.out.println(operand1 + operand2); break; 
		 case ('*'): System.out.println(operand1 * operand2); break; 
		 case ('/'): System.out.println(operand1 / operand2); break; 
		 default: 
		 System.err.println("Error: invalid operator!"); 
		 } 
		 } 
		} 


