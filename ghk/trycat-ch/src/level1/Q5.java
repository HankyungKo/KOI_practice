package level1;

import java.util.Scanner;

// 소수찾기2
// 두 실수를 입력받고, 입력 받은 두 수 사이의 모든 소수를 찾아서 출력한다.
// 출력값 사이는 공백문자로 구분한다.

public class Q5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double start = scan.nextDouble();
		double end = scan.nextDouble();
		for(int i = (int)start+1; i < end; i++){
			for(int pivot = 2; pivot < i; pivot++){
				if(i%pivot == 0)
					break;
				else if(i == pivot+1)
					System.out.print(i+" ");
			}
		}
		
		scan.close();
	}

}
