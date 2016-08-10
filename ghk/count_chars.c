#include <stdio.h>
// Write a program to print a histogram of the frequencies of different characters in its input.

int main()
{
	int i = 0;
	char c = 0;
	char input[52];

	for ( i = 0; i < 52; i++ )
		input[i] = 0;

	while ( ( c = getchar() ) != EOF ) {
		if( c >= 65 && c <= 90 ){
			input[c - 'A']++;
		}
		else if ( c >= 97 && c <= 122 ) {
			input[c - 71]++;
		}
	}

	for ( i = 0; i < 26; i++ ) 
		printf("%c : %d\n", i+65, input[i]);
	for ( i = 26; i < 52; i++ )
		printf("%c : %d\n", i+71, input[i]);

	return 0;
}
