package no_9935;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String tok = sc.nextLine();

		while (true) {
			if (str.contains(tok)) { // ��ġ�ϴ� ��ū������ ��ü
				str = str.replaceAll(tok, "");
				continue;
			} else { // ��ġ�ϴ� ��ū ������ ���

				if (str.equals("")) { // � ���ڵ� �ȳ��� ������ FRULA
					System.out.println("FRULA");
				} else
					System.out.println(str);

			}
		}
	}
}
