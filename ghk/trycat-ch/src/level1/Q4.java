package level1;

import java.util.Scanner;

public class Q4 {

	// �Ʒ��� �Ǻ���ġ �⺻ �ڵ�.
	// lambda �̿��ؼ� �ѹ� �� Ǯ����� �ҵ�.
	
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
