package level2;

import java.util.Scanner;

// 테이블
// 2행 2열의 테이블이 주어지고 4개의 숫자가 주어진다.
// A  B
// C  D
// 테이블의 값은 A/C+B/D 이다.
// 시계방향 90도씩 회전하면서 테이블의 값을 구할 때 가장 큰 값이 나오기 위한 최소 회전 수를 구한다.
// 입력 예시
// 1 2
// 3 4
// 출력 예시
// 2

public class Q4 {
	static void turn(int [][] table){
		int temp = table[0][0];
		table[0][0] = table[1][0];
		table[1][0] = table[1][1];
		table[1][1] = table[0][1];
		table[0][1] = temp;
	}
	static double value(int[][] table){
		return (double)table[0][0]/table[1][0]+table[1][0]/table[1][1];
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [][] table = new int[2][2];
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++)
				table[i][j] = scan.nextInt();
		}
		int count = 0;
		double bigValue = value(table);
		for(int i = 1; i<4; i++){
			turn(table);
			if(bigValue < value(table)){
				bigValue = value(table);
				count = i;
			}
		}
		System.out.println(count);
		scan.close();
	}

}
