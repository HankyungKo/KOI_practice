package level2;

import java.util.Scanner;

// ����
// ���� ������ Ÿ�� ���� �ְ�, ������ ������ �� �� ��������.
// ����ģ ������ ����� �� ������ ���������� �־�����, ������ ������ �� �� �ڿ� ������ ����Ѵ�.
// ������ �������� ���� �ִٸ� 1��, ���ֺ��� �������� ���� �ִٸ� 0�� �Է��Ѵ�.
// ���� ����ġ�� ���Ѵٸ� "-1"�� ���������.
// �Է� ����
// 1 15 13			0 15 15			1 15 15
// ��� ����
// 97.50			7.50			-1

public class Q6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] input = new int [3];
		for(int i = 0; i < 3; i++)
			input[i] = scan.nextInt();
		if(input[0] == 1 && input[1]!=input[2]){
			int bigger = input[1]>input[2]?1:2;
			int smaller = input[1]>input[2]?2:1;
			System.out.println((double)input[bigger]*input[smaller]/(input[bigger]-input[smaller]));
		}
		else if(input[0] == 1 && input[1] == input[2])
			System.out.println("-1");
		else if(input[0] == 0 && input[1] != input[2]){
			int bigger = input[1]>=input[2]?1:2;
			int smaller = input[1]>=input[2]?2:1;
			System.out.println((double)input[smaller]/(input[bigger]-input[smaller]));
		}	
		else
			System.out.println((double)input[1]/2);
		scan.close();
	}

}
