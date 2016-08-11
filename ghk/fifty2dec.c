#include <stdio.h>
#include <stdlib.h>

int getLength( char[] );
int getNumberFromChar( char );
char getCharFromNumber ( int );
int fifty2decimal( char[], int );
void decimal2fifty( int, char[] );
int powerOfFifty( int );

int main()
{
	char fifty_num1[] = "2pc";
	char fifty_num2[] = "2Z{";
	int len_result = getLength( fifty_num1 ) + getLength( fifty_num2 ) + 1;

	char *fifty_result = ( char* ) malloc(sizeof(char) * len_result);	
	
	int i = 0;
	for ( ; i < len_result; i++ ) {
		fifty_result[i] = 0;
	}

	int dec_num1 = fifty2decimal( fifty_num1, getLength(fifty_num1) );
	int dec_num2 = fifty2decimal( fifty_num2, getLength(fifty_num2) );

	int dec_result = dec_num1 * dec_num2;
	printf("Decimal : %d\n", dec_result);
	
	decimal2fifty( dec_result, fifty_result );
	printf("Fifty : ");
	for ( i = getLength(fifty_result) ; i >= 0; i-- ) {
		putchar(fifty_result[i]);
	}
	putchar('\n');
	
	free( fifty_result );
	return 0;
}

int getLength( char fifty[] )
{
	int len = 0;
	while ( fifty[len++] != 0 );
	return len - 1;
}

int getNumberFromChar( char c )
{
	char set[] = "M2GESymzJB4pv{gVFQWAb#_3jcPeN91fYTK}XkR[8Hh5I0UqZu";
	int i = 0;
	while ( set[i++] != c );
	return i - 1;
}

char getCharFromNumber( int num )
{
	char set[] = "M2GESymzJB4pv{gVFQWAb#_3jcPeN91fYTK}XkR[8Hh5I0UqZu";
	return set[num];
}

int fifty2decimal( char fifty[], int len )
{
	int i = len - 1, decimal = 0;
	for ( ; i >= 0; i-- ) {
		decimal += getNumberFromChar( fifty[i] ) * powerOfFifty( len - i - 1 );
	}
	return decimal;
}

void decimal2fifty( int num, char fifty[] )
{
	int i = 0;
	int divisor;
	while ( ( divisor = num / 50 ) != 0 ) {
		fifty[i++] = getCharFromNumber( num % 50 );
		num /= 50;
	}
	fifty[i] = getCharFromNumber( num );
}

int powerOfFifty( int exponential )
{
	int result = 1;
	while ( exponential-- > 0 ){
		result *= 50;
	}
	return result;
}
