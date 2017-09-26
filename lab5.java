/*
 * Name: Zhiwei Lin
 * Section:Thesday 12:30-1:45
 * date: 9/26
 */
import java.util.Scanner;
public class lab5 {
    
	
	public static void main(String[] args) {
	    Scanner console= new Scanner(System.in);
	     System.out.println("please type the word you want to test");
	     String word= console.nextLine();
	  
     while(!word.equals("")) {
    	  if(isaPalindrome(word))
    		  System.out.println(word+ "is a palindrome"); 
    	  else
    		 System.out.println(word+" is not a palindrome");
    	     System.out.println("input a word");
    	     word=console.nextLine();
    	}
    	  }
	
	
	
	public static boolean isaPalindrome(String expr)  {
		if(expr.length()==0||expr.length()==1)
		{
			return true ;  
		}
		if(expr.charAt(0)==' ') 
		{
			return isaPalindrome(expr.substring(1, expr.length()));
		}
		if(expr.length()-1==' ') {
			return isaPalindrome(expr.substring(0,expr.length()-1));
		}
		if(expr.charAt(0)==expr.charAt(expr.length()-1)) {
			return isaPalindrome(expr.substring(1, expr.length()-1));
		}
			return false;
	}
		
		
		
		
		
		     
	}

