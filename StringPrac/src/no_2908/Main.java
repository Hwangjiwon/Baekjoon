package no_2908;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int[] a_arr = new int[3];
		int[] b_arr = new int[3];
		
		for(int i = 0; i < 3; i++) {
			a_arr[i] = a % 10;
			b_arr[i] = b % 10;
			
			a /= 10;
			b /= 10;
		}
		
		a = a_arr[0]*100 + a_arr[1]*10 + a_arr[2];
		b = b_arr[0]*100 + b_arr[1]*10 + b_arr[2];
		
		if(a > b)System.out.println(a);
		else System.out.println(b);
		
	}

}
