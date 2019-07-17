public class Question1 {
	public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
	list.addAll(Arrays.asList(new Integer[] {5,-2,-3,2,4,-2,-4,1}));
		for(int i=0; i < list.size(); i++) {
			if (list.get(i) < 0 ) {
				list.remove(i);
			}
		}
		System.out.println(list);
	}
}
