#include <iostream>
#include <iomanip>
using namespace std;

class stack{
	private:
		int nArray[10];
		int top;
	public:
		stack(){
			top = -1;
		}
		void push(int data){
			if(top <= 8){
				nArray[++top] = data;	
			}
			else{
				cout << "더이상 들어갈 곳이 없습니다." << endl;
			}

		}
		int pop(){
			if(top == -1){
				cout << "스택이 비었습니다." << endl;
				return 0;
			}
			cout << nArray[top--] << endl;
			return nArray[top];
		}
		void print(){
			for (int i = 0; i <= top; i++){
				cout << nArray[i] << " ";
			}
			cout << endl;
		}
	
};

int main(){
	
	stack s1;
	int choice;
	int pushNum = 0;

	do{
	cout << "1) push\t2) pop\t3) print\t4) end" << endl;
	cin >> choice;

	switch(choice){
		case 1:
			cout << "숫자를 입력하세용 : ";
			cin >> pushNum;
			s1.push(pushNum);
			break;
		case 2:
			s1.pop();
			break;
		case 3:
			s1.print();
			break;
		case 4:
			return 0;
		default:
			cout << "다시 입력하세요."<< endl;
	}
	}while(choice != 4);

	return 0;

}