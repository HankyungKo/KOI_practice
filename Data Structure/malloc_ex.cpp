#include <stdio.h>
#include <iostream>
using namespace std;

int main(){
	int n;

	cout << "몇개를 입력하겠습니까?";
	cin >> n;

	int *arr = new int[n];
	for (int i = 0; i < n; i++){
		cout << i+1 << "번째 입력 : ";
		cin >> arr[i]; 
	}
	for (int i = 0; i < n; i++)
		cout << arr[i] << ' ';
	cout << endl;
	delete arr;
	return 0;
}