package level1;

import java.util.Scanner;

// ���� ���� ��
// �ϳ��� �ڿ����� �Է����� �־����� �� �� ���� ����� ������������ ã�� ����Ѵ�.

// lambda������ Ǯ�� ���� �� ������ java lambda ���� �� �𸣰���.

public class Q9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int rootOfInput = (int)Math.sqrt(input);
		int distance = Math.abs(input-rootOfInput*rootOfInput);
		if(distance<=Math.abs(input-(rootOfInput+1)*(rootOfInput+1)))
			System.out.println(rootOfInput*rootOfInput);
		else
			System.out.println((rootOfInput+1)*(rootOfInput+1));
		scan.close();
	}
}
