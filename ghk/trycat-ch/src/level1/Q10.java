package level1;

import java.util.Scanner;

// ���� �� ���ڿ��� ã�ƺ���.
// ������ ���� ���� ���ڿ��� �Է¹޾� �� ���ڿ��� �� ���� �� ���ڿ��� ã�� ����϶�.

public class Q10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String [] words = input.trim().split(", ");
		int length = 0, count = 0;
		for(int i = 0;i < words.length; i++){
			if(length<words[i].length()){
				length = words[i].length();
				count = i;
			}
		}
		System.out.println(words[count]);
		scan.close();
	}

}
