package no_1316;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		int cnt = N;

		for (int k = 0; k < N; k++) {
			
			String str = sc.nextLine();
			str = str + "_";
			int[] arr = new int[26];

			for (int i = 0; i < str.length() - 1; i++) {
				int idx = str.charAt(i) - 'a';
				int idx2 = str.charAt(i + 1) - 'a';

				if (idx == idx2)
					continue;
				else
					arr[idx]++;
			}

			for (int i = 0; i < 26; i++) {
				if (arr[i] > 1) {
					cnt--;
					break;
				}
			}
		}
		System.out.println(cnt);
	}

}
