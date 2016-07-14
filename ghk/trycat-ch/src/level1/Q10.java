package level1;

import java.util.Scanner;

// 가장 긴 문자열을 찾아보자.
// 임의의 여러 개의 문자열을 입력받아 그 문자열들 중 가장 긴 문자열을 찾아 출력하라.

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
