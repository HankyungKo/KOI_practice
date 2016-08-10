#include <stdio.h>

int main()
{
	int fahr, celsius;
	int upper = 50, lower = -20, step = 5;

	celsius = lower;
	
	printf( "Cel\tFahr\n" );

	while ( celsius <= upper ) {
		fahr = celsius * 9 / 5 + 32;
		printf( "%d\t%d\n", celsius, fahr );
		celsius = celsius + step;

	}
	return 0;
}
