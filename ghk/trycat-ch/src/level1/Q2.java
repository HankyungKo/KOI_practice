package level1;

import java.util.Scanner;

// ȭ���µ��� �����µ��� �ٲ��.
// ȭ���µ� ������ F, �����µ� ������ C�� �Ѵ�. ȭ���µ��� �Է��Ͽ� �װ��� �����µ��� ��ȯ�ϴ� ���⸦ ���α׷����϶�. 
// (��, ��ȯ ������ ������ ����. �����µ�(C) = (ȭ���µ�(F) - 30) / 2)

public class Q2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int f = Integer.parseInt(input.substring(0, input.length()-1));
		int c = (f-30)/2;
		System.out.printf("%dC", c);
		scan.close();
	}

}
