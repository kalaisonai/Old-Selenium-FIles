package keyWords;

public class LearnFinal {

	final int i=10;
	int j=10;
	public static void main(String[] args) {
		LearnFinal lf = new LearnFinal();
		lf.setValue();
	}
	public void setValue() throws Throwable {
		int j=5;	
		try {
			System.out.println(this.j);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally { 
			finalize();
		}
	}
	public final void setValue(String s) {
		//i=i+1;
	}

}
