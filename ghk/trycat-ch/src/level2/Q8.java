package level2;

import java.util.Scanner;

// �ݿø�
// 10���� ū ���̸� 1�� �ڸ����� �ݿø�, 100���� ū ���̸� 10�� �ڸ����� �ݿø�, ...
// �ݿø��� ����� ����Ѵ�.
// �Է� ����
// 99		15		123456
// ��� ����
// 100		20		100000

public class Q8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int logInput = (int) Math.log10(input);
		String inputStr = String.valueOf(input);
		try{
			switch(inputStr.charAt(1)){
			case '0': case '1': case '2': case '3': case '4':
				System.out.print(inputStr.charAt(0)); break;
			default:
				System.out.print(String.valueOf(Character.getNumericValue(inputStr.charAt(0))+1));
			}
			for(int i = 0; i < logInput; i++)
				System.out.print("0");
			scan.close();
		}catch(StringIndexOutOfBoundsException e){
			System.out.println(input);
		}
		scan.close();
	}
}
