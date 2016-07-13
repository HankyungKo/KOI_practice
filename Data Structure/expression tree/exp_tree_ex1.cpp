#include <iostream>
using namespace std;

struct node{
	char data;
	struct node *link;
};

class Stack{
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
		char pop(){
			char data;
			struct node *temp;
			if(top != NULL){
				temp = top;
				top = top->link;
				data = temp->data;
				delete temp;
			}
			return data;
		}
};

class Node{
private:
	friend class NodeManager;
	char Data;
	Node *Left;
	Node *Right;
public:
	Node(char input = ''){
		this->Left = NULL;
		this->Right = NULL;
		this->SetData(input);
	}
	virtual ~Node(){}
	virtual void SetData(char input){
		this->Data = input;
	}
};

class NodeManager{
private:
	Node *BinaryTree;
	Stack *post_expression;
public:
	NodeManager(Stack *post_expression = NULL){
		BinaryTree = NULL;
		this->post_expression = post_expression;
	}
	~NodeManager(){	}
	friend class Node;
	void start(){
		int choice = 0;
		while(choice!=4){
			cout << "1. 삽입  2. 삭제  3. 출력  4. 종료" << endl;
			cin >> choice;
			switch(choice){
				case 1:
					makeNode(BinaryTree); break;
				case 2:
					delNode(&BinaryTree); break;
				case 3:
					print(BinaryTree); break;
				case 4:
					delNode(&BinaryTree); return; break;
				default:
					cout << "잘못 선택하셨습니다." << endl;
			}
		}
	}
	void makeNode(Node *node = NULL){
		int addLine = 0;

		while(post_expression.top != NULL){
			if(BinaryTree == NULL){
				BinaryTree = new Node(post_expression.pop());
			}
			else{
			//	cout << "1. 왼쪽  2. 오른쪽" << endl;
			//	cin >> addLine;
				if(input == '+' || input == '-' || input == '*' || input == '/' ){
					BinaryTree->Right = new Node(post_expression.pop());
					if(post_expression.top == '+' || post_expression.top == '-' || post_expression.top == '*' || post_expression.top == '/'){
						continue;
					}
					else{
						BinaryTree
					}

				}
				switch(addLine){
					case 1:
						if(node->Left == NULL){
							node->Left = new Node();
						}
						else{
							cout << "해당 노드에 데이터가 있어서 왼쪽으로 이동" << endl;
							makeNode(node->Left, addLine);
						}
						break;
					case 2:
						if(node->Right == NULL){
							node->Right = new Node;
						}
						else{
							cout << "해당 노드에 데이터가 있어서 오른쪽으로 이동" << endl;
							makeNode(node->Right, addLine);
						}
						break;
					default:
						cout << "잘못 선택하셨습니다." << endl;
				}
			}
		}
	}
	void delNode(Node **node){
		if(*node == NULL){
			cout << "노드가 비었습니다." << endl;
		}
		else{
			delNode(&(*node)->Left);
			delNode(&(*node)->Right);
			cout << "데이터 : " << (*node)->Data << "삭제" << endl;
			delete(*node);
			(*node) = NULL;
		}
	}
	void print(Node *node){
		int printmode = 0;
		cout << "순회 방법을 선택하세요." << endl << "1. 전위 순회  2. 중위 순회  3. 후위 순회" << endl;
		cin >> printmode;
		switch(printmode){
			case 1:
				preorderTraversal(node); break;
			case 2:
				inorderTraversal(node); break;
			case 3:
				postorderTraversal(node); break;
			default:
				cout << "잘못 선택하셨습니다." << endl;
		}
	}
	void preorderTraversal(Node *node){
		if(node == NULL){
			return;
		}
		else{
			cout << node->Data << " ";
			preorderTraversal(node->Left);
			preorderTraversal(node->Right);
		}
	}
	void inorderTraversal(Node *node){
		if( node == NULL ){
			return;
		}
		else{
			inorderTraversal(node->Left);
			cout << node->Data << " ";
			inorderTraversal(node->Right);
		}
	}
	void postorderTraversal(Node *node){
		if( node == NULL ){
			return;
		}
		else{
			postorderTraversal(node->Left);
			postorderTraversal(node->Right);
			cout << node->Data << " ";
		}
	}
};

int main(){
	char input=' ';
	Stack postfix;
	Stack post_expression;
	while(input!='='){
		cin >> input;
		if(input>=49 && input<=57){
			post_expression.push(input);
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
				post_expression.push(postfix.pop());
			}
		}
		else if(input == 42 || input == 47){
			postfix.push(input);
		}
		else if(input == 43 || input == 45){
			if(postfix.top->data == 42 || postfix.top->data == 47){
				post_expression.push(postfix.pop());
			}
			else{
				postfix.push(input);
			}
		}
	}
	if(input == '='){
		while(postfix.top!=NULL){
			post_expression.push(postfix.pop());
		}
	}

	while(post_expression.top != NULL){

	}

	return 0;
}