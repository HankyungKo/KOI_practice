package level2;

import java.util.Scanner;

// 반올림
// 10보다 큰 수이면 1의 자리에서 반올림, 100보다 큰 수이면 10의 자리에서 반올림, ...
// 반올림한 결과를 출력한다.
// 입력 예시
// 99		15		123456
// 출력 예시
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
