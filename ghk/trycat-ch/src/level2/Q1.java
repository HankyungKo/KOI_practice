package level2;

import java.util.Scanner;

// �ΰ����� �ð�
// �丮�� �ð��� �ʴ����� �Է��Ͽ� ��ÿ� �������� ����س���.
// �Է¿���
// 14 30 0
// 200
// ��¿���
// 14 33 20

public class Q1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] input = new int[4];
		for(int i = 0; i < 4; i++)
			input[i] = scan.nextInt();
		input[2] += input[3];
		input[1] += input[2]/60;
		input[2] = input[2]%60;
		input[0] += input[1]/60;
		input[1] = input[1]%60;
		input[0] = input[0]%24;
		for(int i = 0; i < 3; i++)
			System.out.print(input[i]+" ");
		scan.close();
	}

}
