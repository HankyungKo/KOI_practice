package level1;

import java.util.Scanner;

// �Ҽ�ã��2
// �� �Ǽ��� �Է¹ް�, �Է� ���� �� �� ������ ��� �Ҽ��� ã�Ƽ� ����Ѵ�.
// ��°� ���̴� ���鹮�ڷ� �����Ѵ�.

public class Q5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double start = scan.nextDouble();
		double end = scan.nextDouble();
		for(int i = (int)start+1; i < end; i++){
			for(int pivot = 2; pivot < i; pivot++){
				if(i%pivot == 0)
					break;
				else if(i == pivot+1)
					System.out.print(i+" ");
			}
		}
		
		scan.close();
	}

}
