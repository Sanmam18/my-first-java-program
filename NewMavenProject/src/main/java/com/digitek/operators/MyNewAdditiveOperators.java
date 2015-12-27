package com.digitek.operators;

public class MyNewAdditiveOperators {
	// addition(+),subtraction(-),postincrement(no++),postdecrement(no--),preincrement(++no),predecrement(--no),
	 // concatenation
	
	
	public static void main(String[] args){
		 addition();
		subtraction();
		postincrement();
		postdecrement();
		preincrement();
		predecrement();
		// concatenation();
	}

	public static void addition(){
		
		int no1 = 6;
		int no2 = 4;
		
		int value = no1 + no2;
		System.out.println("result of value" +value);
	}
     public static void subtraction(){
		
		int no1 = 6;
		int no2 = 4;
		
		int value = no1 + no2;
		System.out.println("result of value" + value);
		}
     public static void postincrement(){
    	  
    	 int no1 = 5;
    	 System.out.println("no before postincrement "+ no1);
    	 int no = no1+1;
    	// this  is equivelent  to the lines below
    	// int no = no1
    	// no1 = no1+1
     }
     public static void postdecrement(){
   	  
    	 int no1 = 5;
    	 System.out.println("no before postdecrement "+ no1);
    	 int no = no1++;
    	// this  is equivelent  to the lines below
    	// int no = no1
    	// no1 = no1+1
    	 }
    	 
    	 
    	 public static void preincrement(){
       	  
        	 int no1 = 5;
        	 System.out.println("no before preincrement "+ no1);
        	 int no = ++no1;
        	// this  is equivelent  to the lines below
        	// int no = no1
        	// no1 =++ no 
        	 }
    	 public static void predecrement(){
          	  
        	 int no1 = 5;
        	 System.out.println("no before preincrement "+ no1);
        	 int no = --no1;
        	// this  is equivelent  to the lines below
        	// int no = no1
        	// no1 =-- no }
    	 }
    	 public static void conctenataion(){
    		 
    		 String text = "Hello";
    		 int no = 5;
    		 
    		String result = text + no;
    		
    		
    		System.out.println("result"+result);
    	 }
    
    	 
    	 
	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    		 
    		 
    	 }
    	 

