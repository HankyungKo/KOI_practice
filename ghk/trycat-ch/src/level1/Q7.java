package level1;

import java.util.Scanner;

// 단어 뒤집기
// 단어들을 뒤집어 출력한다.
// 문자열을 입력받아 해당 문자열의 단어들을 역으로 출력하는 프로그램을 작성해보자.
// 입력 샘플
// 	hello world
// 출력 샘플
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
