package level2;

import java.util.Scanner;

// 수영장 가는날
// 월, 수, 금 마다 수영장에 간다고 할 때
// 1에서 7 사이의 자연수를 입력하고, 수영장 가는 날이면 enjoy를, 아니면 oops를 출력한다.

public class Q2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		switch(input){
		case 1: case 3: case 5:
			System.out.println("enjoy"); break;
		case 2: case 4: case 6: case 7:
			System.out.println("oops");
		}
		scan.close();
	}

}
