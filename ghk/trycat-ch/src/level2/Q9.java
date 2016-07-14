package level2;

import java.util.Scanner;

// ü���� ���� ����
// ���̰� ������ ũ���� 2���� �迭 ���� 1�ʿ� ��ĭ�� �̵��Ѵ�.
// ���ڸ� �ϳ� �Է¹ް�, �Է¹��� ���ڸ�ŭ�� �ð��� �귶���� ������ ��ġ�� ����Ѵ�.
// �Է� ����
// 8		20			25
// ��� ����
// 2 3		5 4			1 5

public class Q9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int rootOfInput = (int)Math.sqrt(input);
		int x=1, y = 1;
		int distance = Math.abs(input-rootOfInput*rootOfInput);
		if(distance == 0){
			if(rootOfInput%2 == 0){
				x = rootOfInput; 
				y = 1;
			}
			else{
				x = 1;
				y = rootOfInput;
			}
		}
		else{
			if(rootOfInput%2 == 0){
				x = rootOfInput+1;
				y = 0;
				for(int i = 0; i <= rootOfInput; i++){
					if(i==distance)
						break;
					y++;
				}
				for(int i = rootOfInput+2; i<=distance; i++ ){
					x--;
				}
			}
			else{
				x = 0;
				y = rootOfInput+1;
				for(int i = 0; i <= rootOfInput; i++){
					if(i == distance)
						break;
					x++;
				}
				for(int i = rootOfInput+2; i<=distance; i++)
					y--;
			}
		}
		System.out.println(x+" "+y);
		scan.close();
	}
}
