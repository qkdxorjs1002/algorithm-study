package p2839;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(calc(input));
		sc.close();
	}

	public static int calc(int input) {
		int result = -1;

		for (int five = input / 5; five >= 0; five--) {
			int rest = input - (5 * five);

			if (rest % 3 == 0) {
				
				return (five + (rest / 3));
			}
		}

		return result;
	}

}
 