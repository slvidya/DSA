package com.dsa.bitmagic;

public class BitChecker {
	static boolean checkKthBitisSet(int n, int k){
		int mask = 1<<k;
	    long result = n&mask;

	    if(result>=1)
	        return true;
	    return false;
	    }

	static int setKthBit(int n, int k) {
		int mask = 1<<k;
		n = n|k;
		return n;
	}
	
	static int clearKthBit(int n, int k) {
		int mask = ~(1<<k);
		return n & mask;
	}
	
	static int countSetBits(int n) {
		int count = 0;
		while(n>0) {
			count ++;
			n=n&(n-1);
		}
		return count;
	}
	
	static int log2(int n) {
		int count =0;
		while((n>>=1)>0) {
			count++;			
		}		
		return count;
	}
	
	static int trailingZerosInBinaryNumber(int n) {
		int count =0;
		while((n&1)==0) {
			count++;
			n=n>>1;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int number = 25;
		System.out.println("Number = "+number);
		System.out.println("Binary Representation = "+ConvertDecimalToBinary.convertToBinary(number));
		System.out.println("Is 0th bit set = "+checkKthBitisSet(number, 0));
		System.out.println("Is 1st bit set = "+checkKthBitisSet(number, 1));
		System.out.println("Is 2nd bit set = "+checkKthBitisSet(number, 2));
		int n = setKthBit(25, 3);
		System.out.println("Set 3rd bit :"+ConvertDecimalToBinary.convertToBinary(n));
		n = clearKthBit(number, 3);
		System.out.println("Clear 3rd bit :"+ConvertDecimalToBinary.convertToBinary(n));
		System.out.println("Number of set bits in "+number+":"+ countSetBits(number));

		System.out.println("Binary Representation = "+ConvertDecimalToBinary.convertToBinary(30));
		System.out.println("Number of set bits in 30 "+countSetBits(30));

		System.out.println("Log base 2 of: "+number +" is "+log2(number));

		System.out.println("Binary Representation of "+18+"= "+ConvertDecimalToBinary.convertToBinary(18));
		System.out.println("Trailing zeros : "+trailingZerosInBinaryNumber(18));
		
			
	}
}
