package com.array;

public class Conversion {
       public static void main(String[] args) {
		int a =10; 
		long b =233556;
		
		
		a =  (int) b;//long to int		
		System.out.println(a);
		String s= "1234";
		
	   a =Integer.parseInt(s);//string to int
	   
	  String e = String.valueOf(a);//int to string
	  System.out.println(e);
	  double d=26;
	  d=(int)d;//double to int
	  System.out.println(d);
	  
	  
	}
}
