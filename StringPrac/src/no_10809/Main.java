package no_10809;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		int arr[] = new int[26];
		for (int i = 0; i < 26; i++) // 알파벳 배열 세팅
			arr[i] = -1;

		for (int i = 0; i < str.length(); i++) {
			int idx = str.charAt(i) - 'a';
			if (arr[idx] == -1)
				arr[idx] = i;
		}
		
		for(int i = 0; i < 26; i++)
			System.out.print(arr[i]+" ");
	}

}
