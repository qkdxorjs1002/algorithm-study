package p2884;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(calc(sc.nextInt(), sc.nextInt()));
		sc.close();
	}

	public static String calc(int hour, int min) {
		min -= 45;
		if (min < 0) {
			min = 60 + min;
			hour--;
		}

		if (hour < 0) {
			hour = 24 + hour;
		}

		return String.valueOf(hour).concat(" ").concat(String.valueOf(min));
	}

}
 