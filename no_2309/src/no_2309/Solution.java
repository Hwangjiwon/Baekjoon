package no_2309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		while (true) {
			if (br.readLine()!=null) break;
			max += Integer.parseInt(br.readLine());
		}
		
		System.out.println("max: "+max);
	}

}
