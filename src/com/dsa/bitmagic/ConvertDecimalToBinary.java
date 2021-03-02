package com.dsa.bitmagic;

public class ConvertDecimalToBinary {
public static void main(String[] args) {
	int n= 39;
	String binary = convertToBinary(n);
	System.out.println("Binary representation of "+n+" is:"+binary);
}

public static String convertToBinary(int n) {
	String b = "";
	while(n!=0) {
		int rem = n%2;
		n = n/2;
		b=rem+b;
	}
	return b;	
}
}
