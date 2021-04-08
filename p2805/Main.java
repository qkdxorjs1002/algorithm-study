package p2805;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int inputLength = scanner.nextInt();
		int inputHeight = scanner.nextInt();
		int[] woods = new int[inputLength];

		int start = 0;
		int end = 0;
		int result = 0;

		for (int idx = 0; idx < inputLength; idx++) {
			woods[idx] = scanner.nextInt();
			end = Math.max(end, woods[idx]);
		}
		scanner.close();

		while (start <= end) {
			int center = (end + start) / 2;
			long diff = 0;

			for (int idx = 0; idx < inputLength; idx++) {
				if (woods[idx] > center) {
					diff += woods[idx] - center;
				}
			}

			if (diff > inputHeight) {
				start = center + 1;
				result = center;
			} else if (diff < inputHeight) {
				end = center - 1;
			} else {
				result = center;
				break;
			}
		}

		System.out.println(result);
	}
	
}
