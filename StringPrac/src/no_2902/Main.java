package no_2902;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		StringTokenizer tk = new StringTokenizer(str, "-");
		
		while(tk.hasMoreTokens()) {
			String[] tmp = new String[tk.countTokens()];
			
			for(int i = 0; i < tk.countTokens(); i++) {
				tmp[i] = tk.nextToken();
				System.out.print(tmp[i].charAt(0));
			}
		}
	}

}
