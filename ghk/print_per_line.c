#include <stdio.h>
// Write a program that prints its input one word per line.

int main()
{
	char c;
	
	while ( (c = getchar()) != EOF ) {
		if ( c != ' ' && c != '\t' && c != '\n' ) {
			putchar(c);
		}
		else {
			putchar('\n');
		}
	}
	return 0;
}
