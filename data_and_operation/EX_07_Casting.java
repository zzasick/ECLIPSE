public class EX_07_Casting {

	public static void main(String[] args) {

		double a = 1.1;
		double b = 1; // no loss = no error
		double b2 = (double) 1; // no loss = automatic casting
		
		System.out.println(b); // 1.0 
		
//		int c = 1.1; // cannot convert double into integer = loss 0.1
		double d = 1.1; // second solution 'change type int into double'
		int e = (int) 1.1; // first solution '(int) 1.1 = integer 1'
		
		System.out.println(e);
		
		// 1 to String (searching on google)
		String f = Integer.toString(1);
		System.out.println(f.getClass()); // integer '1' is no more a integer, but a string
		
	}

}
