public class GCDLoop{
	public static void main(String [] args){
		int a=90;
		int b=50;
		
		int q=a/b;
		int r=a%b;

		while (r!=0){
			a=b;
			b=r;
			q=a/b;
			r=a%b;
		}

		System.out.println("GCD=" + b);
    }
}
			
