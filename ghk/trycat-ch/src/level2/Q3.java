package level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// ���� �簢��
// ���ڸ� �װ� �Է¹ް�, �� �װ��� ���� �簢���� ���� ���̰� �� ��
// �� ���ڷ� �̷� �� �ִ� ���簢�� �߿��� ���� ū ���̸� ���Ͻÿ�.
// �Է� ����
// 1 2 3 4
// ��� ����
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
