package no_10808;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int arr[] = new int[26];
		
		
		for(int i = 0; i < str.length(); i++) {
			int idx = str.charAt(i)-'a';
			arr[idx]++;
		}
		
		for(int i = 0; i < 26; i++)
			System.out.print(arr[i]+" ");
	}

}
