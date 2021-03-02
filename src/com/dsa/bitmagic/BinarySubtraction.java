package com.dsa.bitmagic;

public class BinarySubtraction {

	public static String twosCompliment(int n) {
	int onesComp = ~n;
	int twosComp = onesComp | 1;	
	System.out.println(twosComp);
	return ConvertDecimalToBinary.convertToBinary(twosComp);
	}

	public static void main(String[] args) {
		System.out.println(twosCompliment(10));
	}
}
