public class Int2Bin{
	public static void main(String[] args){
		System.out.println(Int2Bin(98));
	}

	private static String Int2Bin(int number){
		if(number == 0||number == 1)
			return number + "";
		return Int2Bin(number/2) + (number%2);
    }
}

