package com.wolken.wolkenapp;

import java.util.Arrays;
import java.util.Scanner;

public class arrayUTIL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int []a=new int[6];
	//int []b=new int[6];
	Scanner scan=new Scanner(System.in);
	
	System.out.println("enter 6 elements");
	for(int i=0;i<6;i++) {
		a[i]=scan.nextInt();
	}
	for (int j = 0; j < a.length; j++) {
		System.out.println(a[j]);
		
	}
	int b[]=Arrays.copyOf(a, 6);
	//a.copy(b, 0,5);
	System.out.println(Arrays.toString(a));
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	System.out.println("copy of b"+Arrays.toString(b));
	System.out.println("enter the element to be search");
	int key=scan.nextInt();
	int loc=Arrays.binarySearch(a, key);
	System.out.println("location :"+loc);
	System.out.println(Arrays.toString(a));

	}

}
