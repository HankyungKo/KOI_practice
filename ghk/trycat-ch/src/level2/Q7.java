package level2;

import java.util.Scanner;

// ������, ������, ���׼� �Ǻ��ϱ�
// �������� �ڽ��� ������ ����� ���� �ڽŰ� ���� ��, �������� ���� �ڽź��� ���� ��, ���׼��� ū ��
// �������̸� PERFECT, �������̸� DEFICIENT, ���׼��̸� ABUNDANT�� ����Ѵ�.
// �Է� ����
// 15					28					56
// ��� ���� (���ڴ� 5�ڸ� Ȯ�� �� �����ʿ� ���߾� ��� �� 2ĭ �����̽��� �� �� ���� ������ ���)
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
