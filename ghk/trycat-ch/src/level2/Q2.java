package level2;

import java.util.Scanner;

// ������ ���³�
// ��, ��, �� ���� �����忡 ���ٰ� �� ��
// 1���� 7 ������ �ڿ����� �Է��ϰ�, ������ ���� ���̸� enjoy��, �ƴϸ� oops�� ����Ѵ�.

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
