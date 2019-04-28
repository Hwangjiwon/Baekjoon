package no_10988;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		char[] s = new char[str.length()];
		int ck = 1;

		for (int i = 0; i < str.length(); i++)
			s[i] = str.charAt(i);

		// È¦¼ölenÀÏ¶§(len/2)+1 Àº »©°í °Ë»ç
		// Â¦¼ölenÀÏ¶§

		if (str.length() % 2 == 0) {
			for (int i = 0, j = str.length()-1; i < (str.length()/2); i++, j--) {
				if (s[i] != s[j]) {
					ck = 0;
					break;
				}
			}
		} else {
			for (int i = 0, j = str.length()-1; i < (str.length()/2)-1; i++, j--) {
				if (s[i] != s[j]) {
					ck = 0;
					break;
				}
			}
		}
		System.out.println(ck);
	}

}
