package level1;

import java.util.Scanner;

// �ܾ� ������
// �ܾ���� ������ ����Ѵ�.
// ���ڿ��� �Է¹޾� �ش� ���ڿ��� �ܾ���� ������ ����ϴ� ���α׷��� �ۼ��غ���.
// �Է� ����
// 	hello world
// ��� ����
//	olleh dlrow

public class Q7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String [] words = input.split(" ");
		for(String each:words){
			for(int i = each.length()-1; i >= 0; i--){
				System.out.print(each.charAt(i));
			}
			System.out.print(" ");
		}
		scan.close();
	}

}
