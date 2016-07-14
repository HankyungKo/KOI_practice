package level1;

import java.util.ArrayList;
import java.util.Scanner;

// 정수를 입력받아 2진수로 변환한다.

public class Q3 {

	public static void main(String[] args) {
		char c = '5';
		int d = (int)c;
		System.out.println(d);
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		ArrayList<Integer> lists = new ArrayList<>();
		while(input/2 != 0){
			lists.add(input%2);
			input/=2;
		}
		lists.add(input);
		for(int i = 0; i <lists.size(); i++){
			System.out.print(lists.get(lists.size()-i-1));
		}	
		scan.close();
	}

}
