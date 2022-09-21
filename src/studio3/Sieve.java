package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print ("n? ");
		int n = in.nextInt();
		boolean [] numbers = new boolean[n];
		for (int i = 2; i < n;i++) {
			for(int k = 2; k <= n/2; k++) {
				if(i > k) {
					if(i%k==0) {
						numbers[i]=true;
					}
				}
			}
		}
		for (int i = 2;i< n; i++) {
			if (numbers[i] == false) {
				System.out.print(i + " ");
			}
		}
				
	}

}
