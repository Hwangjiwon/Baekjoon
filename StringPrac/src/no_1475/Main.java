package no_1475;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String room = sc.nextLine();

		int set = 1;
		int[] arr = { 1, 1, 1, 1, 1, 1, 2, 1, 1 };

		for (int i = 0; i < room.length(); i++) {
			int idx = room.charAt(i) - '0';
			if (idx == 9)
				idx = 6;

			if (arr[idx] == 0) {
				set++;
				for (int j = 0; j < arr.length; j++) {
					if (j == 6)
						arr[j] += 2;
					else
						arr[j]++;
				}
				arr[idx]--;
			}

			else arr[idx]--;
		}

		System.out.println(set);
	}

}
