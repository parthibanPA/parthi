package com.array;

import java.util.Scanner;


public class Array1 extends Array2  {
	
	public static void main(String[] args) {
		Array1 obj=new Array1();
		Scanner s = new Scanner(System.in);
		obj.adf();
		int a[] = new int[5];
		a[0] =1;
		a[1] = 3; 
		a[3] =4;
		a[2] =5;
		a[4]=6;
		for (int i = 0; i <=4; i++) {
			System.out.println(a[i]);
		}
		

			}

}
