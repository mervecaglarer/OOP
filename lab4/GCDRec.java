public class GCDRec{
	public static void main(String [] args){
		int x=196;
		int y=160;
		int gcd=findGCD(x,y);
		System.out.println("GCD of " +x +" and " +y +" is  " +gcd);
	}
	
	private static int findGCD(int a, int b){
		System.out.println("GCD(" +a +"," +b +")" );
		if (b==0)
			return a;
		return findGCD(b,a%b);
		
	}
}
