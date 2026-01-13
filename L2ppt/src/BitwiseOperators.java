
public class BitwiseOperators {

	public static void main(String[] args) {
		
			int a = 5;  // 0101 in binary
			int b = 3;  // 0011 in binary

			System.out.println("Unary NOT of 5 is : "+~5);
			
			int and = a & b; // result: 1 (0001)
			System.out.println(a +" & "+b+" = "+and);
			
		
			int or  = a | b; // result: 7 (0111)
			System.out.println(or);
		
			int xor = a ^ b; // result: 6 (0110)
			System.out.println(xor);
			
			//0000 0101 (5) shifted left twice becomes 0001 0100 (20)
			System.out.println(5 << 2);
			//5*(2^2) = 20
					
			//0001 0100 (20) shifted right twice becomes 0000 0101 (5).
			System.out.println(20 >> 2);
			//20/(2^2) = 5
	}

}
