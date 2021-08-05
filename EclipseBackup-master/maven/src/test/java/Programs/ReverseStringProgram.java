package Programs;

public class ReverseStringProgram {

	public static void main(String[] args) {

		ReverseStringProgram.string2();
		ReverseStringProgram.string3();

		StringBuffer str = new StringBuffer("Pravesh");

		System.out.println(str.reverse());

	}

	public static void string2() {

		String input = "Pravesh";

		StringBuilder input2 = new StringBuilder();
		input2.append(input);
		System.out.println(input2);

	}

	public static void string3() {

		String input = "Pravesh";

		char[] newstring = input.toCharArray();

		for (int i = newstring.length - 1; i >= 0; i--) {

			System.out.print(newstring[i]);

		}

	}
}
