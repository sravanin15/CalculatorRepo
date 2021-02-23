package com.mindtree.Calculator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Calculator 
{
	static Scanner sc=new Scanner(System.in);
    public static void main( String[] args )
    {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=add(a,b);
        int diff=sub(a,b);
        System.out.println(sum);
        System.out.println(diff);
    }
	public static int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
		
	}
	public static int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
}
