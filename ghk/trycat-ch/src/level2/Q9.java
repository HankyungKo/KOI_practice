package level2;

import java.util.Scanner;

// 체스판 위의 개미
// 개미가 무한한 크기의 2차원 배열 위를 1초에 한칸씩 이동한다.
// 숫자를 하나 입력받고, 입력받은 숫자만큼의 시간이 흘렀을때 개미의 위치를 출력한다.
// 입력 예시
// 8		20			25
// 출력 예시
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
