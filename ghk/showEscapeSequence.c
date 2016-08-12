// Write a function escape(s, t) that converts characters like newline and tab
// into visible escape sequences like \n and \t as it copies the string t to s.
// Use a switch. Write a function for the other direction as well,
// converting escape sequences into the real characters.

#include <stdio.h>
#define MAXLINE 1000

void escape ( char[], char[] );

int main()
{
        char prev_str[MAXLINE] = {0, };
        char after_str[MAXLINE] = {0, };
        char c;
        int i = 0;

        while ( ( c = getchar() ) != EOF ) {
                prev_str[i++] = c;
        }
        escape(prev_str, after_str);

        printf("%s\n", after_str);
        return 0;
}

void escape ( char prev_str[], char after_str[] )
{
        int i = 0, j = 0;
        while ( prev_str[i++] != 0 ) {
                switch( prev_str[i - 1] ) {
                case '\n': after_str[j++] = '\\'; after_str[j++] = 'n'; break;
                case '\t': after_str[j++] = '\\'; after_str[j++] = 't'; break;
                default: after_str[j++] = prev_str[i - 1];
                }
        }
}
