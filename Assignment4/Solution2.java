
public class Solution2 {

	public static void main(String[] args) {
		int int_value = -1;
		byte byte_value = (byte)int_value;
		char char_value = (char)byte_value;
		int final_int_value = (int)char_value;
		if(int_value == final_int_value)
		{
			System.out.println("Same Values");
		}
		else
		{
			System.out.println("Different Values");
		}
		
		
		System.out.println(int_value);
		System.out.println(byte_value);
		System.out.println(char_value);
		System.out.println(final_int_value);
			
//      output - 
//		different values
//		-1
//		-1
//		?
//		65535
//      This is because int is 4 bytes and char is 2 bytes so the number which was in the range of int could not
//		fit itself in the range of char that's why it showed the largest number that the char can hold i.e 65535
}
	
}
