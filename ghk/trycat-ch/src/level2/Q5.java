package level2;

import java.util.Scanner;

// 등차 혹은 등비수열인 수열 4개가 입력된다.
// 등차인지 등비인지 확인하고,
// 입력된 수 4개와 그 다음 수 1개를 출력한다.
// 입력예시			입력예시2
// 1 2 3 4			1 2 4 8
// 출력예시			출력예시2
// 1 2 3 4 5		1 2 4 8 16

public class Q5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] input = new int [5];
		for( int i = 0 ; i < 4; i++)
			input[i] = scan.nextInt();
		if(input[3]-input[2] == input[1]-input[0])
			input[4] = input[3]*2-input[2];
		else
			input[4] = input[3]*input[3]/input[2];
		for(int i = 0; i < 5; i++)
			System.out.print(input[i]+" ");
		scan.close();
	}

}
