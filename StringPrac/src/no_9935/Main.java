package no_9935;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String tok = sc.nextLine();

		while (true) {
			if (str.contains(tok)) { // 일치하는 토큰있으면 대체
				str = str.replaceAll(tok, "");
				continue;
			} else { // 일치하는 토큰 없으면 출력

				if (str.equals("")) { // 어떤 문자도 안남아 있으면 FRULA
					System.out.println("FRULA");
				} else
					System.out.println(str);

			}
		}
	}
}
