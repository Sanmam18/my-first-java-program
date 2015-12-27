package com.digitek.operators1;

public class AdditiveOperators {
   
	/*
	 *addition(+),subtraction(-),postincrement(no++),postdecrement(no--),preincrement(++no),perdrement(--no),
	 *string concatenation
	 */
	public static void main(String[] args){
		postincrement();
		preincrement();
		postdecrement();
		predecrement();
}
    public static void postincrement(){  
    	int no1 = 5;
    	System.out.println("no before post increment" +no1);
    	int no = no1++;
    	System.out.println("no before post increment" +no);
    }

    public static void preincrement(){  
    	int no1 = 5;
    	System.out.println("no before post increment" +no1);
    	int no = ++no1;
    	System.out.println("no before post increment" +no);
    }

    public static void postdecrement(){  
    	int no1 = 5;
    	System.out.println("no before post decrement" + no1);
    	int no = no1--;
    	System.out.println("no before post decrement" + no);
    }
    public static void predecrement(){  
    	int no1 = 5;
    	System.out.println("no before post decrement" + no1);
    	int no = --no1;
    	System.out.println("no before post decrement" + no);
    }
    
}