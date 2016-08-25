#include <stdio.h>
#include <stdlib.h>

void bruteforce( int, int, int, char[] );

int main()
{
	int size = 1;
	while ( size ) {

		char *output = (char*)malloc(sizeof(char)*size);
		bruteforce( size++, 0, 0, output );
	}
	return 0;
}

void bruteforce( int size, int index, int position, char output[] )
{
	int i = 0;
	char set[] = "abcdefghijklmnopqrstuvwxyz";
	
	output[position] = set[index];
	
	if ( size > position + 1 ) {
		bruteforce( size, 0, position + 1, output );
		if ( index < 25 ) {
			bruteforce( size, index + 1, position, output );
		}
	}
	else {
		for ( i = 0; i < size; i++ ) {
			printf("%c", output[i]);
		}
		printf("\n");
		if ( index < 25 ) {
			bruteforce( size, index + 1, position, output );
		}
	}


}
