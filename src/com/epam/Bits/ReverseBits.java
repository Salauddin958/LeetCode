package com.epam.Bits;

public class ReverseBits {
	
	public int reverseBits(int n) 
	{
		
		String dToB = decimalToBinaryReversed(n);
		int result = BinaryToDecimal(dToB);
		return result;
    }
	
	public int BinaryToDecimal(String binary)
	{
		System.out.println(binary);
		int result = 0;
		int n = binary.length();
		for (int i = n-1; i>=0; i--) 
		{
			int k=Character.getNumericValue(binary.charAt(i));
			result = result + (int)Math.pow(2, n-1-i) * k;
		}
		
		return result;
	}
	
	public String decimalToBinaryReversed(int n)
	{
		StringBuffer buffer = new StringBuffer();
		
		while(n!=0)
		{
			buffer.append(n%2);
			n=n>>1;
		}
		
		if (buffer.length()!=32) 
		{
			int diff = 32 - buffer.length();
			while(diff -- >0)
			{
				buffer.append(0);
			}
		}
		System.out.println(buffer.toString());
		return buffer.toString();
	}

	public static void main(String[] args) 
	{
		ReverseBits rb = new ReverseBits();
		System.out.println(rb.reverseBits(1));

	}

}
