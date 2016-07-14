package level1;

import java.util.Scanner;

public class Q4 {

	// 아래는 피보나치 기본 코드.
	// lambda 이용해서 한번 더 풀어봐야 할듯.
	
	static int fibo(int n){
		if(n == 1 || n == 2){
			return 1;
		}
		else{
			return fibo(n-1)+fibo(n-2);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		System.out.println(fibo(input));
		scan.close();
	}

}
