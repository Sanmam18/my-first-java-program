package com.digitek.operators1;

public class ConditionalOperators {
	
	public static void main (String[] args){
		 ifConditionalOpearators();

	}      
	public static void ifConditionalOpearators() {

      
	    int no1 = 72;
	    int no2 = 36;
	    
	    int total = no1 + no2;
	    

	       
	 //   Syntex
	    //if condition{
	    //if block
	    //the block is executed if condition is true}
	    
	    // else if condition{
	    //else block
	  //the block is executed if condition is true}
	    
	    //else if{
	    // if not other condition was satisfied}
	    
	    
	    if(total >= 90) 
		{
			System.out.println("Grade A, marks: " + total);
		} 
		else if(total >= 80 & total < 90) 
		{
			System.out.println("Grade B, marks: " + total);
		} 
		else if(total >= 70 & total < 80) 
		{
			System.out.println("Grade C, marks: " + total);
		} 
		else if (total >= 60 & total < 70) 
		{
			System.out.println("Grade D, marks: " + total);
		} 
		else 
		{
			System.out.println("Grade F");
		}
		
	}
	    
	    
	}    



