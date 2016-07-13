#include <iostream>
using namespace std;

class Node{
private:
	char Data;
	class Node* left;
	class Node* right;	
public:
	Node(char Data){this->Data=Data; left=NULL; right=NULL;}
	void setLeft(Node* left){this->left=left;}
	void setRight(Node* right){this->right=right;}
	char getData(){return Data;}
	Node* getLeft(){return left;}
	Node* getRight(){return right;}
};

class Tree{
private:
	Node* root;
public:
	Tree(){root=NULL;}
	Tree(Node* root){this->root=root;}
//	void newRoot(Node* root){this->root=root;}
	void inputData(char input){

	}
	void PreorderPrint(Node* Leaf){
		if(Leaf!=NULL){
			cout<<Leaf->getData()<<" ";
			PreorderPrint(Leaf->getLeft());
			PreorderPrint(Leaf->getRight());
		}
	}
	void InorderPrint(Node* Leaf){
		if(Leaf!=NULL){
			InorderPrint(Leaf->getLeft());
			cout<<Leaf->getData()<<" ";
			InorderPrint(Leaf->getRight());
		}
	}
	void PostorderPrint(Node* Leaf){
		if(Leaf!=NULL){
			PostorderPrint(Leaf->getLeft());
			PostorderPrint(Leaf->getRight());
			cout<<Leaf->getData()<<" ";
		}
	}
};

int main(){
	Node A('A'), B('B'), C('C'), D('D'), E('E'), F('F'), G('G'), H('H'), I('I');
	Tree tree(&A);

	A.setLeft(&B);
	B.setLeft(&D);
	D.setLeft(&H);
	D.setRight(&I);
	B.setRight(&E);
	A.setRight(&C);
	C.setLeft(&F);
	C.setRight(&G);

	cout<<"전위순회(Preorder Traversal): "<<endl;
	tree.PreorderPrint(&A);

	cout<<endl<<"중위순회(Inorder Traversal): "<<endl;
	tree.InorderPrint(&A);

	cout<<endl<< "후외순회(Postorder Traversal): "<<endl;
	tree.PostorderPrint(&A);
	cout<<endl;
	return 0;
}