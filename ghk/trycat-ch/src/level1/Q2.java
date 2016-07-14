package level1;

import java.util.Scanner;

// 화씨온도를 섭씨온도로 바꿔라.
// 화씨온도 단위를 F, 섭씨온도 단위를 C라 한다. 화씨온도를 입력하여 그값을 섭씨온도로 변환하는 계산기를 프로그래밍하라. 
// (단, 변환 공식은 다음과 같다. 섭씨온도(C) = (화씨온도(F) - 30) / 2)

public class Q2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int f = Integer.parseInt(input.substring(0, input.length()-1));
		int c = (f-30)/2;
		System.out.printf("%dC", c);
		scan.close();
	}

}
