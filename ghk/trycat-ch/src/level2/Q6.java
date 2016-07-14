package level2;

import java.util.Scanner;

// 버스
// 내가 버스를 타고 가고 있고, 옆으로 버스가 한 대 지나간다.
// 지나친 버스의 방향과 두 버스의 배차간격이 주어지고, 다음에 버스와 몇 분 뒤에 만날지 계산한다.
// 동일한 방향으로 가고 있다면 1을, 마주보는 방향으로 가고 있다면 0을 입력한다.
// 만약 마주치지 못한다면 "-1"을 출력해주자.
// 입력 예시
// 1 15 13			0 15 15			1 15 15
// 출력 예시
// 97.50			7.50			-1

public class Q6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] input = new int [3];
		for(int i = 0; i < 3; i++)
			input[i] = scan.nextInt();
		if(input[0] == 1 && input[1]!=input[2]){
			int bigger = input[1]>input[2]?1:2;
			int smaller = input[1]>input[2]?2:1;
			System.out.println((double)input[bigger]*input[smaller]/(input[bigger]-input[smaller]));
		}
		else if(input[0] == 1 && input[1] == input[2])
			System.out.println("-1");
		else if(input[0] == 0 && input[1] != input[2]){
			int bigger = input[1]>=input[2]?1:2;
			int smaller = input[1]>=input[2]?2:1;
			System.out.println((double)input[smaller]/(input[bigger]-input[smaller]));
		}	
		else
			System.out.println((double)input[1]/2);
		scan.close();
	}

}
