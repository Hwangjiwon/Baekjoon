package no_1100;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String[] str = new String[8];
		char[][] ck = new char[8][8];

		int cnt = 0;

		for (int i = 0; i < 8; i++) {
			str[i] = sc.nextLine();
			for (int j = 0; j < 8; j++)
				ck[i][j] = str[i].charAt(j);
		}

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (i % 2 == 0 && j % 2 == 0) {
					if (ck[i][j] == 'F')
						cnt++;
				} else if (i % 2 == 1 && j % 2 == 1) {
					if (ck[i][j] == 'F')
						cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
