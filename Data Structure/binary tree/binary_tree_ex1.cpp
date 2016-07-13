#include <iostream>
using namespace std;

// Define a structure to be used as the tree node
struct node{
    int key;
    node *left;
    node *right;
};

class BinaryTree{
    private:
        node *root;

    public:
        BinaryTree(){
        	root = NULL;
        }
        ~BinaryTree(){
        	clearTree(root);
        }
        bool isEmpty(){
        	return(root==NULL);
        }
        node *SearchTree(int key){
        	bool valueInTree = false;
        	node *temp;
        	temp = root;
        	while((temp!=NULL)&&(temp->key!=key)){
        		if(key<temp->key)
        			temp = temp->left;	// search key comes before this node.
        		else
        			temp = temp->right;	// search key comes after this node.
        	}
        	if(temp==NULL)
        		return temp;			// search key not found.
        	else
        		return dupNode(temp);	// found it so return a duplicate.
        }
        void insert(node *newNode){
        	node *temp;
        	node *back;
        	temp = root;
        	back = NULL;
        	while(temp!=NULL){
        		back = temp;
        		if(newNode->key < temp->key)
        			temp = temp->left;
        		else
        			temp = temp->right;
        	}
        	if(back==NULL){				// attach as a root node in a new tree
        		root = newNode;
        	}
        	else{
        		if(newNode->key < back->key)
        			back->left = newNode;
        		else
        			back->right = newNode;
        	}
        }
        void insert(int key){
        	node *newNode;
        	newNode = new node();
        	newNode->key = key;
        	newNode->left = newNode->right = NULL;
        	insert(newNode);
        }
        int delete(int key){
        	node *back;
        	node *temp;
        	node *delParent;			// Parent of node to delete.
        	node *delNode;
        	temp = root;
        	back = NULL;
        	// find the node to delete
        	while((temp!=NULL)&&(key!=temp->key)){
        		back = temp;
        		if(key < temp->key)
        			temp = temp->left;
        		else
        			temp = temp->right;
        	}
        	if(temp == NULL){
        		cout << "Key not found. Nothing deleted."<< endl;
        	}
        }
        void printOne(node *T);
        void printTree();
    private:
        void clearTree(node *t){
        	if(t==NULL)
        		return;
        	if(t->left != NULL)
        		clearTree(t->left);
        	if(t->right != NULL)
        		clearTree(t->right);
        	delete t;
        }
        node *dupNode(node *t){
        	node *dupNode;
        	dupNode = new node();
        	*dupNode = *t;
        	dupNode->left = NULL;
        	dupNode->right = NULL;
        	return dupNode;
        }
        void printAll(node *t);
};