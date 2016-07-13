#include <iostream>
using namespace std;

struct node{
	char data;
	struct node *link;
};

class stack{

	public:
		struct node *top;
		stack(){
			top = NULL;
		}
		void push(char value){
			struct node *ptr;
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
			if(top != NULL){
				temp = top;
				top = top->link;
				delete temp;
			}
		}
};

int main(){
	char input=' ';
	stack postfix;
	while(input!='='){
		cin >> input;
		if(input>=49 && input<=57){
			cout << input << ' ';
		}
		else if(input == 40){
			postfix.push(input);
		}
		else if(input == 41){
			while(postfix.top!=NULL){
				if(postfix.top->data == 40){
					postfix.pop();
					break;
				}
				cout << postfix.top->data << ' ';
				postfix.pop();
			}
		}
		else if(input == 42 || input == 47){
			postfix.push(input);
		}
		else if(input == 43 || input == 45){
			if(postfix.top->data == 42 || postfix.top->data == 47){
				cout << postfix.top->data << ' ';
				postfix.pop();
				cout << input << ' ';
			}
			else{
				postfix.push(input);
			}
		}
	}
	if(input == '='){
		while(postfix.top!=NULL){
			cout << postfix.top->data << ' ';
			postfix.pop();
		}
	}
	return 0;
}