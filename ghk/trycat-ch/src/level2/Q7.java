package level2;

import java.util.Scanner;

// 완전수, 부족수, 과잉수 판별하기
// 완전수란 자신을 제외한 약수의 합이 자신과 같은 수, 부족수는 합이 자신보다 작은 수, 과잉수는 큰 수
// 완전수이면 PERFECT, 부족수이면 DEFICIENT, 과잉수이면 ABUNDANT를 출력한다.
// 입력 예시
// 15					28					56
// 출력 예시 (숫자는 5자리 확보 후 오른쪽에 맞추어 출력 후 2칸 스페이스를 준 후 수의 종류를 출력)
//    15  DEFICIENT		   28  PERFECT		   56 ABUNDANT

public class Q7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int sum = 0;
		for(int pivot = 1; pivot < input; pivot++){
			if(input%pivot == 0)
				sum+= pivot;
		}
		System.out.printf("%5d  ", input);
		if(sum==input)
			System.out.print("PERFECT");
		else if(sum < input)
			System.out.println("DEFICIENT");
		else
			System.out.println("ABUNDANT");
		scan.close();
	}

}
