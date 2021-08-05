package Programs;

public class ThisKeyword {

	int i;
	
	
	 ThisKeyword() {
		
		
		System.out.println("Iam a construct");
		
		
	}

	public void SetValue(int i) {

		this.i = i;

	}

	public void show() {

		System.out.println(i);

	}

	public static void main(String[] args) {

		ThisKeyword key = new ThisKeyword();
		key.SetValue(10);
		key.show();

	}

}
