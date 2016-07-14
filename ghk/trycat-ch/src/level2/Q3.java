package level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 닫힌 사각형
// 숫자를 네개 입력받고, 그 네개의 수가 사각형의 변의 길이가 될 때
// 그 숫자로 이룰 수 있는 직사각형 중에서 가장 큰 넓이를 구하시오.
// 입력 예시
// 1 2 3 4
// 출력 예시
// 3

public class Q3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> input = new ArrayList<>();
		for(int i=0; i < 4; i++)
			input.add(scan.nextInt());
		Collections.sort(input);
		System.out.println(input.get(0)*input.get(2));
		scan.close();
	}

}
