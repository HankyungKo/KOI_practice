#include <stdio.h>
/*  Write a program to print a histogram of the lengths of words in its input.
It is easy to draw the histogram with the bars horizontal; a vertical orientation is more challenging.*/

/* 음.. 단어들을 입력받아서 단어의 길이를 그래프화 하는 문제인것 같은데. */

/* 일단 숫자 갯수로 하라고 하셨으니까 숫자로 먼저 해봄. */

int main()
{
	int c, i, j;
	int ndigit[10];

	for ( i = 0; i <10; i++)
		ndigit[i] = 0;

	while ( ( c = getchar() ) != EOF ){
		if ( c >= '0' && c <= '9' )
			ndigit[c-'0']++;
	}
	
	for ( i = 0; i < 10; i++){
		printf("%d : ", i);
		for ( j = 0; j < ndigit[i]; j++ ){
			printf("-");
		}
		printf("\n");
	}
	return 0;
}

