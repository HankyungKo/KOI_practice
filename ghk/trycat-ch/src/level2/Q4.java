package level2;

import java.util.Scanner;

// ���̺�
// 2�� 2���� ���̺��� �־����� 4���� ���ڰ� �־�����.
// A  B
// C  D
// ���̺��� ���� A/C+B/D �̴�.
// �ð���� 90���� ȸ���ϸ鼭 ���̺��� ���� ���� �� ���� ū ���� ������ ���� �ּ� ȸ�� ���� ���Ѵ�.
// �Է� ����
// 1 2
// 3 4
// ��� ����
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
