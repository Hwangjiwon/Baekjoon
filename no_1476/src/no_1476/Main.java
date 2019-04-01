package no_1476;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int tc = st.countTokens();
		
		int Y[] = new int[3];
		int E = 1,S = 1,M = 1, year = 1;
		for(int i = 0; i < tc; i++) {
			Y[i] = Integer.parseInt(st.nextToken());
		}
		
		while(true) {			
			if((E == Y[0]) && (S == Y[1]) && (M == Y[2]))
				break;
		
			E++; S++; M++;
			year++;
			
			if(E == 16) E = 1;
			if(S == 29) S = 1;
			if(M == 20) M = 1;
			
		}
		System.out.println(year);
	}

}
