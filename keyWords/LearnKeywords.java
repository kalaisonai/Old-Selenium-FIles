package keyWords;

public class LearnKeywords extends LearnFinal{
	int i =10;
	static int j=10;
	public static void main(String[] args) {
	LearnKeywords key = new LearnKeywords();
	LearnKeywords key1 = new LearnKeywords();
	key.getData();
	key1.getData();
	}
	public void setValue() {
		System.out.println("10");
	}
	public void getData() {
		setValue();
		i++;
		j++;
		System.out.println("non-static variable "+i);
		System.out.println("static variable "+j);
	}
	

}

