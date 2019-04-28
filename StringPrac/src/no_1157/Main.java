package no_1157;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		int arr[] = new int[26];
		
		for(int i = 0; i < str.length(); i++) {
			int idx = Character.toUpperCase(str.charAt(i)) - 'A';
			arr[idx]++;
		}
		
		int max = -1;
		char answer = '?';
		
		for(int i = 0; i < 26; i++) {
			if(arr[i] > max){
				max = arr[i];
				answer = (char)(i+'A');
			} else if(arr[i] == max)
				answer = '?';
		}
		
		System.out.println(answer);
	}
}
