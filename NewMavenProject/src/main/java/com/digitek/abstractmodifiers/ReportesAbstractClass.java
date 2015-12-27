package com.digitek.abstractmodifiers;

public abstract class ReportesAbstractClass {
    
	public void generateheader(){
		System.out.println("******HEADER********************");
		
	}
	public void generatesubheader(){
		System.out.println("******SUBHEADER********************");
	}
	
	public void generateputlogo(){
		System.out.println("******PUTLOGO********************");
	}
	
	public abstract void generatebody();
	
	
	public void generatefooter(){
		System.out.println("******FOOTER********************");
	}
	
	
	
	
	
	
	
	
	
	
	
}
