package level1;

import java.util.Scanner;

// �ﰢ�� �Ǻ�
// �ﰢ���� �� ���� ���̰� �־��� ��, �����ﰢ������ �����ﰢ������ �а��ﰢ������ �Ǻ��Ͻÿ�.

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
			System.out.println("����");
		else if(longest*longest*2 > pita)
			System.out.println("�а�");
		else
			System.out.println("����");
		scan.close();
	}

}
