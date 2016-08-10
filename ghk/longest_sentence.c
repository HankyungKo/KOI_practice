#include <stdio.h>
// 한 라인씩 string을 입력받아, 가장 긴 string을 출력하는 프로그램을 작성하라.
// 한 라인의 최대 글자수는 1024.
// getchar() 와 putchar()를 사용하라.

int main()
{
	char arr[1024] = {'\0',};
	char buf[1024] = {'\0',};
	char input = '\0';
	int max = 0, count = 0, i = 0;
	while ( ( input = getchar() ) != EOF ) {
		if ( input != '\n' && count < 1024 ) {
			buf[count++] = input;
		}
		else if ( input == '\n' ) {
			if ( max < count ) {
				for ( i = 0; i < 1024; i++ ) {
					arr[i] = buf[i];
				}
				max = count;
			}
			count = 0;
		}	
	}
	for ( i = 0; i < max; i++ ) {
		putchar(arr[i]);
	}
	return 0;
}
