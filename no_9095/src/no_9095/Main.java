package no_9095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[11];
		
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		for(int j = 4; j < 11; j++) {
				arr[j] = arr[j-3] + arr[j-2] + arr[j-1];
			}
		
		
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
				
			System.out.println(arr[n]);
		}
			
	}

}
