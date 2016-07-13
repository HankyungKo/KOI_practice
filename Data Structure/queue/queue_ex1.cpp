#include <iostream>
using namespace std;

struct node{
	int data;
	struct node *link;
};

class queue{
	struct node *front;
	struct node *rear;
	public:
		queue(){
			rear = NULL;
			front = NULL;
		}
		void enqueue(int value){
			struct node *ptr;
			ptr = new node;
			ptr->data = value;
			ptr->link = NULL;
			if(rear!= NULL){
				rear->link = ptr;
			}
			if(front == NULL){
				front = ptr;
			}
			rear = ptr;ㅊ
		}
		void dequeue(){
			struct node *temp;
			if(front == NULL){
				cout << "큐가 비었습니다."<< endl;
			}
			temp = front;
			front = front->link;
			cout << temp->data << endl;
			delete temp;
		}
		void print(){
			struct node *ptr1=front;
			while(ptr1 != NULL){
				cout << ptr1->data << " ";
				ptr1 = ptr1->link;
			}
			cout << endl;
		}
};

int main(){
	queue q;
	int choice;
	while(1){
		cout << "1) enqueue 2) dequeue 3) print 4) end" << endl;
		cin >> choice;
		switch(choice){
			case 1:
				int input;
				cin >> input;
				q.enqueue(input);
				break;
			case 2:
				q.dequeue();
				break;
			case 3:
				q.print();
				break;
			case 4:
				return 0;
			default:
				cout << "다시 입력해 주세요."<< endl;
		}
	}
	return 0;
}





