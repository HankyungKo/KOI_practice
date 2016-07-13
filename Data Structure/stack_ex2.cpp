#include <iostream>
using namespace std;

struct node{
	int data;
	struct node *link;
};

class stack{
	struct node *top;
	public:
		stack(){
			top = NULL;
		}
		void push(){
			int value;
			struct node *ptr;
			cin >> value;
			ptr = new node;
			ptr->data = value;
			ptr->link = NULL;
			if(top!= NULL){
				ptr->link = top;
			}
			top = ptr;
		}
		void pop(){
			struct node *temp;
			if(top == NULL){
				cout << " 스택이 비었습니다."<< endl;
				break;
			}
			temp = top;
			top = top->link;
			cout << temp->data << endl;
			delete temp;
		}
		void print(){
			struct node *ptr1=top;
			while(ptr1 != NULL){
				cout << ptr1->data << " ";
				ptr1 = ptr1->link;
			}
			cout << endl;
		}
};

int main(){
	stack s;
	int choice;
	while(1){
		cout << "1) push 2) pop 3) print 4) end" << endl;
		cin >> choice;
		switch(choice){
			case 1:
				s.push();
				break;
			case 2:
				s.pop();
				break;
			case 3:
				s.print();
				break;
			case 4:
				return 0;
			default:
				cout << "다시 입력해 주세요."<< endl;
		}
	}
	return 0;
}





