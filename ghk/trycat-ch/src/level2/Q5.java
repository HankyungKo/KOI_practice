package level2;

import java.util.Scanner;

// ���� Ȥ�� �������� ���� 4���� �Էµȴ�.
// �������� ������� Ȯ���ϰ�,
// �Էµ� �� 4���� �� ���� �� 1���� ����Ѵ�.
// �Է¿���			�Է¿���2
// 1 2 3 4			1 2 4 8
// ��¿���			��¿���2
// 1 2 3 4 5		1 2 4 8 16

public class Q5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] input = new int [5];
		for( int i = 0 ; i < 4; i++)
			input[i] = scan.nextInt();
		if(input[3]-input[2] == input[1]-input[0])
			input[4] = input[3]*2-input[2];
		else
			input[4] = input[3]*input[3]/input[2];
		for(int i = 0; i < 5; i++)
			System.out.print(input[i]+" ");
		scan.close();
	}

}
