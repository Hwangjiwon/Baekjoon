package no_11656;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String[] tok = new String[str.length()];
		
		tok[0] = str;
		for(int i = 1; i < str.length(); i++) {
			tok[i] = str.substring(i);
		}
		
		Arrays.sort(tok);
		
		for(int i = 0; i < str.length(); i++)
			System.out.println(tok[i]);
	}

}
