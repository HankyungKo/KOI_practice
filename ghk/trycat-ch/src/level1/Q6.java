package level1;

import java.util.Scanner;

// ���ڴ�
// ���ڿ��� ������ �������� ��ȯ�Ͽ� ����Ѵ�.

public class Q6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		char c = input.charAt(0);
		int count = 0;
		for(int i = 0; i < input.length(); i++){
			if(c == input.charAt(i))
				count++;
			else if(c != input.charAt(i)){
				System.out.printf("%d%c", count, c);
				c = input.charAt(i);
				count = 1;
			}
		}
		System.out.printf("%d%c",count, c);
		scan.close();
	}

}
