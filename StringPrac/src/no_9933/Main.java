package no_9933;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();
		int cnt = 0;
		String[] str = new String[N];

		char[] mid = new char[N];
		int[] idx = new int[N];

		for (int i = 0; i < N; i++) {
			str[i] = sc.nextLine();
			idx[i] = str[i].length() / 2;
			mid[i] = str[i].charAt(idx[i]);
		}

		for (int i = 0; i < N; i++) {
			for (int j = 1; j < N; j++) {
				if ((idx[i] == idx[j]) && (mid[i] == mid[j])) {
					cnt++;
					System.out.print(idx[i] + mid[i]);
					if (cnt == 2) {
						System.out.print((idx[i] * 2 + 1) + " " + mid[i]);

						break;
					}
				}
			}
		}

	}

}
