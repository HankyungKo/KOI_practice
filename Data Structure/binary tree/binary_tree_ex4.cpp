#include <iostream>
using namespace std;

class Node{
private:
	friend class NodeManager;
	int Data;
	Node *Left;
	Node *Right;
public:
	Node(){
		this->Left = NULL;
		this->Right = NULL;
		this->SetData();
	}
	virtual ~Node(){}
	virtual void SetData(){
		cout << "저장할 점수를 입력해주세요" << endl;
		cin >> this->Data;
	}
};

class NodeManager{
private:
	Node *BinaryTree;
public:
	NodeManager(){
		BinaryTree = NULL;
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
	void makeNode(Node *node = NULL, int addLine = 0){
		if(BinaryTree == NULL){
			BinaryTree = new Node;
		}
		else{
			cout << "1. 왼쪽  2. 오른쪽" << endl;
			cin >> addLine;
			switch(addLine){
				case 1:
					if(node->Left == NULL){
						node->Left = new Node;
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
	NodeManager nodeManager;
	nodeManager.start();
	return 0;
}