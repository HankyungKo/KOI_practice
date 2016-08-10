#include <stdio.h>
#define MAXLINE 1000

void reverse(char line[], int len);
int getline_(char line[], int maxline);

int main()
{
	int len;
	char line[MAXLINE];
	while ( (len = getline_(line, MAXLINE)) ) {
		reverse(line, len);
	}
	return 0;
}

void reverse(char line[], int len)
{
	int i;
	for ( i = len - 1; i >= 0; i-- ) {
		putchar(line[i]);
	}
}

int getline_(char line[], int maxline)
{
	int c, i;
	for ( i = 0; i < maxline - 1 && ( c = getchar()) != EOF && c != '\n'; i++ ){
		line[i] = c;
	}
	if ( c == '\n' ){
		line[i++] = c;
	}
	line[i] = '\0';
	return i;
}

