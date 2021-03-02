package com.dsa.bitmagic;

public class BinaryAddition {
public static void main(String[] args) {
	int a = 10;
	int b=5;
	int c = add(a, b);
	System.out.println(a+"-->"+ConvertDecimalToBinary.convertToBinary(a));
	System.out.println(b+"-->"+ConvertDecimalToBinary.convertToBinary(b));
	System.out.println(c+"-->"+ConvertDecimalToBinary.convertToBinary(c));

}

public static int add(int a, int b) {
	return (a|b);
}
}
