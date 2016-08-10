#include <stdio.h>

int getnumber(char[]);
int char2int(int, char[]);
int power(int);

int main()
{
        char input1[10] = {'\0', };
        char input2[10] = {'\0', };
        int num1 = 0, num2 = 0;
	
	num1 = char2int(getnumber(input1), input1);
	num2 = char2int(getnumber(input2), input2);

	printf("%d", num1 + num2);

	return 0;
}

int getnumber(char input[])
{
	char c = 0;
	int i = 0;
	while ( (c = getchar()) != EOF && c != ' ' && c != '\n' && c != '\t' ) {
		input[i++] = c;
	} 
	return i - 1;
}


int char2int(int len, char input[])
{
	int i, num = 0;
	for ( i = len; i >= 0; i-- ) {
		num += (int)(input[i] - 48) * power(len-i);
	}
	return num;
}

int power(int num)
{
	int output = 1, i;
	for ( i = 0; i < num; i++ ) {
		output *= 10;
	}
	return output;
}
