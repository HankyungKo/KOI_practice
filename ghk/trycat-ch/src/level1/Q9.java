package level1;

import java.util.Scanner;

// 완전 제곱 수
// 하나의 자연수가 입력으로 주어졌을 때 그 수와 가까운 완전제곱수를 찾아 출력한다.

// lambda식으로 풀면 좋을 것 같은데 java lambda 아직 잘 모르겠음.

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
