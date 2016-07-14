package level1;

import java.util.Scanner;

// 삼각형 판별
// 삼각형의 세 변의 길이가 주어질 때, 직각삼각형인지 예각삼각형인지 둔각삼각형인지 판별하시오.

public class Q8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] input = new int[3];
		for(int i = 0; i <3; i++){
			input[i] = scan.nextInt();
		}
		int longest = 0;
		for(int i = 0; i < 3; i++)
			longest = (longest <= input[i] ? input[i]: longest);
		int pita = 0;
		for(int i = 0; i < 3; i++)
			pita+= input[i]*input[i];
		if(longest*longest*2 == pita)
			System.out.println("직각");
		else if(longest*longest*2 > pita)
			System.out.println("둔각");
		else
			System.out.println("예각");
		scan.close();
	}

}
