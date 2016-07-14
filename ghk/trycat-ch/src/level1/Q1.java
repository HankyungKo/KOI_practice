package level1;

import java.util.Scanner;

// 다이아몬드 모양 출력

public class Q1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int input = scan.nextInt();
			for( int i = 1; i <= input/2; i++){
				for(int j = 0; j < (i*(-1)+input/2+1); j++)
					System.out.print(" ");
				for(int j = 0; j < (2*i-1); j++)
					System.out.print("*");
				System.out.println();
			}
			for( int i = 0; i <= input/2; i++){
				for(int j = 0; j < i; j++)
					System.out.print(" ");
				for(int j = 0; j < input-2*i; j++)
					System.out.print("*");
				System.out.println();
			}
		}
		scan.close();
	}

}
