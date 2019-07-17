public class FindPrimes {

    public static void main(String[] args) {

    	int number = Integer.parseInt(args[0]);
        String primes="";
		boolean controls=true;
        for (int i=2;i<number;i++) {
		   controls=true;
           for (int m=2;m<i;m++) {
	   			if (i % m ==0) {
					controls=false;
             		break;
          		 }
           }
		   if (controls==true) {
			  primes=primes+i + "  ";
           
           }
        }
    System.out.println(primes);
   }
}
 
