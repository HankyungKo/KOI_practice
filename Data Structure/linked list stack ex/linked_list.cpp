#include <iostream>
using namespace std;

struct node{
	int data;
	struct node *link;
};

int main(){
	struct node item1, item2, item3;
	item1.data = 100;
	item2.data = 300;
	item3.data = 200;
	item1.link = item2.link = item3.link = NULL;

	item1.link = &item3;
	item3.link = &item2;

	cout << "item1.data : " << item1.data << endl;
	cout << "item3.data : " << item1.link->data << endl;
	cout << "item2.data : " << item1.link->link->data << endl;
	
}