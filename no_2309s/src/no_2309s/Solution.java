package no_2309s;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args)throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		int sub = 0;
		int arr[] = new int[9];
		for(int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			max += arr[i];
		}

		sub = max - 100;
		
		for(int i = 0; i < 9; i++) {
			for(int j = i+1; j < 8; j++) {
				if(arr[i]+arr[j] == sub) {
					arr[i] = 101;
					arr[j] = 101;
					break;
				}
			}
		}
		
		Arrays.sort(arr);
		
		for(int i = 0; i < 7; i++) 
			System.out.println(arr[i]);
	}

}
