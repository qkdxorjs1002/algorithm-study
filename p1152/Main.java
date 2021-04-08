package p1152;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		int count = 0;

		int previous = -1;
		while (true) {
			int read = System.in.read();

			if (read == -1) {
				break;
			}

			if ((previous == -1 || previous == 32) && read >= 65 && read <= 122) {
				count++;
			}

			previous = read;
		}

		System.out.println(count);
	}

}
