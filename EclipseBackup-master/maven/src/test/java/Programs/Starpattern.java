package Programs;

import java.util.ArrayList;

public class Starpattern {

	public static void main(String ags[]) {

		Starpattern.Star();
		Starpattern.star2();
		Starpattern.diagnalstar();

		ArrayList<String> star = new ArrayList<String>();
		ArrayList<String> star2 = new ArrayList<String>();
		ArrayList<String> star3 = new ArrayList<String>();
		ArrayList<String> star4 = new ArrayList<String>();

		star.add(0, "*");
		star.add(1, "*");
		star.add(2, "*");
		star.add(3, "*");
		star.add(4, "*");

		star2.add(0, "*");
		star2.add(1, "*");
		star2.add(2, "*");

		star3.add(0, "*");
		star3.add(1, "*");

		star4.add(0, "*");

		System.out.print(star);
		System.out.println();
		System.out.print(star2);
		System.out.println();
		System.out.print(star3);
		System.out.println();
		System.out.print(star4);
	}

	public static void Star() {

		for (int i = 1; i <= 4; i++) { // Value of i will start from 1

			for (int j = 1; j <= i; j++) { // value of j will start from 1 (so here j<=i condition will true and it will
											// print *) in second loop the value of j will be 2 beacuse of nested loop
											// and the value of i will be same 1 so the condition will failed) and loop
											// goes out.
											// again the value of i will be 2 and j will start from 1 here two times
											// condition will macth 2 star will print )

				System.out.print("* ");

			}
			System.out.println();

		}

	}

	public static void star2() {

		for (int i = 1; i <= 4; i++) {

			for (int j = 4; j >= i; j--) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

	public static void diagnalstar() {

		for (int i = 1; i <= 5; i++) {

			for (int j = 5; j >= i - 1; j--) {

				if (i>=2 && j<=i-1)
					
				{
					System.out.print(" ");
				}
			}
			System.out.println("*");

		}
	}

}
