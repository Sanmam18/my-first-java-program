package com.digitek.stringexample;

public class StringManipulation {

	public static void main(String[] args) {
		
		 stringManipulation1(); 
		}
		

		
	


		public static void stringManipulation1(){
			String str1 = "Hello World";
			String str2 = str1;
			
		String str3 = new String("Hello World");
		String str4= new String("Hello World");
		String str5 = new String("Hello World");
		String str6 = "Hello world"; 
		System.out.println("str1==str2"+str1==str2);
		System.out.println("str1.equals(str2)"+str1.equals(str2));
		
		System.out.println("str2==str3"+str2==str3);
		System.out.println("str2.equals(str3)"+str2.equals(str3));
		
		System.out.println("str3==str4"+str3==str4);
		System.out.println("str3.equals(str4)"+str3.equals(str4));
		
		System.out.println("str4==str5"+str4==str5);
		System.out.println("str4.equals(str5)"+str4.equals(str5));
		
		System.out.println("str1.equals(str6)"+str1.equals(str6));
		System.out.println("str1.equalsIgnoreCase(str6)"+str1.equalsIgnoreCase(str6));
        
		

String str8 = "Wel come";
		
		System.out.println("str8.substring(0, 1)"+str8.substring(0, 1));
		System.out.println("str8.substring(0,2)"+str8.substring(0,2));
		System.out.println("str8.substring(0,3)"+str8.substring(0,3));
		System.out.println("str8.substring(0,5)"+str8.substring(0,5));
		System.out.println("str8.substring(0,7)"+str8.substring(0,7));
		
		String s9 = "Wel";
		String s10= "Come";
		String s11 = s9.concat(s10);
		System.out.println("concteation of string "+ s11);
		
		String s12 = "WEL come";
		System.out.println("Case conversion"+ s12.toUpperCase());
		  
		String s13 = "Wel Come";
		System.out.println("length of string"+ s13.length());
		
		String s14 = "wel come";
		System.out.println("index of string"+ s14.indexOf("c"));
		
		
	}

}
