package no_1032;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();
		
		String str = sc.nextLine(); 
		char[] arr = new char[str.length()];
		char[] result = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) { // ���� ���ϸ�, ��� �ѱ��ھ� �迭�� ����
			arr[i] = str.charAt(i);
			result[i] = str.charAt(i);
		}		
		
		for(int i = 0; i < N-1; i++) {
			String next = sc.nextLine();
			char[] tmp = new char[str.length()];
			
			for(int j = 0; j < str.length(); j++) { // ���� ���ϸ� �ѱ��ھ� �迭�� ����
				tmp[j] = next.charAt(j);
				if(tmp[j] != arr[j]) result[j] = '?';
			}
		}
		
		for(int i = 0; i < str.length(); i++)
			System.out.print(result[i]);
	}

}
