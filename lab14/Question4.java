public class Question4 {
	int value;
	public static void main(String[] args) {
		Set<Question4> set = new HashSet<>();
		set.add(new Question4(7));
		set.add(new Question4(5));
		set.add(new Question4(3));
		set.add(new Question4(0));
		set.add(new Question4(2));
	}
	public Question4(int value){
		this.value = value;
	}
	public boolean equals(Object o){
		if (o instanceof Question4){
			return value % 5 == ((Question4)o).value % 5;
		}
		return false;
	}
	@Override
	public int hashCode(){
		return value;
	}
}
