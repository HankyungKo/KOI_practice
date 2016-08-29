#include <stdio.h>
#define ARR_SIZE 3

int matrix_multiple( int [][ARR_SIZE], int [][ARR_SIZE], int, int );

int main()
{
	int input1[ARR_SIZE][ARR_SIZE] = {0,}, input2[ARR_SIZE][ARR_SIZE] = {0,};
	int output[ARR_SIZE][ARR_SIZE] = {0,};
	int i = 0, j = 0;
	
	for ( i =  0 ; i < ARR_SIZE; i++ ) {
		for ( j = 0 ; j < ARR_SIZE; j++ ) {
			scanf("%d", &input1[i][j]);
		}
	}
	for ( i = 0; i < ARR_SIZE; i++ ) {
		for ( j = 0; j < ARR_SIZE; j++ ) {
			scanf("%d", &input2[i][j]);
		}
	}

	for ( i = 0; i < ARR_SIZE; i++ ) {
		for ( j = 0; j < ARR_SIZE; j++ ) {
			output[i][j] = matrix_multiple( input1, input2, i, j );
		}
	}

	for ( i = 0; i < ARR_SIZE; i++ ) {
		for ( j = 0; j < ARR_SIZE; j++ ) {
			printf("%d ", output[i][j]);
		}
		printf("\n");
	}

	return 0;
}

int matrix_multiple( int input1[][ARR_SIZE], int input2[][ARR_SIZE], int row, int col)
{
	int i = 0;
	int result = 0;
	for ( ; i < ARR_SIZE; i++ ) {
		result += input1[row][i] * input2[i][col];
	}
	return result;
}

